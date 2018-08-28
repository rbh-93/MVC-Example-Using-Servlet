package mvc.example;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId, password;
		userId = request.getParameter("userId");
		password = request.getParameter("password");

		LoginService loginService = new LoginService();
		boolean authSuccess = loginService.autheticate(userId, password);

		if (authSuccess) {
			User user = loginService.getUserData(userId);
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("SuccessPage.jsp");
			dispatcher.forward(request, response);
			return;
		} else {
			response.sendRedirect("LoginPage.jsp");
			return;
		}

	}

}

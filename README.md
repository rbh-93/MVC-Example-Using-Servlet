# MVC-Example-Using-Servlet

# Model-View-Controller Architecture

Model View Controller is a software architecture pattern which separates the application logic into three different parts. Separation of concerns increases modularity and reuse. The three parts are Model, View and Controller. 

- Model: The Model is the data and business logic. 
- View: The View defines how the data should be presented to the user. It is a User Interface allowing the user to modify the data.
- Controller: When the user interacts with the view, the user sends requests. These requests are handled by the Controller which displays appropriate data along with view as response to the user.

# Implementation details

- LoginPage.jsp: Initial page for Login for the user. This page serves as the View of MVC. LoginPage.jsp asks the user for User ID and Password.
- Success.jsp: This is also part of the View. Upon successful login, the user is redirected to this page informing the user of a successful login.
- LoginController.java: The LoginController Servlet is the Controller of MVC and it handles user requests by passing these requests to the LoginService class. 
- LoginService.java: The LoginService is the MOdel of MVC and it contains the business logic. When the user request is passed to the LoginService, it either redirects the user to Success.jsp page if authentication is successful or to the initial Login.jsp page if authentication fails. The LoginService class contains a dummy user list (User ID and corresponding User Names) implemented using Hashmap and a dummy password authetication method. 
- User.java: This class contains the getters and setters for the User ID and User Name.

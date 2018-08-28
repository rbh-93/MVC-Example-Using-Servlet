# MVC-Example-Using-Servlet

# Example of Model-View-Controller Architecture

# DESCRIPTION

The initial page is the LoginPage JSP which serves as the View.
The Login JSP asks the user for a User ID and Password.
The Controller of MVC is implemented using a servlet.
The LoginController Servlet passes the user request to the LoginService class which contains the business logic.
The business logic in this case is a dummy password authentication method and a method to get user data. 
A user list is also implemented in the LoginService class using a Hashmap. The user list contains the User IDs and the corresponding User Names. 
If password authetication fails, the user is redirected to the initial Login JSP.
Otherwise, the user is redirected to the SuccessPage JSP which displays the User Name. 
The User Class contains the getters and setters for the User ID and User Name. 

# MVC RCHITECTURE AND DATA FLOW

The LoginService contains the business logic which constitutes of the Model, the JSPs are the View and the LoginController Servlet is the Controller of MVC. The data flows from the user to the Controller, which passes it to the Service class. The Service class then gives the response back to the Controller based on the user request. Based on this response the required View is generated for the user (in this case the LoginPage JSP and the SuccessPage JSP).

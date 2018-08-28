# MVC-Example-Using-Servlet
A demo Login Page to illustrate MVC Architecture

-----This is an example of Model-View-Controller Architecture-----

The initial page is the Login JSP which serves as the View.
The Login JSP asks the user for a User ID and Password.
The Controller of MVC is implemented using a servlet.
The LoginController Servlet passes the user request to the LoginService class which contains the business logic.
The business logic in this case is a dummy password authentication method and a method to get user data. 
A user list is also implemented in the LoginService class using a Hashmap. The user list contains the User IDs and the corresponding User Names. 
If password authetication fails, the user is redirected to the initial Login JSP.
Otherwise, the user is redirected to the SuccessPage JSP which displays the User Name. 
The User Class contains the getters and setters for the User ID and User Name. 


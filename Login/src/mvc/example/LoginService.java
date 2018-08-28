package mvc.example;

import java.util.HashMap;

public class LoginService {

	HashMap<String, String> userList = new HashMap<String, String>();

	public LoginService() {
		userList.put("user1", "User1");
		userList.put("user2", "User2");
		userList.put("user3", "User3");
	}

	public boolean autheticate(String userId, String password) {

		// dummy password authentication method
		if (password == null || password.trim().isEmpty())
			return false;
		else
			return true;

	}

	// dummy method to get User Data
	public User getUserData(String userId) {
		User user = new User();
		user.setUserName(userList.get(userId));
		user.setUserId(userId);
		return user;
	}

}

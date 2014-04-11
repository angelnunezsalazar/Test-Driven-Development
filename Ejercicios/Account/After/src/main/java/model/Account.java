package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Account {

	Map<String, String> users = new HashMap<String, String>();

	public String create(String user, String password) {
		if (password.length() < 6)
			return "Invalid Password";
		if (!isValid(password))
			return "Invalid Password";

		users.put(user, password);
		return "Account Created";
	}

	private boolean isValid(String password) {
		boolean isValid = false;
		for (Character c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				isValid = true;
				break;
			}
		}
		return isValid;
	}

	public boolean logIn(String user, String password) {
		String passwordSaved = users.get(user);
		if (passwordSaved != null && passwordSaved.equals(password))
			return true;
		else
			return false;

	}
}

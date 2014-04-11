package model;

import java.util.HashMap;
import java.util.Map;

public class Account {

	Map<String, String> users = new HashMap<String, String>();

	public String create(String user, String password) {
		users.put(user, password);
		return "Account Created";
	}
	
	
	public boolean logIn(String user, String password) {
		String passwordSaved = users.get(user);
		if (passwordSaved!=null && passwordSaved.equals(password))
			return true;
		else
			return false;

	}
}

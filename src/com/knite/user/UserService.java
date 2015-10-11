package com.knite.user;

import java.util.HashMap;
import java.util.Map;

public class UserService {
	private static final Map<Integer, User> users = new HashMap<Integer, User>();
	
	public static void addUser(User user) {
		users.put(user.getId(), user);
	}
}

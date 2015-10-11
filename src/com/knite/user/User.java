package com.knite.user;

public final class User {

	private final int id;
	private final String firstName;
	private final String lastName;
	
	public User(String firstName, String lastName) {
		this.id = NUM_USERS++;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}
	
	private static int NUM_USERS = 0;
}

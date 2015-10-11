package com.knite.course;


public final class Course {

	private final String name;
	private final int series;
	private final int id;
	
	public Course(String name, int series) {
		this.id = COURSES++;
		this.name = name;
		this.series = series;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return this.id;
	}
	
	public int getSeries() {
		return series;
	}

	private static int COURSES = 0;
}

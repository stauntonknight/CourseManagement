package com.knite.series;

import java.util.Set;
import java.util.TreeSet;

import com.knite.course.Course;

public class Series {
	
	private final int id;
	private final String name;
	private final Set<Integer> courses;
	
	public Series(int id, String name) {
		this.id = id;
		this.name = name;
		courses = new TreeSet<Integer>();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void addCourse(Course c) {
		courses.add(c.getId());
	}

	public Set<Integer> getCourses() {
		return courses;
	}
}

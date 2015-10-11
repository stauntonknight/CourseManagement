package com.knite.course;

import java.util.HashMap;
import java.util.Map;

public class CourseService {
	private static final Map<Integer, Course> courseService = new HashMap<Integer, Course>();
	public static void addCourse(Course c) {
		courseService.put(c.getId(), c);
	}
	
	public static Course getCourse(int cid) {
		return courseService.get(cid);
	}
}

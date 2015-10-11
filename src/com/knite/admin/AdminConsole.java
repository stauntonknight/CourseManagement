package com.knite.admin;

import java.util.Set;

import com.knite.SeriesSubscriptionService;
import com.knite.course.Course;
import com.knite.course.CourseService;
import com.knite.series.Series;
import com.knite.series.SeriesService;
import com.knite.user.User;
import com.knite.user.UserService;

public class AdminConsole {
	
	public static void addUser(User user) {
		UserService.addUser(user);
	}
	
	public static void addCourse(Course c) {
		CourseService.addCourse(c);
	}
	
	public static void addSeries(Series s) {
		SeriesService.addSeries(s);
	}
	
	public static void addUserToSeries(User user, Series series) {
	    SeriesSubscriptionService.addUserToSeries(user, series);
	}
	
	public static Set<Integer> getUsersForCourse(Course c) {
		return SeriesSubscriptionService.getUsersForSeries(c.getSeries());
	}
}

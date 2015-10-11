package com.knite.client;

import java.util.Set;

import com.knite.course.Course;
import com.knite.series.Series;

public interface ClientIface {

	Set<Course> getCourses(int userId);
	
	Set<Series> searchSeries(String word);
}

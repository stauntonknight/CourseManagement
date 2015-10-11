package com.knite.client;

import java.util.Set;
import java.util.TreeSet;

import com.knite.SeriesSubscriptionService;
import com.knite.course.Course;
import com.knite.course.CourseService;
import com.knite.series.Series;
import com.knite.series.SeriesService;

public class ClientImpl implements ClientIface {
	@Override
	public Set<Course> getCourses(int userId) {
		Set<Integer> courseIds = new TreeSet<Integer>();
		Set<Integer> seriesForUser = SeriesSubscriptionService.getSeriesForUser(userId);
		for (Integer seriesId : seriesForUser) {
			Series series = SeriesService.getSeries(seriesId);
			courseIds.addAll(series.getCourses());
		}
		Set<Course> courses = new TreeSet<Course>();
		for (int cid : courseIds) {
			courses.add(CourseService.getCourse(cid));
		}
		return courses;
	}
	
	public Set<Series> searchSeries(String word) {
		return SeriesService.searchAllSeries(word);
	}
}

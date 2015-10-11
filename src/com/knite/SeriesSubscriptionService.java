package com.knite;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.knite.series.Series;
import com.knite.user.User;

public class SeriesSubscriptionService {

	private static final Map<Integer, Set<Integer>> userToSeries = new HashMap<Integer, Set<Integer>>();
	private static final Map<Integer, Set<Integer>> seriesToUser = new HashMap<Integer, Set<Integer>>();
	
	public static void addUserToSeries(User u, Series s) {
		addToMap(userToSeries, u.getId(), s.getId());
		addToMap(seriesToUser, s.getId(), u.getId());
	}
	
	private static void addToMap(Map<Integer, Set<Integer>> map, int key, int val) {
		Set<Integer> values  = map.get(key);
		if (values == null) {
			values = new TreeSet<Integer>();
			userToSeries.put(key, values);
		}
		values.add(val);
	}
	
	public static Set<Integer> getUsersForSeries(int seriesId) {
		return seriesToUser.get(seriesId);
	}
	
	public static Set<Integer> getSeriesForUser(int userId) {
		return userToSeries.get(userId);
	}
}

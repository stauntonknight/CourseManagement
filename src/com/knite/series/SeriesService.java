package com.knite.series;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SeriesService {
	private static final Map<Integer, Series> seriesService = new HashMap<Integer, Series>();
	private static final Map<String, TreeSet<Integer>> reverseMap = new HashMap<String, TreeSet<Integer>>();
	
	public static void addSeries(Series s) {
		seriesService.put(s.getId(), s);
		for (String word : s.getName().split(" ")) {
			TreeSet<Integer> seriesIds = reverseMap.get(word);
			if (seriesIds == null) {
				seriesIds = new TreeSet<Integer>();
				reverseMap.put(word, seriesIds);
			}
			seriesIds.add(s.getId());
		}
	}

	public static Series getSeries(Integer seriesId) {
		return seriesService.get(seriesId);
	}
	
	public static Set<Series> searchAllSeries(String word) {
		TreeSet<Integer> seriesIds = reverseMap.get(word);
		Set<Series> series = new TreeSet<Series>();
		if (seriesIds == null) {
			return series;
		}
		for (int id : seriesIds) {
			series.add(seriesService.get(id));
		}
		return series;
	}
}

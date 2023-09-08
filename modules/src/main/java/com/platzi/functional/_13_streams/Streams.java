package com.platzi.functional._13_streams;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		List<String> courses = NamesUtils.getList("Java", "Javascript", "SQL", "CSS");
		for (String course : courses) {
			System.out.println("Course: " + course);
		}

		Stream<String> coursesStream = Stream.of("Java", "Javascript", "SQL", "CSS");

		Stream<Integer> coursesLengthStream = coursesStream.map(String::length);
		Optional<Integer> longestCourse = coursesLengthStream.max((x, y) -> y - x);
		System.out.println("Longest course: " + (longestCourse.orElseGet(() -> 0)) );
	}
}

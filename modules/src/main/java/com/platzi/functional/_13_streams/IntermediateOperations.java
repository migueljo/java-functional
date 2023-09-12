package com.platzi.functional._13_streams;

import java.util.stream.Stream;

public class IntermediateOperations {
	public static void main(String[] args) {
		Stream<String> initialCourses = Stream.of("Java", "Spring", "Node.JS");
		Stream<Integer> lettersOnCourses = initialCourses.map(String::length);
		Stream<Integer> evenLengthCourses = lettersOnCourses.filter(c -> c % 2 == 0);
	}
}

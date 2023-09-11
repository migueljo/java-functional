package com.platzi.functional._13_streams;

import java.util.stream.Stream;

public class Operations {
	public static void main(String[] args) {
		Stream<Integer> streamNumbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 11);
		boolean biggerThanTen = streamNumbers.anyMatch(n -> n > 10);
		System.out.println("Is there any number bigger than 10? " + biggerThanTen);

		Stream<Integer> streamNumbers2 = Stream.of(19, 21, 35, 45, 12);
		boolean allLegalDrinkingAge = streamNumbers2.allMatch(n -> n >= 18);
		System.out.println("All legal drinking ages?" + allLegalDrinkingAge);

		Stream<Integer> streamNumbers3 = Stream.of(1, 3, 5, 7, 9, 11);
		boolean allAreOdd = streamNumbers3.noneMatch(n -> n % 2 == 0);
		System.out.println("Are all odds? " + allAreOdd);
	}
}

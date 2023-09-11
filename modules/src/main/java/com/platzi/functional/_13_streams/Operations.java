package com.platzi.functional._13_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		Stream<Integer> streamNumbers4 = numbers.stream();
		Optional<Integer> first = streamNumbers4.findFirst();
		System.out.println("First element is: " + (first.orElse(null)));

		Stream<Integer> streamNumbers5 = numbers.stream();
		Optional<Integer> first2 = streamNumbers5.findAny();
		System.out.println("First element is: " + (first.orElse(null)));

		List<Long> bigNumbers = Arrays.asList(100L, 200L, 300L, 1000L, 5L);
		Stream<Long> bigNumbersStream = bigNumbers.stream();
		Optional<Long> minValue = bigNumbersStream.min((x, y) -> (int)Math.min(x, y));
		System.out.println("Min value is: " + minValue.orElse(null));

		Stream<Long> bigNumbers2 = bigNumbers.stream();
		Optional<Long> maxValue = bigNumbers2.max((x, y) -> (int)Math.max(x, y));
		System.out.println("Max value is: " + maxValue.orElse(null));

		Stream<String> aLongStoryStream = Stream.of("Se", "vende: ", "zapatos", "de", "bebé", "sin", "usar");
		Optional<String> longStoryOptional = aLongStoryStream.reduce((acc, curr) -> acc + " " + curr);
		longStoryOptional.ifPresent(System.out::println);

		Stream<Integer> firstTenNumbersStream = Stream.iterate(0, i -> i + 1).limit(10);
		Integer sumOfFirstTen = firstTenNumbersStream.reduce(0, Integer::sum);
		System.out.println("Total: " + sumOfFirstTen);

		Stream<String> aLongStoryStreamAgain = Stream.of("Cuando", "despertó,", "el", "dinosaurio", "todavía", "estaba", "allí.");
		int charCount = aLongStoryStreamAgain.reduce(0, (count, word) -> count + word.length(), Integer::sum);
		System.out.println("Character count: " + charCount);
	}
}

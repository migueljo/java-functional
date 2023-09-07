package com.platzi.functional._12_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {
	public static void main(String[] args) {
		List<String> names = getNames();

		Optional<List<String>> optionalNames = getOptionalNames();
		System.out.println("List length: " + (optionalNames.map(List::size).orElse(0)));
		optionalNames.ifPresent(nameList -> nameList.forEach(System.out::println));

		System.out.println("////////////////////////////");

		Optional<List<String>> optionalNames2 = getOptionalNames();
		System.out.println("List length: " + (optionalNames2.map(List::size).orElse(0)));
		if (optionalNames2.isPresent()) {
			optionalNames2.get().forEach(System.out::println);
		}

		Optional<String> mvp = getOptionalMVP();
		System.out.println("The MVP is: " + mvp.orElseGet(() -> "Andrés"));;
	}

	static List<String> getNames() {
		List<String> list = new LinkedList<>();
		return Collections.emptyList();
	}

	static String getMVP() {
		return null;
	}

	static int mostExpensiveItem() {
		return -1;
	}

	static Optional<List<String>> getOptionalNames() {
		// Simulate some condition where you may or may not have a String value
		boolean hasString = Math.random() > 0.1;

		if (hasString) {
			List<String> list = new LinkedList<>();
			list.add("One");
			list.add("Two");
			list.add("Three");
			return Optional.of(list); // Return a non-null value
		} else {
			return Optional.empty(); // Return an empty Optional to indicate the absence of a value
		}
	}

	static Optional<String> getOptionalMVP() {
		try {
			return Optional.of("Miguel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Optional.empty();
	}

}

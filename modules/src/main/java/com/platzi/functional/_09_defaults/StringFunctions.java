package com.platzi.functional._09_defaults;

public class StringFunctions {
	@FunctionalInterface
	interface StringOperation {
		Integer getLength();
		default void operate(String text) {
			Integer x = getLength();
			System.out.println("X = " + x);
			while (x-- > 0) {
				System.out.println(text);
			}
		}
	}

	@FunctionalInterface
	interface DoOperation {
		void take(String text);

		default void execute(Integer x, String text) {
			while (x-- > 0) {
				take(text);
			}
		}
	}

	public static void main(String[] args) {
		StringOperation randomNumber = () -> 4;
		randomNumber.operate("Alumno");

		DoOperation operation = (text) -> System.out.println("Text is: " + text);
		operation.execute(5, "Miguel");
	}
}

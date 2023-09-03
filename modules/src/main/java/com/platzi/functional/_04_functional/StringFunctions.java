package com.platzi.functional._04_functional;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
	public static void main(String[] args) {
		UnaryOperator<String> quote = text -> "\"" + text + "\"";
		UnaryOperator<String> addMark = text -> text + "!";
		UnaryOperator<String> addQuestionMark = text -> text + "?";

		System.out.println(quote.apply("Strong"));
		System.out.println(addMark.apply("This is really cool"));
		System.out.println(addQuestionMark.apply("Are you Vin"));

		BiFunction<Integer, Integer, Integer> multiplication = (x, y) -> x * y;
		BinaryOperator<Integer> multiplication2 = (x, y) -> x * y;

		System.out.println("2 * 2 is= " + multiplication.apply(2, 2));
		System.out.println("5 * 7 is= " + multiplication2.apply(5, 7));

		BiFunction<String, Integer, String> leftPad = (text, pad) -> {
			return String.format("%" + pad + "s", text);
		};

		System.out.println(leftPad.apply("Miguel", 15));
		System.out.println(String.format("%15s", "Miguel"));
	}
}

package com.platzi.functional._04_functional;

import java.util.function.Function;

public class MathFunctions {
	public static void main(String[] args) {
		System.out.println("Hola Platzi");
		Function<Integer, Integer> square = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return x * x;
			}
		};
		System.out.println(square.apply(5));;
		System.out.println(square.apply(35));;

		Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
		System.out.println("3 is odd? " + isOdd.apply(3));
	}
}

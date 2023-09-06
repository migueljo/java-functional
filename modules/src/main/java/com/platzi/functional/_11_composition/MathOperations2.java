package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
	public static void main(String[] args) {
		Function<Integer, Integer> multiplyBy3 = x -> x * 3;
		Function<Integer, Integer> add1MultiplyBy3 =
						multiplyBy3.compose(y -> {
							System.out.println("Add 1 to: " + y);
							return y + 1;
						});
		Function<Integer, Integer> add3MultiplyBy3 = y -> {
			return multiplyBy3.apply(y + 3);
		};
		System.out.println(add1MultiplyBy3.apply(10));
		System.out.println(add3MultiplyBy3.apply(10));
	}
}

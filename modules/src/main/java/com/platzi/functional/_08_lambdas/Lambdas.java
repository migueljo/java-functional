package com.platzi.functional._08_lambdas;

import com.platzi.functional._06_reference_operator.NamesUtils;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Lambdas {
	public static void main(String[] args) {
		List<String> courses = NamesUtils.getList("Java", "Kotlin");

		courses.forEach(c -> System.out.println(c));
		useZero(() -> 2);

		usePredicate(t -> !t.isEmpty());
		usePredicate(t -> !t.isEmpty());

		useBiFunction((x, y) -> x * y);
		useBiFunction((x, y) -> {
			System.out.println("X: " + x + " Y:" + y);
			return x * y;
		});

		// Does not get any args and does not return anything
		useNothing(() -> {});
	}

	static void useZero(ZeroArguments zeroArguments) {
		System.out.println("Use zero: " + zeroArguments.get());
	}

	static void usePredicate(@NotNull Predicate<String> predicate) {
		if (predicate.test("Not empty")) {
			System.out.println("Predicate is true");
		} else {
			System.out.println("Predicate is false");
		}
	}

	static void useBiFunction(BiFunction<Integer, Integer, Integer> operation) {
		System.out.println(operation.apply(3, 4));
	}

	static void useNothing(NothingOperator nothing) {
		nothing.nothing();
	}

	@FunctionalInterface
	interface  ZeroArguments {
		int get();
	}

	@FunctionalInterface
	interface NothingOperator {
		void nothing();
	}
}

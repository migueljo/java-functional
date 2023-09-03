package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

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
		System.out.println("4 is odd? " + isOdd.apply(4));

		Predicate<Integer> isEven = x -> !isOdd.apply(x);
		System.out.println("122 is even? " + isEven.test(122));
		System.out.println("121 is even? " + isEven.test(121));

		Student miguel = new Student(9);

		Predicate<Student> hasApproved = student -> student.getGrade() >= 6.0;

		System.out.println("Has student approved? " + hasApproved.test(miguel));
	}

	static class Student {
		private double grade;

		public Student(double grade) {
			this.grade = grade;
		}

		public double getGrade() {
			return grade;
		}
	}
}

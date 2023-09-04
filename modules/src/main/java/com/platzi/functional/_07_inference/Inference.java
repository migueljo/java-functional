package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.function.Function;

public class Inference {
	public static void main(String[] args) {
		Function<Integer, String> convert = integer -> "Al doble: " + (integer * 2);

		List<String> students = NamesUtils.getList("Miguel", "Andrés", "Caro");

		students.forEach(name -> System.out.println("The student name is: " + name));
	}
}

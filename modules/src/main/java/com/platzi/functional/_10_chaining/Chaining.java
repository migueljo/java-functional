package com.platzi.functional._10_chaining;

public class Chaining {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hola ")
						.append("Mundo ")
						.append(":) ")
						.append("adios.");
		System.out.println(stringBuilder);
	}
}

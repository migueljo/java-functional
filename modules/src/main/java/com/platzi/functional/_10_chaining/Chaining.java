package com.platzi.functional._10_chaining;

public class Chaining {
	public static void main(String[] args) {
		String stringBuilder = "Hola " +
						"Mundo " +
						":) " +
						"adios.";
		System.out.println(stringBuilder);

		Chainer chainer = new Chainer();
		chainer.sayHi().sayBye().sayHi().sayBye();
	}

	static class Chainer {
		public Chainer sayHi() {
			System.out.println("Hi!");
			return this;
		}

		public Chainer sayBye() {
			System.out.println("Bye!");
			return this;
		}
	}
}

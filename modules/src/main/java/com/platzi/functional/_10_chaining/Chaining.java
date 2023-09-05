package com.platzi.functional._10_chaining;

public class Chaining {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hola ")
						.append("Mundo ")
						.append(":) ")
						.append("adios.");
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

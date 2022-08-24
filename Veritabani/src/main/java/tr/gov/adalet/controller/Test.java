package tr.gov.adalet.controller;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[] isimler = { "Ali", "Veli", "Mahmut", "Ayşe", "Kazım" };
		Arrays.stream(isimler).parallel().peek(Test::peek).peek(Test::peek2)
				.forEach(System.out::println);
	}

	private static String peek(String isim) {
		System.out.println("peek" + isim);
		return isim;
	}

	private static String peek2(String isim) {
		System.out.println("peek2" + isim);
		return isim;
	}
}

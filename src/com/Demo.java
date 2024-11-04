package com;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		Optional<String> mystr1 = Optional.empty();
		System.out.println(mystr1);
		Optional mystr2 = Optional.of(1);
		System.out.println(mystr2.get());
		Optional mystr3 = Optional.ofNullable("second");
		System.out.println(mystr3);
		if (mystr3.isPresent()) {
			System.out.println("not null" + mystr3.get());
		} else {
			System.out.println("null");
		}
	}

}

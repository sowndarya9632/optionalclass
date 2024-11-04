package com;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	         numbers.parallelStream()
	                .map(n -> n * n)
	                .toList().forEach(System.out::println);
	}

}

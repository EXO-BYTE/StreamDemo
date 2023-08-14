package com.mystream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.iterate(2, n -> n + 1).filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0)).limit(20).forEach(System.out::println);
	}

}

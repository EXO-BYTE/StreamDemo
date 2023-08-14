package com.mystream;

public class PrimeDemo {
	Stream.rangeClosed(2, 100).filter(n -> Stream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0)).forEach(System.out::println);
}

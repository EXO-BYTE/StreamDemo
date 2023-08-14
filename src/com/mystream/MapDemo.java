package com.mystream;
import java.util.stream.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> s=Stream.of(12,23,14,16,45,78);
		s.map((e)->e*e).forEach(System.out::println);

	}

}

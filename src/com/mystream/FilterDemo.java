package com.mystream;
import java.util.stream.*;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> s =Stream.of(1,34,21,34,67,88,11,23);
		//s.filter((e)->e>20).forEach(System.out::println);
		//System.out.println(s.findAny().get());
		System.out.println(s.findFirst().get());
		
		
	}

}

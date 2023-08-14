package com.mystream;
import java.util.stream.*;
public class ConcatStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> s1=Stream.of(12,34,56,78);
		Stream<Integer> s2=Stream.of(54,67,89,88);
		Stream<Integer> s3=Stream.concat(s1,s2);
		//s3.forEach(System.out::println);
		System.out.println(count());
		
		

	}

}

package com.mystream;
import java.util.stream.*;
import java.util.function.*;

public class MatchDemo {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(12,43,54,23,67,88);
		System.out.println(stream.anyMatch((e)->e%2=0));
	}

}

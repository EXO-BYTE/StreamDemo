package com.mystream;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stream creating using builder function
		/*Stream.Builder<String> builder = Stream.builder();
		builder.add("Modem");
		builder.add("Modem");
		builder.add("Modem");
		builder.add("Modem");
		Stream<String> stream=builder.build();*/
		
		//Stream creation using iterate method
		//Stream<Integer> instream=Stream.iterate(1, n->n+2).limit(20);
		//instream.forEach(System.out::println);
		
		//IntStream
		//IntStream intStream=IntStream.of(10,12,34,56,76);
		//intStream.forEach(System.out::println);
		
		/*IntStream intStream=IntStream.range(1, 5);
		intStream.forEach(System.out::println);
		IntStream closeStream=IntStream.rangeClosed(1, 5);
		closeStream.forEach(System.out::println);
		
		DoubleStream doubleStream=DoubleStream.of(12,34,56,78,9);*/
		
		Stream<Integer> stream = Stream.generate(()->new Random().nextInt(10)).limit(10);
		stream.forEach(System.out::println);
	}
	
}

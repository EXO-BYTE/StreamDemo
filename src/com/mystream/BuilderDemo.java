package com.mystream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class BuilderDemo {
	 public static void main(String[] args) {
	        
		 Stream.Builder<String> builder = Stream.builder();
			builder.add("BaudeRate");
			builder.add("Ohm");
			builder.add("Kilowatt");
			builder.add("Bits");
			builder.add("Analog");
			builder.add("Digital");
			Stream<String> stream=builder.build();
			stream.forEach(System.out::println);
			
	                

	       
			
	 }
}

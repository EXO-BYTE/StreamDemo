package com.mystream;
import java.util.*;
import java.util.stream.*;
public class StreamOperation {
	public static void main(String[] args) {
		ArrayList<Device> list=new ArrayList();
		list.add(new Device("BSC","Peter"));
		list.add(new Device("TelePrinter","Edgar"));
		list.add(new Device("Modem","Pete"));
		list.add(new Device("Connector","Samul"));
		list.add(new Device("Terminal","Erric"));
		Stream<Device> stream=list.stream();
		stream.filter((e)->e.getTechName().equals("Peter")).map((e)->e.toString().toUpperCase()).forEach(System.out::println);
}
}

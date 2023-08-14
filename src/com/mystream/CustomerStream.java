package com.mystream;
import java.util.*;
import java.util.stream.*;


public class CustomerStream {
	public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("Alex", "Mumbai","postpaid", 4, 600));
       list.add(new Customer("Ava", "Delhi","prepaid", 2, 700));
       list.add(new Customer("Jules", "Mumbai","postpaid",3, 450));
      list.add(new Customer("Evens", "Mumbai","prepaid", 6, 300));

        
       Stream<Customer> stream=list.stream();
       stream.filter((e)->e.getPlanRange()>3).forEach(System.out::println);
       stream.filter((e)->e.getAmount()>500).forEach(System.out::println);
       System.out.println(stream.allMatch(e->e.getPlanRange()>300));
       System.out.println(stream.anyMatch(e->e.getPlanRange()>600));
    }

}

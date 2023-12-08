package test;

import java.util.ArrayList;
import java.util.List;


public class StreamsExample {
	
	public static void main(String[] args) { 
		
	  List<String> l = new ArrayList<String>();
		l.add("I am a Programer");
		l.add("I am a Java developer");

		l.stream().filter(n->n.contains("a")).map(k->k.replace(" a "," Working as ")).forEach(System.out::println);
	}
	
	
}

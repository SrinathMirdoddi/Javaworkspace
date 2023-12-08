package com.passenger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Ticketbooking> li=new ArrayList<>();
		li.add(new Ticketbooking("sri", 23, "male", "sri98@gmail.com", 50,25 ));
	    li.add(new Ticketbooking("srikanth", 25, "male", "srikanth12@gmail.com", 25,250 ));
		li.add(new Ticketbooking("srinath", 22, "male", "srinath56@gmail.com", 15,62 ));
	    li.add(new Ticketbooking("Srijana", 26, "female", "srijana@gmail.com", 150,555 ));
		li.add(new Ticketbooking("pooja", 23, "female", "pooja@gmail.com", 750,8000 ));
		li.add(new Ticketbooking("mani", 23, "male", "mani12@gmail.com", 15,79 ));
		
		 System.out.println("Distance travelledgreater than 500");
		 li.stream().filter(p -> 500<p.getDistance())
		 .map(p->{
		  p.setTicketprice(p.getTicketprice()-(Double)(p.getTicketprice()*0.1));return
		  p; })
		 .forEach(System.out::println);
		 
		 System.out.println("total Male passenger are");
		 int coount=(int) li.stream().filter(p -> p.getGender()=="male").count();
		 System.out.println(coount);
		 
		 Double secondhighest=li.stream().map(t-> t.getTicketprice()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		 System.out.println("The second highest ticket prize is :"+secondhighest);
	}

}

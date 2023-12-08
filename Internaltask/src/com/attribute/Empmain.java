package com.attribute;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empmain {
	
	public static void main(String[] args) throws AgenotwithinrangeException, NamenotvalidException {
		List<Empattributes> li=new ArrayList<>();
		li.add(new Empattributes(300, "Sri", 25, "data science"));
	    li.add(new Empattributes(301, "Ramesh", 23, "python"));
		li.add(new Empattributes(303, "Anish", 60, "java"));
		
		 for (Empattributes employee : li)
		  { if(employee.getEmpage()>=25 &&employee.getEmpage()<=58)
		 { throw new AgenotwithinrangeException("age is not proper");
		 }
		  
		  List<String> li1=new ArrayList<>();
		   li1.add("Sri");
		   li1.add("Ramesh");
		   li1.add("An$ish");
		  for (String string : li1) {
		  Pattern p = Pattern.compile("[^A-Za-z ]");
		  Matcher m = p.matcher(string);
		  
		  if(m.find()) {
		   throw new NamenotvalidException();
		   }
		  }
		  }
	}
}
package Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods 
{
	public static void main(String[] args) 
	{
		int arr[] = {12,22,56,40,78,90};
		
		ArrayList<Integer> a = new ArrayList<Integer>();
 		
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
		  a.add(arr[i]);	
		}
		
		l = a.stream().filter(n->n==40 || n>=56).collect(Collectors.toList());
		System.out.println("After filtering:" +l);
	
		l = a.stream().filter(c->c>1).map(num->num*2).collect(Collectors.toList());
        System.out.println("After Multiplying:" +l);
        
        l = a.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list:" +l);
        
        l = a.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct method:" +l);
        
        l = a.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println("Peek Method:" +l);
        
	}
}

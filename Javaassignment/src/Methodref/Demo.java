package Methodref;
// Here We are referring a method demo() to showReference() method.
public class Demo 
{
	void demo()
	{
		System.out.println("This is referred to as Method reference");
	}
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		Javareference j = d::demo;
		j.showReference();
		
	}

}

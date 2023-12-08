package Synchronization;

public class Checksynchronization 
{
	public static void main(String[] args) 
	{
		final Threadprocess obj = new Threadprocess();
		Thread t1 = new Thread()
				{
			      public void run()
			      {
			    	  obj.printfactor(6);
			      }
				}
		Thread t2 = new Thread()
				{
			      public void run()
			      {
                     
			      }
				}
		
	}

}

package Copies;

public class Shallowcopy {
	
	String empname;
	int empid;
	public static void main(String[] args) throws CloneNotSupportedException {
		Shallowcopy sp = new Shallowcopy();
		sp.empname = "sai";
		sp.empid = 782;
		Shallowcopy sp1=new Shallowcopy();
		//Shallowcopy sp1 = (Shallowcopy) sp.clone(); clone copy
		sp1 = sp;
		
		System.out.println("name: " +sp1.empname+ "id: " +sp1.empid);
		
	}

}

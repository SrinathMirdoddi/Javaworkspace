package Copies;

public class Deepcopy {
	 String name;
	 int id;
	 public static void main(String[] args) {
		System.out.println("before copying");
		Deepcopy dp = new Deepcopy();
		dp.name = "sri";
		dp.id = 3636;
	
		Deepcopy dp1 = new Deepcopy();
		dp1.name = dp.name;
		dp1.id = dp.id;
		System.out.println("Name: " +dp1.name+ " id: " +dp1.id);
		System.out.println("after copying");
		
	}
	 

}

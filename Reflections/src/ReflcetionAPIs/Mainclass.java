package ReflcetionAPIs;

public class Mainclass {
	
	public static void main(String[] args)  throws Exception {
			Class c = Class.forName("ReflcetionAPIs.Demo1");
			System.out.println(c.isLocalClass());
			Class d = Class.forName("ReflcetionAPIs.Myname");
			System.out.println(d.isInterface());
		}
}
package Task1;
import music.Playable;
import music.str.Veena;
import music.wind.Saxophone;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Veena v = new Veena();
		v.play();
		Saxophone s = new Saxophone();
		s.play();
		Playable pv = new Veena();
		pv.play();
		Playable ps = new Saxophone();
		ps.play();
		System.out.println("main ends");
	}
}

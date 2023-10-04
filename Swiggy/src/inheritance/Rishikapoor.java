package inheritance;

public class Rishikapoor extends Rajkapoor
{
 public void parent()
 {
	System.out.println("karz");
	System.out.println("love aaj kal");
 }
	public static void main(String[] args)
	{ 
		Rishikapoor obj=new Rishikapoor();
		obj.parent();
		obj.grandfather();
		

	}

}

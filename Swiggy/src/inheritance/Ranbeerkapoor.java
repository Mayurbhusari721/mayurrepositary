package inheritance;

public class Ranbeerkapoor extends Rishikapoor
{
 public void child()
 {
	 System.out.println("bramhastra");
	 System.out.println("tamasha");
 }
	public static void main(String[] args)
	{
		Ranbeerkapoor obj=new Ranbeerkapoor();
		obj.child();
		obj.parent();
		obj.grandfather();

	}

}

package inheritance;

public class B extends A
{
 public void M1()
 {
	 System.out.println("i am implemented");
 }
 public void M2()
 {
	 System.out.println(" i am also implemented");
 }
	public static void main(String[] args)
	{
	 B obj=new B();
	 obj.M1();
	 obj.M2();
	 obj.M3();

	}

}

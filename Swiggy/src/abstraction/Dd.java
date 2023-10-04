package abstraction;

public class Dd implements D
{
  public void M1()
 {
	 System.out.println(" i am implementation of M1");
 }
 public void M2()	
 {
	 System.out.println("i am implementation of M2");
 }
 public static void main(String[] args) 
 {
		Dd obj=new Dd();
		obj.M1();
		obj.M2();

 }

}

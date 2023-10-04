package abstraction;

public class B extends A
{
	public void M1()
	{
     System.out.println(" i am implementation of M1");
	}
	 
	public void M2()
	{
		System.out.println(" i am implementation of M2");
	}
    public void M3()
    {
     System.out.println(" i am implementation of M3");
    }
	public static void main(String[] args)
	{
		B obj=new B();
		obj.add();
		obj.M1();
		obj.M2();
		obj.M3();
		
	}

}

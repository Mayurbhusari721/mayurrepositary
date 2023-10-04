package constructor;

public class A 
{
	A(int x)
	{
	 System.out.println(x);
	}

	public static void main(String[] args) 
	{
		A obj=new A(10);
		A obj1=new A(20);
		A obj2=new A('Z');
	//	A obj3=new A(10.10);

	}

}

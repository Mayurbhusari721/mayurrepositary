package methodInJava;
public class Local 
{
	int c=40;
	static int d=60;
	public void A1()
	{
		int b=20;
		System.out.println(b);
		System.out.println(c);
	
	}

	public static void main(String[] args) 
	{
	 Local obj=new Local();
     obj.A1();
     System.out.println(d);
     System.out.println(obj.d);
     

	}

}

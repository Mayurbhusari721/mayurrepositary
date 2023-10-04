package methodInJava;

public class AutomaticP 
{
	public void M1(float f)
	{
		System.out.println(f);
	}
	
	

	public static void main(String[] args) 
	{
		AutomaticP obj=new AutomaticP();
		obj.M1(10.10f);
		//obj.M1(10.10);
		obj.M1(10);
		

	}

}

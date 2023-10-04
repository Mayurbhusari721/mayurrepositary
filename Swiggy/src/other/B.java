package other;

public class B
{

	public static void main(String[] args) 
	{
		
		try
		{
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println("npe");
		}
		catch(ArithmeticException e)
		{
			System.out.println("AME");
		}
		catch(Exception e)
		{
			System.out.println("AIOBE");
		}
		
		
	}

}

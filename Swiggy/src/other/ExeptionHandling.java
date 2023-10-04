package other;

public class ExeptionHandling
{

	public static void main(String[] args) 
	{
		String S="aaliya bhatt";
		try
		{
			System.out.println(S.charAt(2));
		}
		catch(Exception e)
		{
			System.out.println(" index value execded");
		}
		finally
		{
			System.out.println("this code is always going to execute");
		}
	}

}

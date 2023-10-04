
package other;

public class FinallyBlock
{
	public static void main(String[] args) 
	{
		String S="aaliya bhatt";
		try
		{
			System.out.println(S.charAt(54));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index value execded");
		}
		finally
		{
			System.out.println("this is always going to execute");
		}
	}

}

package other;

public class TwoDimentionalArray
{

	public static void main(String[] args)
	{
		int a[][]= {{10,20,30,40},{50,60,70,80}};   //2d array
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[1][1]);
		System.out.println(a[1][3]);
		// ho to print above 2d array
		for (int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}

}

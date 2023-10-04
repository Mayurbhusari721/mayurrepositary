package other;

import java.util.Arrays;

public class ArrayPrograms 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40};
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a.length);
	//	System.out.println(a[4]);
	//	a[4]=50;
		System.out.println(Arrays.toString(a));
		a[0]=99;
		System.out.println(Arrays.toString(a));
		System.out.println("\n");
	// 2nd apporoach to print array	
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	// 3rd apporoach to print an array
		// for each loop
		System.out.println("\n");
		for(int k:a)
		{
			System.out.println(k);
		}
	}

}

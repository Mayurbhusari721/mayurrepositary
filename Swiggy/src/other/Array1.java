package other;

import java.util.Arrays;

public class Array1
{

	public static void main(String[] args)
	{
	 String a[]=new String[4];//array declaration
	 a[0]="varun dhavan";
	 a[1]="shahid kapoor";
	 a[2]="aatif aslam";
	 a[3]=("aaliya bhatt");
	 System.out.println(Arrays.toString(a));
	 // for loop
	 for (int i=0; i<a.length; i++)
	 {
		 System.out.println(a[i]);
	 }
	 System.out.println("\n");
	 //for each loop 
	 for(String k:a)
	 {
		 System.out.println(k);
	 }
	
	}
}

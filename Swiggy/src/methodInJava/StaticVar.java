package methodInJava;
public class StaticVar
{
 static int a=85;//static variable
	public static void main(String[] args)
	{
		System.out.println(a);   // 1st Apporoach(Directly)
		
		StaticVar obj=new StaticVar();
		
		System.out.println(obj.a);  //2nd Approach by using object referance
		
		System.out.println(StaticVar.a); // 3rd Approach by using class referance
		
	}

}

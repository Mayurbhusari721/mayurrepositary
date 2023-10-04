package methodInJava;
public class Instance 
{
 int a=75;          // instance variable
 public void S1()
{
	 System.out.println(a);
}
	public static void main(String[] args) 
	{
		Instance obj=new Instance();
		obj.S1();
        System.out.println(obj.a);//By using object referance
	}

}

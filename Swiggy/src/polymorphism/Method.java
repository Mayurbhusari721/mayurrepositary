package polymorphism;

public class Method
{
	public void add()
	{
		System.out.println("no arg method/general method");
	}
    public void add(int x)
    {
    	System.out.println(x);
    }
    public void add(int y, int z)
    {
    	System.out.println(y+z);
    }
    public void add(String s)
    {
    	System.out.println("string-org method");
    }
	public static void main(String[] args)
	{
		Method obj=new Method();
		obj.add();
		obj.add(52);
		obj.add(1,1);
		obj.add("arbaj");
		obj.add('a');  //ap
		obj.add('z','k');  //ap
		

	}

}

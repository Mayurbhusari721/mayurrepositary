package methodInJava;

public class ParaM
{
	public void sun (int x)
	{
		System.out.println(x);
	}
    public void man(int y, int z)
    {
    	System.out.println(y+z);
    }
    public void fan(String s)
    {
    	System.out.println(s);
    }
	public static void main(String[] args) 
	{
		ParaM obj=new ParaM();
		obj.sun (10);
		obj.man(10,20);
		obj.fan("mayur");
		
		
		

	}

}

package assignment;
//program to find simple interest without parameter and without return type
public class FuncSI1
{
	//method simple
	public static void simple()
	{
		float p = 10000;
		float t = 2;
		float r = 12;
		float sip = (p*t*r)/100;
		System.out.println(sip);//print result
	}
	//main method
	public static void main(String []args)
	{
		simple();
	}

}

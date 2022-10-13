package assignment;
//program to find simple interest with parameter and without return type
public class FuncSI3{
	//simple method with parameters
	public static void simple(float p,float t,float r)
	{
		float sip = (p*t*r)/100;
		System.out.println(sip);//print result
	}
	//main method
	public static void main(String []args)
	{
		simple(10000,2,12);
	}

}

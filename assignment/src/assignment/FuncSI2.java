package assignment;
//program to find simple interest without parameter and with return type
public class FuncSI2 {
	//simple method
	public static float simple()
	{
		float p = 10000;
		float t = 2;
		float r = 12;
		float sip = (p*t*r)/100;
		//returning the value
		return sip;
		
	}
	public static void main(String []args)
	{
		//storing the returned value in a variable
		float res = simple();
		System.out.println(res);//print result
	}

}

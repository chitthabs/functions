package assignment;
//program to find simple interest with parameter and with return type
public class FuncSI4 {
	//simple method with parameters and return type float
	public static float simple(float p,float t,float r)
	{
		float sip = (p*t*r)/100;
		return sip;
		
	}
	//main method
	public static void main(String []args)
	{
		float res = simple(10000,2,12);
		System.out.println(res);//print result
	}

}

package assignment;
//program to find product of 3 numbers without parameter and with return type

public class Product3 {
	//method product
	public static int prod()
	{
		int x=2,y=4,z=6;
		//expression to find product
		int p = x*y*z;
		return p;
	}	
	//main method or function
	public static void main(String [] args)
	{
		//storing return value in a variable
		int res = prod();
		System.out.println(res);//print the output
	}

}

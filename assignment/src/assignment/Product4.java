package assignment;

//program to find product of 3 numbers with parameter and with return type
public class Product4{
	//method product with return type int and variables
	public static int prod(int x,int y,int z)
	{
		//expression to find product
		int p = x*y*z;
		return p;//returning the result value
	}
	//main method or function
	public static void main(String [] args)
	{
		//call prod method and initialize values to variables
		//storing the value in a variable
		int res=prod(2,4,6);
		System.out.println(res);//printing the result
	}
	

}

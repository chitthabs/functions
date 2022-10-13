package assignment;
//program to find product of 3 numbers with parameter and without return type

public class Product2 {
	//method product
	public static void prod(int x,int y,int z)
	{
		//expression to find product
		int p = x*y*z;
		System.out.println(p);//print the output
	}
	//main method or function
	public static void main(String [] args)
	{
		//call the product method
		prod(2,4,6);
		prod(3,5,7);
	}

}

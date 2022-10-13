package sequenceassn;


/*program to add two numbers and find square of a 
 * number with parameter and with return type*/

public class sequence4 {
	public static int add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	public static int square(int x)
	{
		int sq = x*x;
		
		return sq;
	}
	public static void main(String[] args)
	{
		System.out.println("sum = " + add(10,20));
		System.out.println("square = "+square(5));
	}

}

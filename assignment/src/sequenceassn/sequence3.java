package sequenceassn;

/*program to add two numbers and find square of a 
 * number without parameter and with return type*/

public class sequence3 {
	public static int add()
	{
		int a = 10, b = 20;
		int sum = a+b;
		return sum;
	}
	public static int square()
	{
		int x = 5;
		int sq = x*x;
		
		return sq;
	}
	public static void main(String[] args)
	{
		System.out.println("sum = " + add());
		System.out.println("square = "+square());
	}

}

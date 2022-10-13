package chainassn;

/*program to add two numbers and find square of a 
 * number with parameter and with return type*/

public class chain4 {
	public static int add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	public static int square(int x)
	{
		int sq = x*x;
		System.out.println("sum = " + add(10,20));
		return sq;
	}
	public static void main(String[] args)
	{
		System.out.println("square = "+square(5));
	}

}

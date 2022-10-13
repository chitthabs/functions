package chainassn;
/*program to add two numbers and find square of a 
 * number without parameter and without return type*/
public class chain1 {
	public static void add()
	{
		int a = 10, b = 20;
		int sum = a+b;
		System.out.println("sum of a and b is "+sum);
	}
	public static void square()
	{
		int x = 5;
		int sq = x*x;
		System.out.println("square of x is " +sq);
		add();
	}
	public static void main(String[] args)
	{
		square();
	}

}

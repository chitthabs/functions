package chainassn;

/*program to add two numbers and find square of a 
 * number with parameter and without return type*/
public class chain2 {
	public static void add(int a,int b)
	{
		int sum = a+b;
		System.out.println("sum of a and b is "+sum);
	}
	public static void square(int x )
	{
		int sq = x*x;
		System.out.println("square of x is " +sq);
		add(10,20);
	}
	public static void main(String[] args)
	{
		square(5);
	}

}

package sequenceassn;

/*program to add two numbers and find square of a 
 * number without parameter and without return type*/
public class sequence1 {
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
		
	}
	public static void main(String[] args)
	{
		add();
		square();	
	}

}
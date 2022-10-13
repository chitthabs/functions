package assignment;

//program to find square of a number without parameter and with return type
public class Square2{
	
	public static int sqr()
	{
		int x = 10;
		int sq = x*x;
		return sq;
	}
	//main method
	public static void main(String[] args)
	{
		//storing return value in a variable
		int res=sqr();
		System.out.println(res);//printing result
	}

}
package bgk;
//Syntax is (datatype.size/8) 
//8 bits
public class size {
	public static void main(String[] args)
	{
		System.out.println("size of byte:"+(Byte.SIZE/8)+" bytes");
		System.out.println("size of Short:"+(Short.SIZE/8)+" bytes");
		System.out.println("size of int:"+(Integer.SIZE/8)+" bytes");
		System.out.println("size of Long:"+(Long.SIZE/8)+" bytes");
		System.out.println("size of Float:"+(Float.SIZE/8)+" bytes");
		System.out.println("size of double:"+(Double.SIZE/8)+" bytes");
		System.out.println("size of char:"+(Character.SIZE/8)+" bytes");
		//System.out.println("size of boolen:"+(Boolean.SIZE/8)+"bytes");
		//boolean size cannot be defined precisely . it is 1 bit
		
	}

}

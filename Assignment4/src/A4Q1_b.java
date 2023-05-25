import java.util.Scanner;

public class A4Q1_b {
	private static void FindLenString(String str)
	{
		float n;
		str=null;
		try {
			n=str.length();
			System.out.println(n);
		}catch(NullPointerException e)
		{
			System.out.println("Given String is Null!");
		}catch(Exception e)
		{
			System.out.println("Enter valid input!");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		String str;
		System.out.println("Enter the string:");
		Scanner scan= new Scanner(System.in);
		str=scan.next();
		FindLenString(str);
	}
}

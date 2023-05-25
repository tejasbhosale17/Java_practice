import java.util.Scanner;

public class A4Q1_a {
	public static void main(String[] args)
	{
		int a,b;
		int c=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a=scan.nextInt();
		b=scan.nextInt();
		try
		{
			c=a/b;
		}catch(ArithmeticException e)
		{
			System.out.println("Catch method initiated:");
			System.out.println("Please enter non-zero values ");
		}
		finally {
			System.out.println("file closed");
		}
		System.out.println(c);
	}
	
}

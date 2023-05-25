package assignment1;
import java.util.Scanner;

public class EvenOdd {
	public static void OddEven(int a)
	{
		if(a%2==0)
		{
			System.out.println(a+" is Even.");
		}
		else
		{
			System.out.println(a+" is Odd.");
		}
	}
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		OddEven(n);
	}
}

package assignment1;
import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int v;
		System.out.println("Enter 1 to add, 2 to substract, 3 to multiply, 4 to divide and Enter 0 to Exit:");
		int n=  scan.nextInt();
		switch(n)
		{
		case 1:
			v=a+b;
			System.out.println(""+v);
			break;
		case 2:
			v=a-b;
			System.out.println(""+v);
			break;
		case 3:
			v=a*b;
			System.out.println(""+v);
			break;
		case 4:
			v=a/b;
			System.out.println(""+v);
			break;
		default:
			System.out.println("Enter valid number");
			break;
		}
	}
}

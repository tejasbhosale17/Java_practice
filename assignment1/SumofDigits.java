package assignment1;
import java.util.Scanner;

public class SumofDigits {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int sum=0,m;
		while(n>0)
		{
			m=n%10;
			sum=sum+m;
			n=n/10;
		}
		System.out.println(sum);
	}
}

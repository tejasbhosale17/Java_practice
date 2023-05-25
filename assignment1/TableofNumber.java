package assignment1;
import java.util.Scanner;

public class TableofNumber {
	public static void Padha(int a)
	{
		for(int i=1;i<11;i++)
		{
			System.out.println(""+a*i);
		}
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int n =sc.nextInt();
		Padha(n);
	}

}

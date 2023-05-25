package assignment1;
import java.util.Scanner;

public class LargestNumber {
	public static void FindMax(int n1,int n2, int n3)
	{
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+" is Largest");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+" is Largest");
		}
		else
		{
			System.out.println(n3+" is Largest");
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Distinct Numbers:");
		int a =sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		FindMax(a,b,c);
	}
}

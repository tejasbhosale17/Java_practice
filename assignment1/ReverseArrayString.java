package assignment1;
import java.util.Scanner;

public class ReverseArrayString {
	public static void main(String [] args)
	{
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
	}

}

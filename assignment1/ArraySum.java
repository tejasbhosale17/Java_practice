package assignment1;
import java.util.Scanner;

public class ArraySum {
	public static void main(String [] args)
	{
		int n;
		int sum=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter size of an Array:");
		n=scan.nextInt();
		int [] arr= new int[n];
		System.out.println("Enter Elements of an Array:");
		for (int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
		}
//		for (int j=0;j<n;j++)
//		{
//			sum=sum+arr[j];
//			
//		}
		System.out.println(sum);
	}

}

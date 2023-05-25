package assignment1;
import java.util.Scanner;

public class MaxMinArray {
	private static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	private static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String [] args)
	{
		int n;
		int temp=0;
		System.out.println("Enter Size of an Array:");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int Min=findMin(arr);
		int Max=findMax(arr);
		System.out.println("Minimum is: "+Min);
		System.out.println("Maximum is: "+Max);
	}

}

package assignment1;
import java.util.Scanner;

public class SecondLargestInArray {
	public static int getSecondLargest(int[] a,int total){  
		int temp;  
		
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
	
	public static void main(String [] args)
	{
		int n;
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
//		for(int j=0;j<n;j++)
//		{
//			for(int k=j+1;k<n;k++)
//			{
//				if(arr[j]>arr[j+1])
//				{
//					temp=arr[j];
//					arr[j]=arr[k];
//					arr[k]=temp;
//				}
//			}
//			
//			
//		}
		System.out.println(getSecondLargest(arr,n));
	}

}

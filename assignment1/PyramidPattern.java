package assignment1;
import java.util.Scanner;

public class PyramidPattern {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n = sc.nextInt();
		int m;
		m=n;
//		for(int i=1;i<n;i++)
//		{
//			for(int j=0;j<m/2;j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println("");
//		}
		
		for(int i=1;i<=n;i++)  
		   {  
		       for(int j=1;j<=m-1;j++)  
		       {  
		           System.out.print(" ");  
		       }  
		       for(int k=1;k<=2*i-1;k++)  
		       {  
		    	   System.out.print("*");  
		       }  
		       m--;  
		     
		       System.out.println("");  
		    } 
	}

}

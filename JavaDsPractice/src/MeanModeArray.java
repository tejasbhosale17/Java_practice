import java.util.Scanner;

public class MeanModeArray {
	public void mode(int a[],int n)
	{
		int temp;
		int count=0;
		for(int i=0;i<n;i++)
		{
			temp=a[i];
			for(int j=0;j<n;j++)
			{
				if(temp==a[j])
				{
					count++;
				}
			}
		}
	}
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter size of array");
	int n=scan.nextInt();
	int a[]= new int[n];
	System.out.println("Enter elements of array");
	int sum=0;
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
		sum=sum+a[i];
	}
	double mean=sum/n;
	System.out.println("mean:"+mean);
}
}

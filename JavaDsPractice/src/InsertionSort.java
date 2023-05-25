
public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {45,23,78,10,75,24};
		new InsertionSort().sort(a);
	}
	void sort(int a[])
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			for(j=i;(j>0&&a[j-1]>temp);j--)
			{
				a[j]=a[j-1];
			}
			a[j]=temp;
			for(int k: a)
			{
				System.out.print(k+" ");
			}
			System.out.println("");
		}
		
	}
}

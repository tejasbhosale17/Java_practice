
public class MergeSort {
	public static void main(String[] args) 
	{
		int arr[]= {45,23,78,10,75,24};
		new MergeSort().divide(arr, 0, arr.length-1);
	}
//Divide:divides input arraty into smailler part 
//till individual elemenets obtains
void divide(int arr[],int low ,int high)
{
	int mid=0;
	if(low<high)
	{
		mid=(low+high)/2;
		divide(arr,low,mid);
		divide(arr,mid+1,high);
		mergesort(arr,low,mid,high);
	}
}
//sort and merge the smaller arrays of the parent array
	void mergesort(int arr[],int low, int mid, int high)
	{
		int temp[]= new int[arr.length];
		int l = low,i=low,m=mid+1,k=0;
		while((l<=mid)&& m<=high)
		{
			if(arr[l]<=arr[m])
			{
				temp[i]=arr[l];
				l++;
			}
			else
			{
				temp[i]=arr[m];
				m++;
			}
			i++;
			if(l>mid) {
				for(k=m;k<=high;k++)
				{
					temp[i]=arr[k];
					i++;
				}
			}else
			{
				for(k=l;k<=mid;k++)
				{
					temp[i]=arr[k];
					i++;
				}
			}	
		}
		for(k=low;k<=high;k++)
		{
			arr[k]=temp[k];
		}
	}

}

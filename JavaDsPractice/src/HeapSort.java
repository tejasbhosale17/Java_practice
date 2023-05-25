
public class HeapSort {
	//best,worst,avg complexity al are nlogn(base 2)
public static void main(String[] args) {
	int arr[]= {12,11,13,5,6,7};
	int n= arr.length;
	HeapSort hs = new HeapSort();
	hs.sort(arr);
	for(int i:arr)
	{
		System.out.print(i+",");
	}
}

public void sort(int arr[])
{
	int n= arr.length;
	//identification of subtrees
	for(int i=n/2-1;i>=0;i--)
	{
		heapify(arr,n,i);
	}
	//swapping of root with the last leaf node
	for(int  i=n-1;i>0;i--)
	{
		int temp =arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		
		heapify(arr,i,0);
	}
}
//max heapification of each of the subtree
void heapify(int arr[],int n, int i)
{
	int largest=i; //index reprasentation the root of the subtree
	int l = 2*i+1; //index rep left child of subtree
	int r = 2*i+2; //index rep right child of subtree
	if(l<n && arr[l]>arr[largest]) //if l is within length of array and weather 
		//leftchild is larger than root of the suntree
	{
		largest=l;
	}
	if(r<n && arr[r]>arr[largest])//if r is within length of array and weather 
	//rightchild is larger than root of the subtree
	{
		largest=r;
	}
	//if one of the child node is largest int the subtree
	if(largest!=i)
	{
		int swap= arr[i];
		arr[i]=arr[largest];
		arr[largest]=swap;
		heapify(arr,n,largest);
	}
}

}

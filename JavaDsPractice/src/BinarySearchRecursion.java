
public class BinarySearchRecursion {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,52,62,77};
		System.out.println("Index of element: "+new BinarySearchRecursion().bsRecursion(arr, 0, arr.length-1, 77));
	}
	int bsRecursion(int arr[],int left,int right,int temp)
	{
		int mid=(left+right)/2;;
		if(left>right)
		{
			return -1;
		}
		if(temp==arr[mid])
		{
			return mid;
		}
		if(temp<arr[mid])
		{
			return bsRecursion(arr,left,mid-1,temp);
		}
		return bsRecursion(arr,mid+1,right,temp);
		
	}
}

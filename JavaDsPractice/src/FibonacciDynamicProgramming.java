
public class FibonacciDynamicProgramming {
	public static long arr[]= new long[100];
public static void main(String[] args) {
	arr[0]=1;
	arr[1]=1;
	long pretime= System.currentTimeMillis();
	System.out.println(fibonacciNormal(60));
	long posttime= System.currentTimeMillis();
	System.out.println("Compute timer for normal fib:"+(posttime-pretime));
	long beftime= System.currentTimeMillis();
	System.out.println(fibonaciMemoization(60));
	long aftime =System.currentTimeMillis();
	System.out.println("Compute timer for memoization fib:"+(aftime-beftime));
	
}
	public static long fibonacciNormal(long n)
	{
		if(n==0||n==1)
		{
			return  n;
		}
		else
			return fibonacciNormal(n-1)+ fibonacciNormal(n-2);
	}
	
	public static long fibonaciMemoization(long n)
	{
		long fibvalue=0;
		if(n==0)
		{
			return 0;
		}else if(n==1)
		{
			return 1;
		}else if(arr[(int)n]!=0)
		{
			return arr[(int)n];
		}else {
		fibvalue=fibonaciMemoization(n-1)+fibonaciMemoization(n-2);
		arr[(int)n]= fibvalue;
		return fibvalue;
		}
	}
}

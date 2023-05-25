
public class FibonacciSeries {
public static void main(String[] args) 
	{
		System.out.println("= "+new FibonacciSeries().findfib(34));
	}

	long findfib(long n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		return findfib(n-1)+findfib(n-2);
	}
}

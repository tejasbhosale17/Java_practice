import java.util.Scanner;

public class MultiplicationProblem {
	public void tables(int a,int b)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				System.out.print((i*j));
			}
			System.out.println("");
		}
	}
public static void main(String[] args) {
	MultiplicationProblem multi = new MultiplicationProblem();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two nos:");
	int a=scan.nextInt();
	int b=scan.nextInt();
	multi.tables(a,b);
}
}

package assignment1;
import java.util.Scanner;

public class LightBill {
	public static void Bill(double u)
	{
		Double money=0.0;
		if(u<=100)
		{
			money=(u*1.20);
		}
		else
		{
			money=money+(100*1.20);
			u=u-100;
			if (u>0 && u<=200)
			{
				money=money+(u*2.00);
			}
			else
			{
				money=money+(200*2.00);
				u=u-200;
				if (u>0 && u<=300)
				{
					money= money+(u*3.00);
				}
				else
				{
					money=money+(300*3.00);
					u=u-300;
					if (u>300)
					{
						money= money+(u*5.00);
					}
				}
			}
			
		}
		System.out.println(""+money);
		
	}
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of units:");
		double units = scan.nextDouble();
		Bill(units);
		
	}
}

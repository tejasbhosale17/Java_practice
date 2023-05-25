package assignment1;
import java.util.Scanner;

public class SimpleIntrest {
	public static void Intrest(double p,double r,double t)
	{
		double SI = (p*r*t)/100;
		System.out.print(SI);
	}
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principle, rate, time in years: ");
		double principle =scan.nextDouble();
		double rate = scan.nextDouble();
		double time= scan.nextDouble();
		Intrest(principle,rate,time);
	}
}

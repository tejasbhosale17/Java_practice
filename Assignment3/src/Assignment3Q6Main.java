import java.util.Scanner;

public class Assignment3Q6Main {
	public static void main(String[] args)
	{
		String name;
		String sssn;
		double esal;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter name annd ssn:");
		name=scan.next();
		sssn=scan.next();
		int Emptype;
		System.out.println("Enter Employee type 1 for Commission, 2 for Hourly, 3 for Salarised:");
		Emptype=scan.nextInt();
		if(Emptype==1)
		{
			System.out.println("Enter sales and Commission:");
			CommissionEmp c = new CommissionEmp(name,sssn,scan.nextDouble(),scan.nextDouble());
			System.out.println(c);
			esal=c.salary();
			System.out.println(esal);
		}else if(Emptype==2)
		{
			System.out.println("Enter wage and hours:");
			HourlyEmp h= new HourlyEmp(name,sssn,scan.nextDouble(),scan.nextDouble());
			esal=h.salary();
			System.out.println(esal);
		}else if(Emptype==3)
		{
			System.out.println("Enter Basicsalary: ");
			SalarisedEmp s= new SalarisedEmp(name,sssn,scan.nextDouble());
			esal=s.salary();
			System.out.println(esal);
		}else
		{
			System.out.println("Chose Valid option:");
		}
	}
}

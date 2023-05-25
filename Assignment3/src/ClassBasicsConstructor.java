import java.util.Scanner;

class Employee
{
	int empno;
	String empname;
	String edesig;
	float esal;
	
	Employee(int no,String name,String desig,float sal)
	{
		empno=no;
		empname=name;
		edesig=desig;
		esal=sal;
	}
//	void getData()
//	{
//		empno=scan.nextInt();
	//	empname=scan.next();
	//	edesig=scan.next();
	//	esal=scan.nextFloat();
//	}
	void displayData()
	{
		System.out.println(empno+" "+empname+" "+edesig+" "+esal);
	}
}
public class ClassBasicsConstructor {
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter empno,name,desig,sal: ");
		Employee e = new Employee(scan.nextInt(),scan.next(),scan.next(),scan.nextFloat());
		//e.getData();
		e.displayData();
	}
}

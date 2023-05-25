import java.util.Scanner;

class Person
{
	String pname;
	int page; 
	Person(String pname, int page) {
		super();
		this.pname = pname;
		this.page = page;
	}

}
class Teacher extends Person
{
	Teacher(String pname, int page){
		super(pname,page);
	}
	
	void myProfession()
	{
		System.out.println(pname+" "+page);
		System.out.println("I am a Teacher");
	}
}
class Employeei extends Person
{
	Employeei(String pname,int page){
		super(pname,page);
	}
	
	void myProfession()
	{
		System.out.println(pname+" "+page);
		System.out.println("I am a Employee");
	}
}
class PermanentEmp extends Employeei
{

	PermanentEmp(String pname, int page) {
		super(pname, page);
	}

	@Override
	void myProfession() {
		System.out.println(pname+" "+page);
		System.out.println("I am a Permanent Employee");
	}
}
class ContractEmp extends Employeei
{

	ContractEmp(String pname, int page) {
		super(pname, page);
	}

	@Override
	void myProfession() {
		System.out.println(pname+" "+page);
		System.out.println("I am a Contract Employee");
	}
}
public class Assignment3Q2 {

	public static void main(String[] args) 
	{
		String name;
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name,age:");
		name=scan.next();
		age=scan.nextInt();
		Teacher t = new Teacher(name,age);
		t.myProfession();
		PermanentEmp p = new PermanentEmp(name, age);
		p.myProfession();
		ContractEmp c = new ContractEmp(name,age);
		c.myProfession();
	}
}

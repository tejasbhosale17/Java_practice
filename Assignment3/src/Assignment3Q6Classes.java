class Employeegs
{
	String ename;
	String ssn;
	Employeegs(String ename,String ssn)
	{
		super();
		this.ename=ename;
		this.ssn=ssn;
	}
	
	@Override
	public String toString() {
		return "Employeegs [ename=" + ename + ", ssn=" + ssn + "]";
	}

	double salary()
	{
		double sal=5000;
		System.out.println("This is emp salary:");
		return sal;
	}
	
}

class CommissionEmp extends Employeegs
{
	double sales;
	double comm;
	CommissionEmp(String ename,String ssn,double sales,double comm)
	{
		super(ename,ssn);
		this.sales=sales;
		this.comm=comm;
	}
	double salary()
	{
		double sal=(sales*100-comm);
		System.out.println("This is Commission emp salary:");
		return sal;
	}
	@Override
	public String toString() {
		return "Employeegs [ename=" + ename + ", ssn=" + ssn + "]";
	}
}

class HourlyEmp extends Employeegs
{
	double wage;
	double hours;
	HourlyEmp(String ename,String ssn,double wage,double hours)
	{
		super(ename,ssn);
		this.wage=wage;
		this.hours=hours;
	}
	double salary()
	{
		double sal=(hours*20+wage);
		System.out.println("This is salary of hourly emp:");
		return sal;
	}
	@Override
	public String toString() {
		return "Employeegs [ename=" + ename + ", ssn=" + ssn + "]";
	}
}

class SalarisedEmp extends Employeegs
{
	double basicsal;
	SalarisedEmp(String ename,String ssn,double basicsal)
	{
		super(ename,ssn);
		this.basicsal=basicsal;
	}
	double salary()
	{
		double sal=(basicsal*2);
		System.out.println("This is salarised emp:");
		return sal;
	}
	@Override
	public String toString() {
		return "Employeegs [ename=" + ename + ", ssn=" + ssn + "]";
	}
}



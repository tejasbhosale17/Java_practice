class Employeeo
{
	String eFirst;
	String eLast;
	String ssn;
	
	Employeeo(String eFirst,String eLast, String ssn)
	{
		super();
		this.eFirst=eFirst;
		this.eLast=eLast;
		this.ssn=ssn;
	}
	void show()
	{
		System.out.println(eFirst+" "+eLast+" "+ssn);
	}
	public void setFirst(String fname)
	{
		eFirst=fname;
	}
	public String getFirst()
	{
		return eFirst;
	}
	
	public void setLast(String lname)
	{
		eLast=lname;
	}
	public String getLast()
	{
		return eLast;
	}
	
	public String getssn()
	{
		return ssn;
	}
	public void setssn(String fssn)
	{
		ssn=fssn;
	}
}

class HourEmp extends Employeeo
{
	double salary;
		HourEmp(String eFirst,String eLast, String ssn)
		{
			super(eFirst,eLast,ssn);
			//this.salary=salary;
		}
		void show()
		{
			System.out.println(eFirst+" "+eLast+" "+ssn+" "+salary);
		}
		void setSalary(double salary)
		{
			this.salary=salary;
		}
		double getSalary()
		{
			return salary;
		}
	void HourlyEmployee()
	{
		System.out.println("This is Hourly Employee");
	}
	void ComputerGressPay(int hrs)
	{
		//salary=(salary*12);
		System.out.println((salary+(hrs*20))*12);
	}
	void computeNetPay(int hrs)
	{
		System.out.println(salary+(hrs*20));
	}
}

class SalarisedEmployee extends Employeeo
{
	double salary;
		SalarisedEmployee(String eFirst,String eLast, String ssn)
		{
			super(eFirst,eLast,ssn);
		}
		void show()
		{
			System.out.println(eFirst+" "+eLast+" "+ssn+" "+salary);
		}
		void setSalary(double salary)
		{
			this.salary=salary;
		}
		double getSalary()
		{
			return salary;
		}
	void SalarisedEmp()
	{
		System.out.println("This is Salarisd Employee");
	}
	void ComputerGressPay(int hrs)
	{
		//salary=(salary*12);
		System.out.println(salary*12);
	}
	void computeNetPay()
	{
		System.out.println(salary);
	}	
}
public class Assignment3Q3 {

}

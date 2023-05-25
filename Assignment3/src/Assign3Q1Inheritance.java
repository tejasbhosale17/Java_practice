import java.util.Scanner;

class BankAccount
{
	int accountNumber;
	float totalBal;
	
	BankAccount(int accountNumber, float totalBal) {
		super();
		this.accountNumber = accountNumber;
		this.totalBal = totalBal;
	}
	
	void deposite(int amount)
	{
		int money=amount;
		totalBal=totalBal+money;
		System.out.println("After Deposite Bank Balance is: "+totalBal);
	}
	void withdraw(int cash)
	{
		totalBal=totalBal-cash;
		System.out.println("After Withdraw account Balance is: "+totalBal);
	}
	void getBalance()
	{
		System.out.println("Account Balance is: "+totalBal);
	}
}

class CheckingAccount extends BankAccount
{
	public CheckingAccount(int accountNumber, float totalBal) {
		super(accountNumber, totalBal);
	}

	void deduct(float fees)
	{
		totalBal=totalBal-fees;
		//System.out.println(fee);
		System.out.println("After Deduction remaining Amount is: "+totalBal);
	}
}

class SavingAccount extends CheckingAccount
{
	public SavingAccount(int accountNumber, float totalBal) {
		super(accountNumber, totalBal);
	}
	
	void addIntrest(float aintrst)
	{
		totalBal=totalBal+(totalBal*(aintrst/100));
		System.out.println("Total Balance after adding intrest is: "+totalBal);
	}
}
public class Assign3Q1Inheritance {
	public static void main(String[] args)
	{
		int ano,atotalb;
		String Acctype;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter account no and totalbalance: ");
		ano=scan.nextInt();
		atotalb=scan.nextInt();
		System.out.println("enter s for Saving/ c for Checking");
		Acctype=scan.next();
		System.out.println(Acctype);
		//if(Acctype=="Saving")
		if(Acctype.equals("Saving"))
		{
			SavingAccount s= new SavingAccount(ano,atotalb);
			System.out.println("Enter Intrest to add: ");
			float bonus=scan.nextFloat();
			s.addIntrest(bonus);
			System.out.println("Enter amount to deposite: ");
			s.deposite(scan.nextInt());
			s.getBalance();
		}
		else if(Acctype.equals("Checking"))
		{
			CheckingAccount c = new CheckingAccount(ano,atotalb);
			System.out.println("Enter fees to be deducted from checking account: ");
			int fees=scan.nextInt();
			c.deduct(fees);
			System.out.println("Enter amount to Withdraw: ");
			c.withdraw(scan.nextInt());
			c.getBalance();
		}
		//BankAccount b= new BankAccount(ano,atotalb);
	}
}

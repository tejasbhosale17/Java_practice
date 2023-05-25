import java.util.Scanner;

public class PrefixToInfixStack {
	private static String a[];
	private int top;
	public PrefixToInfixStack()
	{
		a= new String[7];
		top=-1;
	}
	public boolean isFull()
	{
		return(top>=a.length-1);
	}
	public boolean isEmpty()
	{
		return(top==-1);
	}
	void push(String c) throws Exception
	{
		if(!isFull())
		{
			top++;
			a[top]=c;
		}
		else 
			throw new Exception("Stack is Full");
	}
	public String pop() throws Exception
	{
		if(!isEmpty())
		{
			String tmp=a[top];
			top--;
			return tmp;
		}
		else
			throw new Exception("Stack is Empty");
	}
public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);
	PrefixToInfixStack pti = new PrefixToInfixStack();
	System.out.println("Enter prefix string:");
	String str= scan.next();
	for(int i=0;i<7;i++)
	{
		if(str.charAt(i)=='*' || str.charAt(i)== '+'|| str.charAt(i)=='-'|| str.charAt(i)=='/')
		{
			String s1= pti.pop();
			String s2= pti.pop();
			String temp= "("+s1+str.charAt(i)+s2+")";
			pti.push(temp);
		}
		else
		{
			pti.push(str.charAt(i)+"");
			 
		}
	}
	
	for(int i=0;i<1;i++)
	{
		System.out.print(a[i]);
	}
//	
}
}

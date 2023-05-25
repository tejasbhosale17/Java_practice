import java.util.ArrayList;
import java.util.Scanner;

public class WordChainProblem {
public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter no of strings:");
//	int n= scan.nextInt();
//	String str[]= new String[n];
	String str[]= {"whisper","sonnet","orkshop","erform","ormat","person","hoperf","network"};
	ArrayList <String> ans = new ArrayList<String>();
	String temp=null;
	String prev=null;
//	String temp[]=new String[str.length];
//	for(int i=0;i<n;i++)
//	{
//		str[i]=scan.next();
//	}
//	System.out.println(str[1].substring((str[1].length()-3), str[1].length()));

	for(int i=0;i<str.length;i++)
	{
		prev=str[i];
		ans.add(prev);
		for(int j=0;j<str.length;j++)
		{
//			System.out.print(str[i].substring((str[i].length()-3), str[i].length())+" ");
//			
//			System.out.print(str[j].substring(0,3)+" ");
//			System.out.println("");
			
//			int index = (str[i].length()-3);
			
			if(str[j].startsWith(str[i].substring(str[i].length()-3)))
			{
//						System.out.println(str[i]);
//						System.out.println(str[j]);
//					temp=str[j];
					ans.add(str[j]);	
////						str[j]=str[i];
////						str[i]=temp;	
			}
			else
//				System.out.println("next");
				continue;
		}
		ans.add(temp);

	}
	for(String a : ans)
	{
		System.out.println(a);
	}
//	System.out.println(ans);
//	for(int i=0;i<str.length;i++)
//	{
//		System.out.println(str[i]);
//	}
}
}

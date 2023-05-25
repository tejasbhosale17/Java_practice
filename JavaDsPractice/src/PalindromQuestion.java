import java.util.Scanner;

public class PalindromQuestion {
	static boolean palindrom(String str)
	{
		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter string: ");
	String str= scan.next();
	boolean ispalindrom=palindrom(str);
	if(ispalindrom==true)
	{
		System.out.println("Palindrom.");
	}else
		System.out.println("Not Palindrom!");
}
}

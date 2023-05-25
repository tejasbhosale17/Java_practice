package assignment1;
import java.util.Scanner;

public class DeleteVowels {
	public static String Delvowels(String str)
	{
		String DeletedString="";
		DeletedString = str.replaceAll("[a,e,i,o,u]", ""); 
		return DeletedString;
	}
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scan.nextLine();
		System.out.println("String without vowels is "+Delvowels(str));
		
	}

}

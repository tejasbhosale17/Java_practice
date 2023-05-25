package assignment1;
import java.util.Scanner;

public class ReverseString {
	public static String reverseString(String str){  
	    char [] ch=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    rev.replaceAll(" ", ",");
	    return rev;  
	}
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		System.out.println("Reversed String is: "+reverseString(str));
	}

}

package assignment1;
import java.util.Scanner;

public class DelSpaceString {
	public static String DelecteSpaces(String str)
	{
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
      //System.out.println(noSpaceStr);
//		char [] ch=str.toCharArray();
//		String deldpace="";
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]==" ")
//			{
//				
//			}
//		}
        return noSpaceStr;
	}
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		System.out.println("String without spaces is: "+DelecteSpaces(str));
	}

}

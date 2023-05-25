import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingEx2Write {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("ajava_text.txt"); 
	String str;
	System.out.println("Enter string:");
	Scanner scan = new Scanner(System.in);
	
	while(!(str=scan.nextLine()).equals("exit"))
	{
		fw.write(str+"\n");
	}
	System.out.println("File Writing is over!");
	fw.close();
}
}

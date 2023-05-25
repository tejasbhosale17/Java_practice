import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingEx1Read {
public static void main(String[] args) throws IOException {
	//open for read
	FileReader fr = new FileReader("ajava_text.txt");
	BufferedReader br= new BufferedReader(fr);
	
	//reading from file
	String str = br.readLine();
	String str1 = br.readLine();
	
	//writing to the console
    
    System.out.println(str.toUpperCase());
    System.out.println(str1);
    fr.close();
    br.close();
}
}

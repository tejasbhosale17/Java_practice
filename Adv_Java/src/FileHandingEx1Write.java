import java.io.FileWriter;
import java.io.IOException;

public class FileHandingEx1Write {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("ajava_text.txt");
		String str="Hello World! This is File Handling Example";
		String str1="I am Executing File handing Through hard coded values for strings";
		fw.write(str+"\n");
		fw.write(str1);
		fw.close();
		System.out.println("File Write is over!");
		
	}
}

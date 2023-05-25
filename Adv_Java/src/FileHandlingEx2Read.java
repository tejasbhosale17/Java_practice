import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingEx2Read {
public static void main(String[] args) throws IOException {
	try{
		FileReader fr = new FileReader("ajava_text.txt");
		BufferedReader br = new BufferedReader(fr);
		String str=null;
		while((str=br.readLine()) != null)
		{
			System.out.println(str);
		}
	}catch(FileNotFoundException e)
	{
		System.out.println("File not Found!");
	}

}
}

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileHandlingEx3ObjectRead {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis = new FileInputStream("ajava_text.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	Employee e;
	
	try
	{
		while((e= (Employee) ois.readObject())!=null)
		{
			e.displayEmployee();
		}
	}
	catch(EOFException ex)
	{
		System.out.println("End of File!");
	}
	ois.close();
	fis.close();
}
}

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileHandlingEx3ObjectWrite {
	public static void main(String[] args) throws IOException 
	{
			FileOutputStream fos = new FileOutputStream("ajava_text.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter no of employees:");
			int n= scan.nextInt();
			Employee[] e = new Employee[n];
			System.out.println("Enter empno,ename,esal:");
			for(int i=0;i<n;i++)
			{
				e[i]= new Employee(scan.nextInt(),scan.next(),scan.nextFloat());
				oos.writeObject(e[i]);
			}
			
			System.out.println("Object Write is over!");
			fos.close();
			oos.close();
		
		
	}
}

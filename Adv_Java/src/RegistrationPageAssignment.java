import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import java.util.Scanner;


public class RegistrationPageAssignment 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","tejas170299");
	Resultset rs;
	System.out.println("Database Connected!");
	String q1="Insert into userdetails (uno,uname,uage,username,password) values (?,?,?,?,?)";
	PreparedStatement pmt= con.prepareStatement(q1);
	System.out.println("Enter uno,uname,uage,username,password:");
	Scanner scan = new Scanner(System.in);
	int no =scan.nextInt();
	String name= scan.next();
	int age = scan.nextInt();
	String usrname =scan.next();
	String pass = scan.next();
	
	pmt.setInt(1, no);
	pmt.setString(2, name);
	pmt.setInt(3, age);
	pmt.setString(4, usrname);
	pmt.setString(5, pass);
	
	int row = pmt.executeUpdate();
	
	System.out.println("Inserted rows "+row);
	
}
}

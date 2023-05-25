import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class LoginPageAssignment {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","tejas170299");
	
	System.out.println("Database Connected!");
	String q1="select * from userdetails where username=? and password=?";
	PreparedStatement pmt = con.prepareStatement(q1);
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter username, password:");
	String usern=scan.next();
	String passwd = scan.next();
	pmt.setString(1, usern);
	pmt.setString(2, passwd);
	ResultSet rs;
	rs=pmt.executeQuery();
	//System.out.println("query executed");
	 
	if(rs.next()==true)
	{
		System.out.println("Entry Authorized!");
	}
	else
	{
		System.out.println("Invalid username or password please try again!");
	}
//	 while(rs.next())
//	    {	    	
//	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
//	    	System.out.println("Entry Authorized!");
//	    }
	
	
	
}
}

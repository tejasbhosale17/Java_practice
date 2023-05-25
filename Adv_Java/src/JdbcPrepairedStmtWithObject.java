import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class JdbcPrepairedStmtWithObject {
	static Scanner scan =new Scanner(System.in);
	private static Connection createConnections() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_practice","root","tejas170299");
		
		return con;
		
	}
	
	private static ArrayList<Employee> displayAllRecords(Connection con) throws SQLException
	{
		ArrayList<Employee> al = new ArrayList<>();
		String q1="select * from emp";
		PreparedStatement pmt;
		pmt=con.prepareStatement(q1);
		System.out.println("query executed");
		ResultSet rs;
		
		 rs=pmt.executeQuery();
		 while( rs.next())
		    {	    	
		    	//System.out.println(empcode+" "+rs.getString(2)+" "+rs.getFloat("basicpay"));
		    	Employee e = new Employee(rs.getInt(1),rs.getString(2),rs.getFloat("basicpay")) ;
		    	al.add(e);   
		    	
		    }
		 for(Employee e: al)
		 {
			 e.displayEmployee();
		 }
		 return al;
	}
	
	private static void ShowSpecific(Connection con,ArrayList<Employee> al)
	{
		System.out.println("Enter empcode of emp you want to see:");
		
		int pos =scan.nextInt();
		for(Employee e: al)
		{
			if(e.empno==pos)
			{
				e.displayEmployee();
			}
		}
	}
	static void delupdated(Connection con,ArrayList<Employee> al) throws SQLException
	{
		String q3="update emp set basicpay = basicpay - ? where empcode = ?";
		PreparedStatement ppmt=con.prepareStatement(q3);
		System.out.println("Enter empcode you wantto revert back:");
		int nno=scan.nextInt();
		System.out.println("Enter salary to be deducted:");
		float dsal=scan.nextFloat();
		ppmt.setFloat(1, dsal);
		ppmt.setInt(2, nno);
		int urow = ppmt.executeUpdate();
		System.out.println("Rows Updated:"+urow);
	}
	private static void updateEmp(Connection con,ArrayList<Employee> al) throws SQLException
	{
		String q2="update emp set basicpay = basicpay + ?  where empcode = ?";
		PreparedStatement pmt=con.prepareStatement(q2);
		System.out.println("Enter empcode of emp you want to update");
		int no=scan.nextInt();
		System.out.println("Enter sal to be updated");
		float esal=scan.nextFloat();
		pmt.setFloat(1, esal);
		pmt.setInt(2, no);
		int row=pmt.executeUpdate();
		System.out.println("Records Updated: "+row);
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con = createConnections();
		ArrayList<Employee> al;
		al=displayAllRecords(con);
		Scanner scan =new Scanner(System.in);
		ShowSpecific(con,al);
		updateEmp(con,al);
		al=displayAllRecords(con);
		delupdated(con,al);
		al=displayAllRecords(con);
		
	}
}

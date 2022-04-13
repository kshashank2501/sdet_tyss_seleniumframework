package COM.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest {

	
	@Test
	public void executeupdatest() throws Throwable
	{
		Connection con=null;
		 try {
			//step-1 register the driver 
			Driver dref=new Driver();
			
			//calling register driver
			DriverManager.registerDriver(dref);
			
			//Step-2 Connect to database 
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info", "root","root");
			
			//Step-3 create statement 
			//Step-3 create statement from java program 
			Statement stmt=con.createStatement();
			
			//step-4  Execute Query 
			int result = stmt.executeUpdate("insert into students_info (regno, firstName, middleName, lastName) values('44', 'boom','bumrah', 'b');");
			
			//step-5  It executes the if block if condition is true. 
			if(result==1) {
				System.out.println("Data stored inside the table");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		//Step-6 Connection close 
			System.out.println("Connection closed ");
		con.close();
	}
}
}

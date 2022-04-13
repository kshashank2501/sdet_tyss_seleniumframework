package COM.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecutequeryTest {
	@Test
	public void executequer() throws Throwable
	{	
		
		    //step-1 register the driver 
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			
			//Step-2 Connect to database 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info", "root","root");
			
			//Step-3 create statement from java program 
			Statement stmt=con.createStatement();
			
			//Step-4Execute Query(set collection used)
			ResultSet result=stmt.executeQuery("select * from Students_info;");
			//To take multiple values use while loop 
			while(result.next())
			{
				System.out.println(result.getString(2)+" "+result.getString(2));
			}
			//step-5 close connection 
			con.close();
			
	}

}

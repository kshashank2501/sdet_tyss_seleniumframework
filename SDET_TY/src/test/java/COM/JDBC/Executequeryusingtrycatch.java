package COM.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Executequeryusingtrycatch {

	
	@Test 
	public void executequerytrycatch() throws Throwable
	{
		 //step-1 register the driver 
		Driver dref=new Driver();
		//calling register driver
		DriverManager.registerDriver(dref);
		
		//Step-2 Connect to database //To get try-catch we need to copy from con=sourrounded by try catch 
	Connection con =null;	
		
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info", "root","root");
			
			//Step-3 create statement from java program 
			Statement stmt=con.createStatement();
			
			//Step-4Execute Query(set collection used)
			ResultSet result=stmt.executeQuery("select * from Students_info;");
			//To take multiple values use while loop 
			while(result.next())
			{
				System.out.println(result.getString(2)+" "+result.getString(2));
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//step-5 close connection 
			System.out.println("Connection closed");
			con.close();
		}
		
	}
}

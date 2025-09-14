package hrmsoftware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {
	
	   	public static String email;
	    public static String password;

	public static void logindata() throws SQLException {
		
		String host="127.0.0.1";
		String port="3308";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/anupdemo","root","Anup@1195");
		
		Statement s=con.createStatement();
		
		ResultSet rs=s.executeQuery("SELECT * FROM anupdemo.login_info where id=1;");
		
		while(rs.next())
		{
		
	   email=rs.getString("email");
	   password=rs.getString("password");
	   System.out.println(email);
		System.out.println(password);

	}
	
	}

}

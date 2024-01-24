package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql:///","Satish","Satish@123");
			Statement st=conn.createStatement();
			String sql="show databases";
			st.execute(sql);
			System.out.println("added");
			}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
	
	
/*	import java.sql.*;


	public class conn{
	    Connection c;
	    Statement s;
	    public conn(){
	    try{
	        c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Satish@123");
	        s=c.createStatement();
	    }catch(Exception e){
	        System.out.println(e);
	    }
	    }
	    
	}*/


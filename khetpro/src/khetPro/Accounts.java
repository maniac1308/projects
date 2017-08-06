package khetPro;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Accounts {
 
	public static void main(String[] args) throws Exception
	{ Class.forName("com.mysql.jdbc.Driver");
	 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/khety","root" , "root");
		acc_update("nan" , 44 , c);
	}

	static void acc_update(String name , int amt ,Connection c ) throws SQLException
	{   
		
		//int ax=0;
	/*	String que = "Insert into account_data values(?,?)";
        PreparedStatement ps1 = c.prepareStatement(que);
    	ps1.setString(1, name);
		ps1.setInt(2,ax);
		ps1.execute();
		*/
		

		//String am = "Select * from account_data ";
		//PreparedStatement ps = c.prepareStatement(am);
		
	//	ResultSet rs = ps.executeQuery();
		
	//	if(rs.getString(1)==null)
	
            
             String que = "Select * from khety.account_data where name = '" + "ravi" + "'";
             PreparedStatement ps1 = c.prepareStatement(que);
         	
    		ResultSet rs = ps1.executeQuery();
    		rs.next();
    		System.out.print(rs.next());
	/*
		else
			{ax=rs.getInt(2); 
			 String que = "Update acoount_data set balance =" + ax + "where name = '"+ name + "'" ;
             PreparedStatement ps1 = c.prepareStatement(que);
         	
    		ps1.execute();
		
			}
	*/	
	}

}

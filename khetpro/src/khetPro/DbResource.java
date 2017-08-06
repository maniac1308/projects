package khetPro;
import java.sql.*;
public class DbResource {

	 static Connection connect;
	 static Connection getc() throws SQLException , ClassNotFoundException
	
	{ Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/khety","root" , "root");
	
		return connect;
	}
	static void dbConnect(String name , String hours , String amt ,String act ,String dat) throws SQLException,ClassNotFoundException 
	{
		Connection con = getc();
	     int hou = Integer.parseInt(hours);
	     int amount = Integer.parseInt(amt);
	   String qry = "Insert into farm_details values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(qry);
		ps.setString(1, name);
        ps.setInt(2, hou );
		ps.setInt(3, amount);
		ps.setString(4, act);
		ps.setString(5, dat);
		ps.execute();

		
		con.close();
		}
	static int acc_update(String name , int amt ,Connection c, int hou,String act ) throws SQLException
	{   
		
		int ax=0;
		amt = (ActivitySet.p.get(act)*hou) - amt;

		String am = "Select * from khety.account_data where name ='" + name + "'";
		PreparedStatement ps = c.prepareStatement(am);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next() == false)
		{  
             ax = amt;
             String que = "Insert into account_data values(?,?)";
             PreparedStatement ps1 = c.prepareStatement(que);
         	ps1.setString(1, name);
    		ps1.setInt(2, ax);
    		ps1.execute();
}
		
		else
			{ax=rs.getInt(2) + amt; 
			 String que = "Update account_data set balance =" + ax + " where name = '"+ name + "'" ;
             PreparedStatement ps1 = c.prepareStatement(que);
         	
    		ps1.execute();
    		
    		
		
			}
		return amt;
		
	}
	static ResultSet acc_balance() throws Exception
	{ Connection c = getc();
	  String st ="Select * from account_data where balance!=0 ;" ;
	  PreparedStatement ps = c.prepareStatement(st);
	  ResultSet rs = ps.executeQuery();
	   return rs;
	  }
	static int bal() throws Exception
	{
		Connection c= getc();
		String s ="select sum(balance) from account_data; ";
		PreparedStatement ps =c.prepareStatement(s);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return rs.getInt(1);
	}

}

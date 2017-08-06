package khetPro;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.JComboBox;

public class ActivitySet {
	static HashMap<String,Integer> p = new HashMap<>();
	
	static void  activityData(JComboBox<String> combox , String db ) throws SQLException , ClassNotFoundException
	{  
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/khety","root" , "root");
		String qry = "Select * from " + db;
		PreparedStatement ps = con.prepareStatement(qry);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			combox.addItem(rs.getString(1));
		    p.put(rs.getString(1) , rs.getInt(2));
		}
		
	}

	
static void  setTools(String tool , int amt) throws SQLException , ClassNotFoundException
{
     Connection c =DbResource.getc();
 	 String am = "Select * from khety.activity_data where activity ='" + tool + "'";
	PreparedStatement ps = c.prepareStatement(am);
	
	ResultSet rs = ps.executeQuery();
	
	if(rs.next() == false)
	{     
         
         String que = "Insert into activity_data values(?,?)";
         PreparedStatement ps1 = c.prepareStatement(que);
     	ps1.setString(1, tool);
		ps1.setInt(2, amt);
		ps1.execute();
}
	
	else
		{
		 
		 String que = "Update activity_data set cost=" + amt + " where activity = '"+ tool + "'" ;
         PreparedStatement ps1 = c.prepareStatement(que);
     	
		ps1.execute();
		
		
	
		}
	
	

}

}

package laundrymanager;
import java.sql.*;
import javax.swing.JLabel;
import java.util.Calendar;
public class Resource {

static void addNewEntry(String name,String act,String flat , String slip , String tok , String tag , int cloth , String mob) throws SQLException,ClassNotFoundException	
{
Class.forName("com.mysql.jdbc.Driver");	
Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry","root" , "root");
String qry = "Insert into cust_data values(?,?,?,?,?,?,?,?,?)";
PreparedStatement ps = connect.prepareStatement(qry);
ps.setString(1,slip);

ps.setString(2,tok);
ps.setString(3,tag);
ps.setString(4,name);
ps.setInt(5,cloth);
ps.setString(6,mob);
ps.setString(7,flat);
ps.setLong(8,Calendar.getInstance().getTimeInMillis());
ps.setString(9, act);

ps.execute();
}
	
static void searchTok(String tk,JLabel l ,JLabel l1 ,JLabel l2 ,JLabel l3 ,JLabel l4 ,JLabel l5) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");	
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry","root" , "root");
	String qry = "select * from cust_data where token="+tk +" order by Date desc limit 1 ;";
	Statement stmt = connect.createStatement();
	ResultSet rs = stmt.executeQuery(qry);

	if(rs.next())
	
	{ 
		System.out.print(rs.getString(1));
		
		l.setText(rs.getString(4));
	l1.setText(rs.getString(2));
	l2.setText(rs.getString(7));
	l3.setText(rs.getString(6));
	l4.setText(""+rs.getInt(5));
		}
	else
	{l5.setText("No Entry Found");}
	
	
	}



}

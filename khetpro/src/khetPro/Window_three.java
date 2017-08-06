package khetPro;



import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
   public class Window_three {

	static JFrame frame;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_three window = new Window_three();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window_three() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()  {
		frame = new JFrame();
		frame.setBounds(100, 100, 794, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                 Personal Record ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel.setBounds(273, 16, 322, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Name");
		lblNewLabel_1.setBounds(172, 74, 122, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
	
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(347, 69, 192, 27);
		frame.getContentPane().add(comboBox);
		try {
			ActivitySet.activityData(comboBox , "account_data");
			comboBox.setEditable(true);
			}
		
		
		catch(ClassNotFoundException e){}
		catch(SQLException e){}
		

		JLabel lblNewLabel_21= new JLabel("Name");
		lblNewLabel_21.setBounds(6, 119, 111, 16);
		frame.getContentPane().add(lblNewLabel_21);
		
		JLabel lblNewLabel_31= new JLabel("Hours");
		 lblNewLabel_31.setBounds(154, 119, 117, 16);
		frame.getContentPane().add(lblNewLabel_31);
		
	    JLabel lblNewLabel_41= new JLabel("Amount ");
		lblNewLabel_41.setBounds(296, 119, 128, 16);
		frame.getContentPane().add(lblNewLabel_41);
		
		JLabel	lblNewLabel_51= new JLabel("Service ");
		lblNewLabel_51.setBounds(467, 119, 128, 16);
		frame.getContentPane().add(lblNewLabel_51);
		
		JLabel lblNewLabel_61= new JLabel("Date ");
		lblNewLabel_61.setBounds(616, 119, 133, 16);
		frame.getContentPane().add(lblNewLabel_61);
		
		
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.setBounds(591, 69, 39, 29);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(3, -2, 129, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnNewButton_1 = new JButton("MENU");
		btnNewButton_1.setBounds(6, 18, 117, 37);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Window_one.frame.setVisible(true);
			frame.setVisible(false);
			
			}
		});
		final JLabel lblNewLabel_2[] = new JLabel[5];
		final JLabel lblNewLabel_3[] = new JLabel[5];
		final JLabel lblNewLabel_4[] = new JLabel[5];
		final JLabel lblNewLabel_5[] = new JLabel[5];
		final JLabel lblNewLabel_6[] = new JLabel[5];
		
		for(int i =0 ; i<5 ; i++)
		{
			
			lblNewLabel_2[i]= new JLabel();
			lblNewLabel_2[i].setBounds(6, 149, 111, 16+i*50);
			frame.getContentPane().add(lblNewLabel_2[i]);
			
			lblNewLabel_3[i]= new JLabel();
			lblNewLabel_3[i].setBounds(156, 149, 117, 16+50*i);
			frame.getContentPane().add(lblNewLabel_3[i]);
			
		
			
			lblNewLabel_4[i]= new JLabel();
			lblNewLabel_4[i].setBounds(303, 149, 128, 16+i*50);
			frame.getContentPane().add(lblNewLabel_4[i]);
			
			lblNewLabel_5[i]= new JLabel();
			lblNewLabel_5[i].setBounds(473, 149, 128, 16+i*50);
			frame.getContentPane().add(lblNewLabel_5[i]);
			
			lblNewLabel_6[i]= new JLabel();
			lblNewLabel_6[i].setBounds(616, 149, 133, 16+i*50);
			frame.getContentPane().add(lblNewLabel_6[i]);
			
			
		}
		
		
		btnNewButton.addActionListener(l -> {

			
			try
			{ int i=0;
				String name = (String)comboBox.getSelectedItem();
			Connection c = DbResource.getc();
			
			String list = "Select * from farm_details where name ='" + name +"' ;";
		    PreparedStatement ps = c.prepareStatement(list);
		    ResultSet rs = ps.executeQuery();
		    rs.afterLast();
		    while(i<5 && rs.previous())
		    {
		    	
		    	
		    	lblNewLabel_2[i].setText(rs.getString(1));
		    	lblNewLabel_3[i].setText(" " + rs.getInt(2));
		    	lblNewLabel_4[i].setText(" " +rs.getInt(3));
		    	lblNewLabel_5[i].setText(rs.getString(4));
		    	lblNewLabel_6[i].setText(rs.getString(5));
	    
		    	i++;
		    	
		    }
		    
		    
			}
			catch(Exception e)
			{
				
			}
			
			 
			
		});
		
		
	
	}
}


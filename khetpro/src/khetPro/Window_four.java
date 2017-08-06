package khetPro;



import java.awt.EventQueue;
import javax.swing.*;
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
import javax.swing.JScrollBar;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
   public class Window_four {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_four window = new Window_four();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window_four() {
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 129, 58);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton_1 = new JButton("MENU");
		btnNewButton_1.setBounds(6, 18, 117, 34);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Window_one.frame.setVisible(true);
			frame.setVisible(false);
			
			}
		});
		
		
		
		
		

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
		
		JLabel lblNewLabel = new JLabel("                 Account Statement  ");
		lblNewLabel.setBounds(195, 0, 365, 55);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Kefa", Font.BOLD, 25));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(3, 153, 782, 325);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	
		 ResultSet rs = null;
		try
		{ int i=0;
			
		Connection c = DbResource.getc();
		
		String list = "Select * from farm_details ;" ;
	    PreparedStatement ps = c.prepareStatement(list);
	    rs = ps.executeQuery();
	    rs.afterLast();
		//JLabel lblNewLabel_40= new JLabel("Hello");
		//lblNewLabel_40.setBounds(281, 6, 128, 15);
		//panel_1.add(lblNewLabel_40);
		
		//JScrollBar scrollBar = new JScrollBar();
		//scrollBar.setBounds(762, 153, 15, 325);
		//frame.getContentPane().add(scrollBar);
	    
	    while(rs.previous())
	    {
	    	
	    
	    	
            JLabel lblNewLabel_2= new JLabel(rs.getString(1));
			lblNewLabel_2.setBounds(8, 12, 128, 15 + i*50);
			panel_1.add(lblNewLabel_2);

			
			
		JLabel	lblNewLabel_3= new JLabel(" "+rs.getInt(2));
			lblNewLabel_3.setBounds(159, 12 , 128, 15 + 50*i);
			panel_1.add(lblNewLabel_3);
		
		
			
			JLabel lblNewLabel_4= new JLabel(" "+rs.getInt(3));
			lblNewLabel_4.setBounds(299, 12, 128, 15+i*50);
			panel_1.add(lblNewLabel_4);
		
		JLabel	lblNewLabel_5= new JLabel(rs.getString(4));
			lblNewLabel_5.setBounds(470, 12, 128, 16+i*50);
			panel_1.add(lblNewLabel_5);
		
		JLabel	lblNewLabel_6= new JLabel(rs.getString(5));
			lblNewLabel_6.setBounds(615, 12, 128, 16+i*50);
			panel_1.add(lblNewLabel_6);
		
			i++;
	    	
	    }
	    
	    
		}
		catch(Exception e)
		{
			
		}
		
		
		
		
		
		
		
	
	}
}


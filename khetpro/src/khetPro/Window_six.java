package khetPro;

import java.sql.*; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_six {

	static JFrame frame;
static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				new Window_six();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window_six() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Loan Repayment");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(168, 22, 196, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(29, 124, 85, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.setBounds(363, 119, 51, 29);
		frame.getContentPane().add(btnNewButton);
		
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(137, 120, 213, 27);
		frame.getContentPane().add(comboBox);
		
		
		try {
			ActivitySet.activityData(comboBox , "account_data");
		}
		catch(SQLException e) {}
		catch(ClassNotFoundException e){}
		
		
	
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(147, 159, 73, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		Integer amt[] =new Integer[1];
	
		
		btnNewButton.addActionListener(l -> {
			
			
			
			try {
				Connection c = DbResource.getc();
				String q = "Select balance from account_data where name = '" + comboBox.getSelectedItem() + "' ;" ;
				
				PreparedStatement ps =c.prepareStatement(q);
				 ResultSet rs= ps.executeQuery();
				if(rs.next())
				{  
					amt[0]= rs.getInt(1);
					lblNewLabel_2.setText(" " + rs.getInt(1));
					
				}
			
			
			}
			catch(SQLException e) {}
			catch(ClassNotFoundException e){}
			
		});
		
		JLabel lblNewLabel_3 = new JLabel("Amount");
		lblNewLabel_3.setBounds(29, 218, 85, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(137, 213, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(86, 276, 117, 29);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnNewButton_1 = new JButton("MENU");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					Window_one.frame.setVisible(true);
					frame.setVisible(false);
					
					}
				});
			}
		});
		btnNewButton_1.setBounds(6, 6, 117, 44);
		frame.getContentPane().add(btnNewButton_1);
		btnSubmit.addActionListener(l -> {
			int i=0;
			i =Integer.parseInt(textField.getText());
			try {
			  Connection c =DbResource.getc();
			  int ax= amt[0] -i; 
				 String que = "Update account_data set balance =" + ax + " where name = '"+ comboBox.getSelectedItem() + "'" ;
	             PreparedStatement ps1 = c.prepareStatement(que);
	         	
	    		ps1.execute();
	    		
	    		
	    		DbResource.dbConnect((String)comboBox.getSelectedItem(), "0", "" + i, "Loan Repayment", Window_one.setDate());
	    		JOptionPane.showMessageDialog(frame,"Amount " + ax + "  is due","Balance ",JOptionPane.DEFAULT_OPTION,null);
	    		Window_one.frame.setVisible(true);
	    		frame.setVisible(false);
	    		
			}
			catch(SQLException e) {}
			catch(ClassNotFoundException e){}
			
			
		});
	
		
	}
}

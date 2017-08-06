package khetPro;

import java.awt.EventQueue;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class Window_two {

	static  JFrame  frame;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_two window = new Window_two();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window_two() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 644, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(303, 156, 159, 27);
		frame.getContentPane().add(comboBox_1);
		try{
			
			ActivitySet.activityData(comboBox_1, "activity_data");
			
		}
		catch(SQLException e){}
		catch(ClassNotFoundException e){}
		
		textField_4 = new JTextField();
		textField_4.setBounds(303, 304, 159, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(518, 309, 75, 16);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("     Customer Name");
		lblNewLabel_1.setBounds(61, 79, 127, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNatureOfWork = new JLabel("     Nature Of Work");
		lblNatureOfWork.setBounds(61, 156, 127, 23);
		frame.getContentPane().add(lblNatureOfWork);
		
		JLabel lblHoursWorked = new JLabel("     Hours Worked");
		lblHoursWorked.setBounds(61, 231, 127, 23);
		frame.getContentPane().add(lblHoursWorked);
		
		JLabel lblAmountPaid = new JLabel("    Amount Paid");
		lblAmountPaid.setBounds(61, 304, 127, 23);
		frame.getContentPane().add(lblAmountPaid);
		
		textField = new JTextField();
		textField.setBounds(303, 229, 159, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(303, 77, 159, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		 
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(227, 372, 117, 29);
		frame.getContentPane().add(btnSubmit);
	     
		JButton btnNewButton_12 = new JButton("MENU");
		btnNewButton_12.setBounds(6, 18, 117, 34);
		frame.getContentPane().add(btnNewButton_12);
		
		JLabel lblNewLabel_2 = new JLabel("  Service Request Form");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_2.setBounds(227, 18, 218, 34);
		frame.getContentPane().add(lblNewLabel_2);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Window_one.frame.setVisible(true);
			frame.setVisible(false);
			
			}
		});
		
		
		
btnSubmit.addActionListener(i -> {
		try{
		String cus_name = textField_1.getText();
		String act = (String)comboBox_1.getSelectedItem();
		String hours= textField.getText();
		String  amt= textField_4.getText(); 
		DbResource.dbConnect(cus_name, hours , amt, act ,Window_one.setDate());
		int balu = DbResource.acc_update(cus_name , Integer.parseInt(amt)  , DbResource.getc() , Integer.parseInt(hours) ,act);
		JOptionPane.showMessageDialog(frame,"Amount Due for this Service is " + balu,"Balance ",JOptionPane.DEFAULT_OPTION,null);
		textField.setText("");
		textField_1.setText("");
		textField_4.setText("");
		
		Window_one.frame.setVisible(true);
		Window_two.frame.setVisible(false);
		
		
		
		}
		catch(ClassNotFoundException e){}
		catch(SQLException e){}	
		catch(Exception e){System.out.print("No Issues");}
	});
			
	
		
	}
}

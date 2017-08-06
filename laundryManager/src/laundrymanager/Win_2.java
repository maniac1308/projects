package laundrymanager;
import java.util.*;
import java.awt.EventQueue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;


public class Win_2 {


	static  JFrame  frame;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 new Win_2();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Win_2() {
		initialize();
	}
	static void  activityData(JComboBox<String> combox)
	{
		
		ArrayList<String> rs = new ArrayList<>();
		rs.add("Washing");
		rs.add("Ironing");
		rs.add("Washing/Ironing");
		rs.add("Dry Cleaning");
	for(String s : rs)
	{
		combox.addItem(s);
	    
	}
			}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		frame.setBounds(100, 100, 644, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBackground(new Color(143, 188, 143));
		comboBox_1.setBounds(303, 144, 159, 27);
		frame.getContentPane().add(comboBox_1);
		activityData(comboBox_1);
		
		
		textField_4 = new JTextField();
		textField_4.setBounds(303, 436, 159, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(518, 309, 75, 16);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("     Customer Name");
		lblNewLabel_1.setBounds(61, 79, 127, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNatureOfWork = new JLabel("     Nature Of Work");
		lblNatureOfWork.setBounds(61, 145, 127, 23);
		frame.getContentPane().add(lblNatureOfWork);
		
		JLabel lblHoursWorked = new JLabel("     Flat Number");
		lblHoursWorked.setBounds(61, 216, 127, 23);
		frame.getContentPane().add(lblHoursWorked);
		
		JLabel lblAmountPaid = new JLabel("      Tag Number");
		lblAmountPaid.setBounds(61, 438, 127, 23);
		frame.getContentPane().add(lblAmountPaid);
		
		textField = new JTextField();
		textField.setBounds(303, 214, 159, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(303, 77, 159, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		 
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(210, 612, 117, 29);
		frame.getContentPane().add(btnSubmit);
	     
		JButton btnNewButton_12 = new JButton("MENU");
		btnNewButton_12.setBounds(6, 18, 117, 34);
		frame.getContentPane().add(btnNewButton_12);
		
		JLabel lblNewLabel_2 = new JLabel("  Service Request Form");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_2.setBounds(227, 18, 218, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblReceiptNumber = new JLabel("Receipt Number");
		lblReceiptNumber.setBounds(77, 295, 127, 23);
		frame.getContentPane().add(lblReceiptNumber);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(303, 293, 159, 26);
		frame.getContentPane().add(textField_2);
		
		JLabel label = new JLabel("      Token Number");
		label.setBounds(61, 369, 127, 23);
		frame.getContentPane().add(label);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(303, 367, 159, 26);
		frame.getContentPane().add(textField_3);
		
		JLabel lblAmount = new JLabel("   Clothes");
		lblAmount.setBounds(77, 503, 127, 23);
		frame.getContentPane().add(lblAmount);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(303, 501, 159, 26);
		frame.getContentPane().add(textField_5);
		
		JLabel lblMobile = new JLabel("   Mobile");
		lblMobile.setBounds(77, 566, 127, 23);
		frame.getContentPane().add(lblMobile);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(303, 564, 159, 26);
		frame.getContentPane().add(textField_6);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Win_1.frame.setVisible(true);
			frame.setVisible(false);
			
			}
		});
		
		
	
btnSubmit.addActionListener(i -> {
		try{
		String  cus_name = textField_1.getText();
		String  act = (String)comboBox_1.getSelectedItem();
		String  flat= textField.getText();
		String  slip= textField_2.getText(); 
		String  tok= textField_3.getText(); 
		String  tag= textField_4.getText(); 
		int  cloth= Integer.parseInt(textField_5.getText()); 
		String  mob= textField_6.getText(); 
		Resource.addNewEntry(cus_name, act, flat, slip, tok, tag, cloth, mob);
		
		JOptionPane.showMessageDialog(frame,"Record Submitted Successfully","",JOptionPane.DEFAULT_OPTION,null);
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_5.setText("");
		textField_6.setText("");
		textField_4.setText("");
				
		}
		catch(ClassNotFoundException e){}
		catch(SQLException e){}	
		
	});
	
			
	
		
	}
}

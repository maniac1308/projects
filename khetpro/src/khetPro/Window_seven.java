package khetPro;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Window_seven {

	static JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new Window_seven();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window_seven() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Service Modification");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel.setBounds(185, 39, 275, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBounds(0, -12, 129, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.setBounds(6, 18, 117, 41);
		panel.add(btnMenu);
		btnMenu.addActionListener(l ->{
			
			
				Window_one.frame.setVisible(true);
				frame.setVisible(false);
				
				
		});
		
		JLabel lblNewLabel_1 = new JLabel("Service Name");
		lblNewLabel_1.setBounds(68, 147, 129, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(209, 150, 170, 27);
		frame.getContentPane().add(comboBox);
try{
			
			ActivitySet.activityData(comboBox, "activity_data");
			
		}
		catch(SQLException e){}
		catch(ClassNotFoundException e){}
		
		
		JLabel lblNewLabel_2 = new JLabel("     Price ");
		lblNewLabel_2.setBounds(68, 231, 129, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(209, 231, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(278, 189, 61, 16);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.setBounds(391, 149, 69, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(149, 321, 117, 29);
		frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(l ->{
			try{
				
			System.out.print("Heyy");
ActivitySet.setTools((String)comboBox.getSelectedItem(), Integer.parseInt(textField.getText()));
System.out.print("Heyy");
textField.setText(" ");
JOptionPane.showMessageDialog(frame,"Modification made Successfully ","Message ",JOptionPane.DEFAULT_OPTION,null);
Window_one.frame.setVisible(true);		
frame.setVisible(false);	
			
			
			}
			
			catch(ClassNotFoundException e){}
			catch(SQLException e){}
			
		});
		
		
		
		
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMenu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					Window_one.frame.setVisible(true);
					frame.setVisible(false);
					}});}});
		
	
	
	
	}
}

package khetPro;

import java.awt.EventQueue;    
  
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Label;
import java.awt.List;
import java.awt.Canvas;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class Window_one {

	static  JFrame frame;
	public static Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Window_one();
			new Thread(){
				public void run () {
				 Window_two.main();
			}
			}.start();
			
			new Thread(){
				public void run () {
				 Window_six.main();
			}
			}.start();
			new Thread(){
				public void run () {
				 Window_seven.main();
			}
			}.start();
			
			new Thread(){
				public void run () {
				 Window_five.main();
			}
			}.start();
			new Thread(){
				public void run () {
				 Window_three.main();
			}
			}.start();
			
			new Thread(){
				public void run () {
				 Window_four.main();
			}
			}.start();
					
				Window_one.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window_one() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static String setDate()
	 {
		 Date d = new Date();
		 SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
	 return sdf.format(d);
	 }
	
	private void initialize() {
		
		frame = new JFrame();
	
		
		frame.getContentPane().setForeground(SystemColor.controlHighlight); 
	

		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(100, 100, 757, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
		frame.getContentPane().setLayout(null);
		
	new Thread()
	{
		public void run(){	JLabel lblNewLabel = new JLabel("           Khet Pro");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel.setForeground(UIManager.getColor("Button.select"));
		lblNewLabel.setBounds(230, 53, 353, 29);
		frame.getContentPane().add(lblNewLabel);}
	}.start();
		
	new Thread()
	{
		public void run(){
		JButton btnNewTransaction = new JButton("New Record");
		btnNewTransaction.setBackground(new Color(192, 192, 192));
		btnNewTransaction.setForeground(UIManager.getColor("CheckBox.foreground"));
		btnNewTransaction.setBounds(40, 125, 276, 50);
		frame.getContentPane().add(btnNewTransaction);
		
		btnNewTransaction.addActionListener(i->{ 
			
			frame.setVisible(false);
			Window_two.frame.setVisible(true);
		
			
		});
		}
	}.start();
	
	new Thread()
	{
		public void run(){
	
		JButton btnNewButton = new JButton("    Account  Balance");
		
		
		btnNewButton.setBounds(40, 211, 276, 50);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener( i -> {
			frame.setVisible(false);
			Window_five.frame.setVisible(true);
		});
		}
		}.start();
		
		new Thread()
		{
			public void run(){
		
		JButton btnNewButton_1 = new JButton("     Statement");
		btnNewButton_1.setBounds(424, 125, 276, 50);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener( i -> {
			frame.setVisible(false);
			Window_four.frame.setVisible(true);
		}
	);
			}
		}.start();
		
		new Thread()
		{
			public void run(){
		
		JButton btnNewButton_2 = new JButton("   Personal Record");
		btnNewButton_2.setBounds(424, 211, 276, 50);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener( i -> {
			frame.setVisible(false);
			Window_three.frame.setVisible(true);
		}
	);
			}
		}.start();
		
		new Thread()
		{
			public void run(){
		
		JLabel lblNewLabel_1 = new JLabel(setDate());
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_1.setBounds(40, 53, 178, 16);
		frame.getContentPane().add(lblNewLabel_1);
			}
		}.start();
		
		new Thread()
		{
			public void run(){
		JButton btnNewButton_3 = new JButton("Loan Repayment ");
		btnNewButton_3.setBounds(40, 297, 276, 50);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(l -> {
			
			Window_six.frame.setVisible(true);
			frame.setVisible(false);
		});
			}
		}.start();
		
		new Thread()
		{
			public void run(){
		JButton button = new JButton("Service Modification");
		button.setBounds(424, 297, 276, 50);
		frame.getContentPane().add(button);
		button.addActionListener(l ->{
			Window_seven.frame.setVisible(true);
			frame.setVisible(false);
			
		});
			}
		}.start();
	}
}

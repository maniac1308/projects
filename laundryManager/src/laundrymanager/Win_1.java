package laundrymanager;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Win_1 {

	static  JFrame frame;
	public static Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Win_1();
		Runnable t = 	 () -> {
				 Win_2.main();
			};
		
	new Thread(t).start();
	
	new Thread(){
		public void run () {
		 Win_3.main();
	}
	}.start();
			
		
			/*
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
				*/	
				Win_1.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Win_1() {
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
	

		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 757, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
		frame.getContentPane().setLayout(null);
		
	new Thread()
	{
		public void run(){	JLabel lblNewLabel = new JLabel(" Laundry Helper         ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel.setForeground(UIManager.getColor("Button.select"));
		lblNewLabel.setBounds(230, 53, 353, 29);
		frame.getContentPane().add(lblNewLabel);}
	}.start();
		
	new Thread()
	{
		public void run(){
		JButton btnNewTransaction = new JButton("New Entry");
		btnNewTransaction.setBackground(new Color(192, 192, 192));
		btnNewTransaction.setForeground(UIManager.getColor("CheckBox.foreground"));
		btnNewTransaction.setBounds(40, 125, 276, 50);
		frame.getContentPane().add(btnNewTransaction);
		
		btnNewTransaction.addActionListener(i->{ 
			
			frame.setVisible(false);
			Win_2.frame.setVisible(true);
		
			
		});
		}
	}.start();
	
	/* new Thread()
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
	*/
		new Thread()
		{
			public void run(){
		
		JButton btnNewButton_1 = new JButton("Token Retrieval");
		btnNewButton_1.setBounds(424, 125, 276, 50);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener( i -> {
			frame.setVisible(false);
			 Win_3.frame.setVisible(true);
	
		}
	);
			}
		}.start();
		
	/*	new Thread()
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
		*/
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
		JButton btnNewButton_3 = new JButton("Date Wise Record");
		btnNewButton_3.setBounds(40, 297, 276, 50);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(l -> {
			
		/*	Window_six.frame.setVisible(true); */
			frame.setVisible(false);
		});
			}
		}.start();
		
		new Thread()
		{
			public void run(){
		JButton button = new JButton("Mobile Retrieval");
		button.setBounds(424, 297, 276, 50);
		frame.getContentPane().add(button);
	 	button.addActionListener(l ->{
		/*	Window_seven.frame.setVisible(true); */
			frame.setVisible(false);
			
		});
			}
		}.start();
		
	}
	}

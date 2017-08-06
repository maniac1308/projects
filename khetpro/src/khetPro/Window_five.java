package khetPro;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class Window_five {

static 	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_five window = new Window_five();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window_five() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		int i=0;
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("      Account Balance");
		lblNewLabel.setFont(new Font("Monaco", Font.BOLD, 20));
		lblNewLabel.setBounds(169, 40, 316, 37);
		frame.getContentPane().add(lblNewLabel);
	
		ResultSet rs=null;
		
	try {
	 rs =	DbResource.acc_balance();
	
	
		while(rs.next())
		{JLabel lblNewLabel_1 = new JLabel(" " + rs.getString(1));
		lblNewLabel_1.setBounds(52, 152+i, 131, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("  " + rs.getInt(2));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_2.setBounds(195, 152+i, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		if(rs.next())
		{
			JLabel lblNewLabel_3 = new JLabel(" " + rs.getString(1));
		lblNewLabel_3.setBounds(329 , 152 +i, 125, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" " + rs.getString(2));
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_4.setBounds(488, 152 +i, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		i+=25;
		}
		}
		
		JLabel lblNewLabel_5 = new JLabel("Balance   " + DbResource.bal() );
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setBounds(473, 22, 141, 28);
		frame.getContentPane().add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, -12, 129, 68);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(0, 0, 129, 68);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.setBounds(6, 18, 117, 44);
		panel_1.add(btnMenu);
		btnMenu.addActionListener(l -> 
		{
			
				Window_one.frame.setVisible(true);
				frame.setVisible(false);
				
				
		}
				
				);
		
	}
	catch(Exception e){
		System.out.print("Exception");
	}
	}
}

package laundrymanager;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Win_3 {

	static JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Win_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		frame.setBounds(100, 100, 585, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Token Retrieval");
		lblNewLabel.setBounds(216, 24, 133, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Token Number\n");
		lblNewLabel_1.setBounds(44, 108, 115, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(235, 109, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.setBounds(389, 109, 55, 29);
		frame.getContentPane().add(btnNewButton);
	
		
		
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(26, 178, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Token");
		lblNewLabel_3.setBounds(137, 178, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblFlat = new JLabel("Flat");
		lblFlat.setBounds(260, 178, 61, 16);
		frame.getContentPane().add(lblFlat);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(383, 178, 61, 16);
		frame.getContentPane().add(lblMobile);
		
		JLabel lblNewLabel_4 = new JLabel("Clothes");
		lblNewLabel_4.setBounds(494, 178, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel label = new JLabel("");
		label.setBounds(26, 239, 86, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(137, 239, 61, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel(" ");
		label_2.setBounds(260, 239, 61, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel(" ");
		label_3.setBounds(383, 239, 101, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel(" ");
		label_4.setBounds(518, 239, 48, 16);
		frame.getContentPane().add(label_4);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(6, 25, 117, 29);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(197, 150, 61, 16);
		frame.getContentPane().add(lblNewLabel_5);
		btnBack.addActionListener(
			i ->{
			Win_1.frame.setVisible(true);
			frame.setVisible(false);
			
			}
		);
		
		
	btnNewButton.addActionListener(l ->{
			
			String tok = textField.getText();
			try{
				
				Resource.searchTok(tok,label,label_1,label_2,label_3,label_4,lblNewLabel_5);
				
			}
			catch(Exception e){
				
				System.out.print("Dikkat");
				
			}
			
		
			
			
			
		}
				
				
				
				
				);
	}
}

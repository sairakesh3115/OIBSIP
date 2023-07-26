import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Number_Guessing {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Number_Guessing window = new Number_Guessing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Number_Guessing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 836, 581);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Difficulty Level");
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		lblNewLabel.setBounds(232, 52, 352, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Easy_btn = new JButton("Easy");
		Easy_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Number_Guessing_levels.easy();
				new Game_Window();
				
			}
		});
		Easy_btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Easy_btn.setBounds(361, 178, 97, 32);
		frame.getContentPane().add(Easy_btn);
		
		JButton Medium_btn = new JButton("Medium");
		Medium_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Number_Guessing_levels.medium();
				new Game_Window();
			}
		});
		Medium_btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Medium_btn.setBounds(361, 246, 97, 32);
		frame.getContentPane().add(Medium_btn);
		
		JButton Hard_btn = new JButton("Hard");
		Hard_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Number_Guessing_levels.hard();
				new Game_Window();
			}
		});
		Hard_btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Hard_btn.setBounds(361, 322, 97, 32);
		frame.getContentPane().add(Hard_btn);
	}
}

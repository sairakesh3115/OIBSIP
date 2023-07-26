import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game_Window {
	JFrame framew;
	 JTextField textField;
	public Game_Window() {
		initialize();
	}
	
	private void initialize() {
		Number_Guessing_levels ngl=new Number_Guessing_levels();

		framew = new JFrame();
		framew.setBounds(100, 100, 1030, 738);
		framew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framew.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(353, 120, 192, 48);
		framew.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Guess Number :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(197, 126, 146, 31);
		framew.getContentPane().add(lblNewLabel);
		
		JLabel ack_label1 = new JLabel();
		ack_label1.setBounds(318, 309, 375, 31);
		framew.getContentPane().add(ack_label1);
		
		JLabel lblNewLabel_1 = new JLabel("No. of Attempts :");
		lblNewLabel_1.setBounds(337, 199, 192, 21);
		framew.getContentPane().add(lblNewLabel_1);
		framew.setVisible(true);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						int n=Integer.parseInt(textField.getText());
						if(ngl.compare_guess(n,Number_Guessing_levels.rand_num)==1) {
							lblNewLabel_1.setText("No. of Attempts :"+Number_Guessing_levels.i);
							ack_label1.setText("Congratulations.....You Won!  Your Score:"+Number_Guessing_levels.max_num/Number_Guessing_levels.i+"/100");
						}
						else if(ngl.compare_guess(n,Number_Guessing_levels.rand_num)==2) {
							ack_label1.setText("Random number is less than guessed number");
							lblNewLabel_1.setText("No. of Attempts :"+Number_Guessing_levels.i);
							Number_Guessing_levels.i++;
							textField.setText("");
						}
						else {
							ack_label1.setText("Random number is greater than guessed number");
							lblNewLabel_1.setText("No. of Attempts :"+Number_Guessing_levels.i);
							Number_Guessing_levels.i++;
							textField.setText("");
						}
				}
				catch(Exception ex) {
					ack_label1.setText("Invalid guess");
					textField.setText("");
				}
			}
		});
		btnNewButton_1.setBounds(408, 245, 85, 21);
		framew.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("The Range of the Random number generated is "+Number_Guessing_levels.min_num+" to "+Number_Guessing_levels.max_num);
		lblNewLabel_2.setBounds(271, 58, 440, 21);
		framew.getContentPane().add(lblNewLabel_2);
	}
}

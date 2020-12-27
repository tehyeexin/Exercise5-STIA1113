import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise5 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5 window = new Exercise5();
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
	public Exercise5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum1.setBounds(39, 49, 146, 26);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum2.setBounds(244, 49, 146, 26);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
				} catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
			}
		});
		btnNewButton.setBounds(59, 103, 115, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
				} catch(Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
			}
		});
		btnNewButton_1.setBounds(254, 103, 115, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
				} catch(Exception e3) {
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
			}
		});
		btnNewButton_2.setBounds(59, 158, 115, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 / num2;
					textFieldAns.setText(Integer.toString(ans));
				} catch(Exception e4) {
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
				
			}
		});
		btnNewButton_3.setBounds(244, 158, 115, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("The answer is");
		lblNewLabel.setBounds(39, 203, 113, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAns.setBounds(167, 203, 146, 26);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
	}
}

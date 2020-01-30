package org.fbla_pbl.pernod.coding_programming;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JTextField emailTextField;
	private JPasswordField numberField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 370, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel emailLabel = new JLabel("Student Email");
		emailLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		emailLabel.setBounds(50, 150, 100, 30);
		frame.getContentPane().add(emailLabel);
		
		JLabel numberLabel = new JLabel("Student No.");
		numberLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		numberLabel.setBounds(50, 220, 100, 30);
		frame.getContentPane().add(numberLabel);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Calibri", Font.PLAIN, 15));
		emailTextField.setBounds(150, 150, 150, 30);
		frame.getContentPane().add(emailTextField);
		emailTextField.setColumns(10);
		
		numberField = new JPasswordField();
		numberField.setFont(new Font("Calibri", Font.PLAIN, 15));
		numberField.setBounds(150, 220, 150, 30);
		frame.getContentPane().add(numberField);
		
		JButton loginButton = new JButton("Log-In");
		loginButton.setFont(new Font("Calibri", Font.PLAIN, 15));
		loginButton.setBounds(12, 300, 345, 50);
		frame.getContentPane().add(loginButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.setFont(new Font("Calibri", Font.PLAIN, 15));
		registerButton.setBounds(12, 362, 345, 50);
		frame.getContentPane().add(registerButton);
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String emailText = emailTextField.getText();
				String numberText = String.copyValueOf(numberField.getPassword());
				User user = null;
				try {
					user = UserManager.findUser(emailText);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				if (numberText.equals(user.getNumber())) {
					frame.dispose();
					
					Home home = new Home(user);
					home.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid Student Name or Number");
				}
			}
		});
		
		JCheckBox showPassword = new JCheckBox("Show Number");
		showPassword.setFont(new Font("Calibri", Font.PLAIN, 15));
		showPassword.setBounds(150, 250, 128, 23);
		frame.getContentPane().add(showPassword);
		showPassword.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				if(showPassword.isSelected()) {
					numberField.setEchoChar((char)0);
				} else {
					numberField.setEchoChar('\u25CF');
				}
			}
		});
		
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				frame.dispose();
				
				Register r = new Register();
				r.setVisible(true);
			}
		});
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		this.frame.setVisible(b);
	}
}

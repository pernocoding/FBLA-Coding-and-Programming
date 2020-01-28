package org.fbla_pbl.pernod.coding_programming;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.*;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JTextField userTextField;
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
		frame.setBounds(100, 100, 370, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel userLabel = new JLabel("Student Name");
		userLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		userLabel.setBounds(50, 150, 100, 30);
		frame.getContentPane().add(userLabel);
		
		JLabel numberLabel = new JLabel("Student No.");
		numberLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		numberLabel.setBounds(50, 220, 100, 30);
		frame.getContentPane().add(numberLabel);
		
		userTextField = new JTextField();
		userTextField.setFont(new Font("Calibri", Font.PLAIN, 15));
		userTextField.setBounds(150, 150, 150, 30);
		frame.getContentPane().add(userTextField);
		userTextField.setColumns(10);
		
		numberField = new JPasswordField();
		numberField.setFont(new Font("Calibri", Font.PLAIN, 15));
		numberField.setBounds(150, 220, 150, 30);
		frame.getContentPane().add(numberField);
		
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
		
		JButton loginButton = new JButton("Log-In");
		loginButton.setFont(new Font("Calibri", Font.PLAIN, 15));
		loginButton.setBounds(125, 300, 117, 29);
		frame.getContentPane().add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String userText = userTextField.getText();
				String numberText = String.copyValueOf(numberField.getPassword());
				if (userText.equals("admin") && numberText.equals("admin")) {
					frame.dispose();
					
					Home home = new Home();
					home.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid Student Name or Number");
				}
			}
		});
	}
}

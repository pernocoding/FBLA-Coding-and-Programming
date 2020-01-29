package org.fbla_pbl.pernod.coding_programming;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Register extends JFrame {

	private JTextField userTextField;
	private JPasswordField numberField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setBounds(100, 100, 370, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel userLabel = new JLabel("Full Name");
		userLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		userLabel.setBounds(50, 100, 100, 30);
		getContentPane().add(userLabel);
		
		JLabel numberLabel = new JLabel("Student No.");
		numberLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		numberLabel.setBounds(50, 220, 100, 30);
		getContentPane().add(numberLabel);
		
		userTextField = new JTextField();
		userTextField.setFont(new Font("Calibri", Font.PLAIN, 15));
		userTextField.setBounds(150, 100, 150, 30);
		getContentPane().add(userTextField);
		userTextField.setColumns(10);
		
		numberField = new JPasswordField();
		numberField.setFont(new Font("Calibri", Font.PLAIN, 15));
		numberField.setBounds(150, 220, 150, 30);
		getContentPane().add(numberField);
		
		JButton loginButton = new JButton("Log-In");
		loginButton.setFont(new Font("Calibri", Font.PLAIN, 15));
		loginButton.setBounds(12, 362, 345, 50);
		getContentPane().add(loginButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.setFont(new Font("Calibri", Font.PLAIN, 15));
		registerButton.setBounds(12, 300, 345, 50);
		getContentPane().add(registerButton);
		
		JFrame frame = this;
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				frame.dispose();
				
				Login l = new Login();
				l.setVisible(true);
			}
		});
		
		JCheckBox showPassword = new JCheckBox("Show Number");
		showPassword.setFont(new Font("Calibri", Font.PLAIN, 15));
		showPassword.setBounds(150, 250, 128, 23);
		getContentPane().add(showPassword);
		
		JLabel gradeDropdown = new JLabel("Grade");
		gradeDropdown.setFont(new Font("Calibri", Font.PLAIN, 15));
		gradeDropdown.setBounds(50, 160, 100, 30);
		getContentPane().add(gradeDropdown);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Grade", "Freshman", "Sophomore", "Junior", "Senior"}));
		comboBox.setBounds(150, 160, 150, 30);
		getContentPane().add(comboBox);
		showPassword.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				if(showPassword.isSelected()) {
					numberField.setEchoChar((char)0);
				} else {
					numberField.setEchoChar('\u25CF');
				}
			}
		});
	}
}	


package org.fbla_pbl.pernod.coding_programming;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Register extends JFrame {

	private JTextField userTextField;
	private JPasswordField numberField;
	private JTextField emailTextField;
	private JPasswordField confirmNumberField;
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
		userLabel.setBounds(51, 59, 100, 30);
		getContentPane().add(userLabel);
		
		JLabel numberLabel = new JLabel("Student No.");
		numberLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		numberLabel.setBounds(51, 179, 100, 30);
		getContentPane().add(numberLabel);
		
		userTextField = new JTextField();
		userTextField.setFont(new Font("Calibri", Font.PLAIN, 15));
		userTextField.setBounds(151, 59, 150, 30);
		getContentPane().add(userTextField);
		userTextField.setColumns(10);
		
		numberField = new JPasswordField();
		numberField.setFont(new Font("Calibri", Font.PLAIN, 15));
		numberField.setBounds(151, 179, 150, 30);
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
		
		
		JComboBox gradeDropdown = new JComboBox();
		gradeDropdown.setFont(new Font("Calibri", Font.PLAIN, 15));
		gradeDropdown.setModel(new DefaultComboBoxModel(new String[] {"Choose Grade", "Freshman", "Sophomore", "Junior", "Senior"}));
		gradeDropdown.setBounds(151, 98, 150, 30);
		getContentPane().add(gradeDropdown);
		
		registerButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String userText = userTextField.getText();
				String gradeText = (String) gradeDropdown.getSelectedItem();
				String emailText = emailTextField.getText();
				String numberText = String.copyValueOf(numberField.getPassword());
				String confirmNumberText = String.copyValueOf(confirmNumberField.getPassword());
				
				if (gradeText.equals("Choose Grade")) {
					JOptionPane.showMessageDialog(frame, "Select which grade you are in.");
				} else if (!numberText.contentEquals(confirmNumberText)) {
					JOptionPane.showMessageDialog(frame, "Make sure to check your number.");
				} else {
					try {
						User user = UserManager.createUser(userText, gradeText, emailText, numberText);
						UserManager.registerUser(user);
						
						dispose();
						Home h = new Home(user);
						h.setVisible(true);
					} catch (NoSuchAlgorithmException | InvalidKeySpecException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
		});
		
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
		
		JLabel gradeLabel = new JLabel("Grade");
		gradeLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		gradeLabel.setBounds(51, 98, 100, 30);
		getContentPane().add(gradeLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		emailLabel.setBounds(51, 137, 100, 30);
		getContentPane().add(emailLabel);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Calibri", Font.PLAIN, 15));
		emailTextField.setColumns(10);
		emailTextField.setBounds(151, 137, 150, 30);
		getContentPane().add(emailTextField);
		
		confirmNumberField = new JPasswordField();
		confirmNumberField.setFont(new Font("Calibri", Font.PLAIN, 15));
		confirmNumberField.setBounds(151, 219, 150, 30);
		getContentPane().add(confirmNumberField);
		
		JLabel confirmNumberLabel = new JLabel("Confirm No.");
		confirmNumberLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		confirmNumberLabel.setBounds(51, 219, 100, 30);
		getContentPane().add(confirmNumberLabel);
		showPassword.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				if(showPassword.isSelected()) {
					numberField.setEchoChar((char)0);
					confirmNumberField.setEchoChar((char)0);
				} else {
					numberField.setEchoChar('\u25CF');
					confirmNumberField.setEchoChar('\u25CF');
				}
			}
		});
	}
}	


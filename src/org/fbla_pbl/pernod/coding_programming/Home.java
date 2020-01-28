package org.fbla_pbl.pernod.coding_programming;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Calibri", Font.PLAIN, 16));
		tabbedPane.setBounds(5, 5, 775, 1048);
		contentPane.add(tabbedPane);
		
		JPanel profilePanel = new JPanel();
		tabbedPane.addTab("Profile", null, profilePanel, null);
		profilePanel.setLayout(null);
		
		JPanel profileHelpPanel = new JPanel();
		profileHelpPanel.setBackground(Color.LIGHT_GRAY);
		profileHelpPanel.setBounds(0, 0, 325, 1002);
		profilePanel.add(profileHelpPanel);
		profileHelpPanel.setLayout(null);
		
		JSeparator profileHelpSeparator = new JSeparator();
		profileHelpSeparator.setBounds(16, 94, 291, 12);
		profileHelpPanel.add(profileHelpSeparator);
		profileHelpSeparator.setForeground(Color.BLACK);
		
		JTextPane profileHelpText = new JTextPane();
		profileHelpText.setEditable(false);
		profileHelpText.setBackground(Color.LIGHT_GRAY);
		profileHelpText.setFont(new Font("Calibri", profileHelpText.getFont().getStyle(), 24));
		profileHelpText.setText("Use this tab to review at your profile information. If you ever wish to change any part of the profile, do so at anytime by changing the information desired (confirmation needed for the student number), and press the \"change\" button, and you are all set! For more information, hover your mouse over the labels for information about that specific part.");
		profileHelpText.setBounds(16, 122, 291, 859);
		profileHelpPanel.add(profileHelpText);
		
		JLabel profileHelpLabel = new JLabel("Profile Information");
		profileHelpLabel.setBounds(6, 6, 313, 135);
		profileHelpPanel.add(profileHelpLabel);
		profileHelpLabel.setFont(new Font("Calibri", Font.PLAIN, 36));
		profileHelpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name:");
		lblNewLabel_1.setBounds(400, 50, 100, 30);
		profilePanel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		JLabel label_1 = new JLabel("Student Grade:");
		label_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_1.setBounds(400, 100, 100, 30);
		profilePanel.add(label_1);
		tabbedPane.setEnabledAt(0, true);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Service Hours", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(0, 0, 325, 1002);
		panel_2.add(panel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(16, 93, 291, 17);
		panel_3.add(separator_1);
		
		JLabel label = new JLabel("Community Service");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.PLAIN, 36));
		label.setBounds(6, 6, 313, 135);
		panel_3.add(label);
		
		JTextPane txtpnUseThisTab_1 = new JTextPane();
		txtpnUseThisTab_1.setFont(new Font("Calibri", Font.PLAIN, 24));
		txtpnUseThisTab_1.setText("Use this tab to check on your community service hours, rewards, etc. If you ever wish to update anything, do so at anytime by changing the information desired, and pressing the \"change\" button. For more information, hover your mouse over the labels for information about that specific part.");
		txtpnUseThisTab_1.setEditable(false);
		txtpnUseThisTab_1.setBackground(Color.LIGHT_GRAY);
		txtpnUseThisTab_1.setBounds(16, 122, 291, 859);
		panel_3.add(txtpnUseThisTab_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Rankings", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(0, 0, 325, 1002);
		panel_4.add(panel_5);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(16, 93, 291, 17);
		panel_5.add(separator_2);
		
		JLabel lblLeaderboard = new JLabel("Leaderboard Ranks");
		lblLeaderboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeaderboard.setFont(new Font("Calibri", Font.PLAIN, 36));
		lblLeaderboard.setBounds(6, 6, 313, 135);
		panel_5.add(lblLeaderboard);
		
		JTextPane txtpnSeeWhoIs = new JTextPane();
		txtpnSeeWhoIs.setFont(new Font("Calibri", Font.PLAIN, 24));
		txtpnSeeWhoIs.setText("See who is in the lead with this tab. It shows how many hours of community service everyone in this chapter has. Your name is highlighted in bold, to see if you need to do more community service to catch up. For more information, hover over the part you want to know more about.");
		txtpnSeeWhoIs.setEditable(false);
		txtpnSeeWhoIs.setBackground(Color.LIGHT_GRAY);
		txtpnSeeWhoIs.setBounds(16, 122, 291, 859);
		panel_5.add(txtpnSeeWhoIs);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Reports", null, panel_6, null);
		panel_6.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(0, 0, 325, 1002);
		panel_6.add(panel_7);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(16, 93, 291, 17);
		panel_7.add(separator_3);
		
		JLabel lblGenerateReports = new JLabel("Generate Reports");
		lblGenerateReports.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenerateReports.setFont(new Font("Calibri", Font.PLAIN, 36));
		lblGenerateReports.setBounds(6, 6, 313, 135);
		panel_7.add(lblGenerateReports);
		
		JTextPane txtpnUseThisTab_2 = new JTextPane();
		txtpnUseThisTab_2.setText("Use this tab to generate reports based on the hours or awards done by students. You can generate each of them monthly, or weekly. For more information, hover over the part you wish to know more about.");
		txtpnUseThisTab_2.setFont(new Font("Calibri", Font.PLAIN, 24));
		txtpnUseThisTab_2.setEditable(false);
		txtpnUseThisTab_2.setBackground(Color.LIGHT_GRAY);
		txtpnUseThisTab_2.setBounds(16, 122, 291, 859);
		panel_7.add(txtpnUseThisTab_2);
	}
}

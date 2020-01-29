package org.fbla_pbl.pernod.coding_programming;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField profile_nameTextField;
	private JPasswordField profile_currentNumberField;
	private JPasswordField profile_confirmNumberField;
	private JPasswordField profile_newNumberField;
	private JTextField serviceHours_totalTextField;
	private JTable rankings_table;

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
		setBounds(100, 100, 780, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Calibri", Font.PLAIN, 16));
		tabbedPane.setBounds(6, 5, 768, 598);
		contentPane.add(tabbedPane);
		
		/*----------------------------------------------------------------------------------------Profile Tab----------------------------------------------------------------------------------------------------*/
		
		/**
		 * Gui Creation
		 */
		
		JPanel profile_panel = new JPanel();
		tabbedPane.addTab("Profile", null, profile_panel, null);
		profile_panel.setLayout(null);
		
		JPanel profile_HelpPanel = new JPanel();
		profile_HelpPanel.setBackground(Color.LIGHT_GRAY);
		profile_HelpPanel.setBounds(0, 0, 325, 552);
		profile_panel.add(profile_HelpPanel);
		profile_HelpPanel.setLayout(null);
		
		JSeparator profile_HelpSeparator = new JSeparator();
		profile_HelpSeparator.setBounds(16, 77, 291, 12);
		profile_HelpPanel.add(profile_HelpSeparator);
		profile_HelpSeparator.setForeground(Color.BLACK);
		
		JTextPane profile_HelpText = new JTextPane();
		profile_HelpText.setEditable(false);
		profile_HelpText.setBackground(Color.LIGHT_GRAY);
		profile_HelpText.setFont(new Font("Calibri", profile_HelpText.getFont().getStyle(), 24));
		profile_HelpText.setText("Use this tab to review at your profile information. If you ever wish to change any part of the profile, do so at anytime by changing the information desired (confirmation needed for the student number), and press the \"change\" button, and you are all set! For more information, hover your mouse over the labels for information about that specific part.");
		profile_HelpText.setBounds(16, 101, 291, 428);
		profile_HelpPanel.add(profile_HelpText);
		
		JLabel profile_HelpLabel = new JLabel("Profile Information");
		profile_HelpLabel.setBounds(6, -11, 313, 135);
		profile_HelpPanel.add(profile_HelpLabel);
		profile_HelpLabel.setFont(new Font("Calibri", Font.PLAIN, 36));
		profile_HelpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel profile_nameLabel = new JLabel("Student Name");
		profile_nameLabel.setToolTipText("The legal name of the chapter member. If it is ever changed, change it with the text field to the right.");
		profile_nameLabel.setBounds(400, 40, 150, 30);
		profile_panel.add(profile_nameLabel);
		profile_nameLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		JLabel profile_gradeLabel = new JLabel("Student Grade");
		profile_gradeLabel.setToolTipText("The grade of the chapter member. It does not update every year, so make sure you change it every year by changing it with the dropdown on the right.");
		profile_gradeLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		profile_gradeLabel.setBounds(400, 90, 150, 30);
		profile_panel.add(profile_gradeLabel);
		
		JLabel profile_currentNumberLabel = new JLabel("Current Student No.");
		profile_currentNumberLabel.setToolTipText("Enter current student number if you wish to change it.");
		profile_currentNumberLabel.setBounds(400, 180, 150, 30);
		profile_panel.add(profile_currentNumberLabel);
		profile_currentNumberLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		JLabel profile_newNumberLabel = new JLabel("New Student No.");
		profile_newNumberLabel.setToolTipText("Enter in the number you wish to have.");
		profile_newNumberLabel.setBounds(400, 230, 150, 30);
		profile_panel.add(profile_newNumberLabel);
		profile_newNumberLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		JLabel profile_confirmNumberLabel = new JLabel("Confirm Student No.");
		profile_confirmNumberLabel.setToolTipText("Confirm the student number by typing it again in here.");
		profile_confirmNumberLabel.setBounds(400, 280, 150, 30);
		profile_panel.add(profile_confirmNumberLabel);
		profile_confirmNumberLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		JSeparator profile_numberSeparator = new JSeparator();
		profile_numberSeparator.setForeground(Color.BLACK);
		profile_numberSeparator.setBounds(324, 150, 424, 6);
		profile_panel.add(profile_numberSeparator);
		
		JSeparator profile_buttonSeparator = new JSeparator();
		profile_buttonSeparator.setForeground(Color.BLACK);
		profile_buttonSeparator.setBounds(324, 330, 424, 6);
		profile_panel.add(profile_buttonSeparator);
		
		profile_nameTextField = new JTextField();
		profile_nameLabel.setLabelFor(profile_nameTextField);
		profile_nameTextField.setFont(new Font("Calibri", Font.PLAIN, 16));
		profile_nameTextField.setBounds(551, 40, 150, 30);
		profile_panel.add(profile_nameTextField);
		profile_nameTextField.setColumns(10);
		
		JComboBox<?> profile_gradeDropdown = new JComboBox<Object>();
		profile_gradeLabel.setLabelFor(profile_gradeDropdown);
		profile_gradeDropdown.setFont(new Font("Calibri", Font.PLAIN, 16));
		profile_gradeDropdown.setModel(new DefaultComboBoxModel(new String[] {"Choose Grade", "Freshman", "Sophomore", "Junior", "Senior"}));
		profile_gradeDropdown.setBounds(551, 90, 150, 30);
		profile_panel.add(profile_gradeDropdown);
		
		profile_currentNumberField = new JPasswordField();
		profile_currentNumberLabel.setLabelFor(profile_currentNumberField);
		profile_currentNumberField.setFont(new Font("Calibri", Font.PLAIN, 16));
		profile_currentNumberField.setBounds(551, 181, 151, 30);
		profile_panel.add(profile_currentNumberField);
		
		profile_newNumberField = new JPasswordField();
		profile_newNumberLabel.setLabelFor(profile_newNumberField);
		profile_newNumberField.setFont(new Font("Calibri", Font.PLAIN, 16));
		profile_newNumberField.setBounds(551, 230, 151, 30);
		profile_panel.add(profile_newNumberField);
		
		profile_confirmNumberField = new JPasswordField();
		profile_confirmNumberLabel.setLabelFor(profile_confirmNumberField);
		profile_confirmNumberField.setFont(new Font("Calibri", Font.PLAIN, 16));
		profile_confirmNumberField.setBounds(551, 280, 151, 30);
		profile_panel.add(profile_confirmNumberField);
		
		JButton profile_resetButton = new JButton("Reset Changes");
		profile_resetButton.setToolTipText("Use this if you change your mind to change the input to the defaults.");
		profile_resetButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		profile_resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton profile_confirmButton = new JButton("Confirm Changes");
		profile_confirmButton.setToolTipText("Press this to confirm the changes you've made to your profile.");
		profile_confirmButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		profile_confirmButton.setBounds(377, 343, 325, 57);
		profile_panel.add(profile_confirmButton);
		profile_resetButton.setBounds(377, 415, 325, 57);
		profile_panel.add(profile_resetButton);
		
		JButton profile_deleteAccountButton = new JButton("Delete Account");
		profile_deleteAccountButton.setToolTipText("If you wish to delete your account, press this to do so.");
		profile_deleteAccountButton.setForeground(Color.RED);
		profile_deleteAccountButton.setBackground(new Color(255, 204, 204));
		profile_deleteAccountButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		profile_deleteAccountButton.setBounds(377, 483, 325, 57);
		profile_panel.add(profile_deleteAccountButton);
		
		/*----------------------------------------------------------------------------------------Service Hours Tab----------------------------------------------------------------------------------------------------*/

		
		JPanel serviceHours_panels = new JPanel();
		serviceHours_panels.setLayout(null);
		tabbedPane.addTab("Service Hours", null, serviceHours_panels, null);
		
		JPanel serviceHours_HelpPanel = new JPanel();
		serviceHours_HelpPanel.setLayout(null);
		serviceHours_HelpPanel.setBackground(Color.LIGHT_GRAY);
		serviceHours_HelpPanel.setBounds(0, 0, 325, 552);
		serviceHours_panels.add(serviceHours_HelpPanel);
		
		JSeparator serviceHours_HelpSeparator = new JSeparator();
		serviceHours_HelpSeparator.setForeground(Color.BLACK);
		serviceHours_HelpSeparator.setBounds(16, 77, 291, 17);
		serviceHours_HelpPanel.add(serviceHours_HelpSeparator);
		
		JLabel serviceHours_helpLabel = new JLabel("Community Service");
		serviceHours_helpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		serviceHours_helpLabel.setFont(new Font("Calibri", Font.PLAIN, 36));
		serviceHours_helpLabel.setBounds(6, -10, 313, 135);
		serviceHours_HelpPanel.add(serviceHours_helpLabel);
		
		JTextPane serviceHours_HelpText = new JTextPane();
		serviceHours_HelpText.setFont(new Font("Calibri", Font.PLAIN, 24));
		serviceHours_HelpText.setText("Use this tab to check on your community service hours, rewards, etc. If you ever wish to update anything, do so at anytime by changing the information desired, and pressing the \"change\" button. For more information, hover your mouse over the labels for information about that specific part.");
		serviceHours_HelpText.setEditable(false);
		serviceHours_HelpText.setBackground(Color.LIGHT_GRAY);
		serviceHours_HelpText.setBounds(16, 101, 291, 413);
		serviceHours_HelpPanel.add(serviceHours_HelpText);
		
		JLabel serviceHours_totalLabel = new JLabel("Total Service Hours:");
		serviceHours_totalLabel.setToolTipText("The total service hours you have completed.");
		serviceHours_totalLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		serviceHours_totalLabel.setBounds(400, 40, 150, 30);
		serviceHours_panels.add(serviceHours_totalLabel);
		
		JSeparator serviceHours_hoursSeparator = new JSeparator();
		serviceHours_hoursSeparator.setForeground(Color.BLACK);
		serviceHours_hoursSeparator.setBounds(323, 100, 424, 6);
		serviceHours_panels.add(serviceHours_hoursSeparator);
		
		serviceHours_totalTextField = new JTextField();
		serviceHours_totalLabel.setLabelFor(serviceHours_totalTextField);
		serviceHours_totalTextField.setBackground(new Color(204, 204, 204));
		serviceHours_totalTextField.setBorder(null);
		serviceHours_totalTextField.setEditable(false);
		serviceHours_totalTextField.setBounds(562, 43, 150, 26);
		serviceHours_panels.add(serviceHours_totalTextField);
		serviceHours_totalTextField.setColumns(10);
		
		JLabel serviceHours_newHoursLabel = new JLabel("New Service Hours");
		serviceHours_newHoursLabel.setToolTipText("Change this number to add these hours to your total, to keep track of the hours you've worked.");
		serviceHours_newHoursLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		serviceHours_newHoursLabel.setBounds(400, 140, 150, 30);
		serviceHours_panels.add(serviceHours_newHoursLabel);
		
		JSpinner serviceHours_newHoursSpinner = new JSpinner();
		serviceHours_newHoursLabel.setLabelFor(serviceHours_newHoursSpinner);
		serviceHours_newHoursSpinner.setFont(new Font("Calibri", Font.PLAIN, 16));
		serviceHours_newHoursSpinner.setBounds(562, 141, 150, 30);
		serviceHours_panels.add(serviceHours_newHoursSpinner);
		
		JLabel serviceHours_awardsLabel = new JLabel("Earned Awards");
		serviceHours_awardsLabel.setToolTipText("The rewards earned from the CSA award program. Make sure to check the awards you have to keep track of them.");
		serviceHours_awardsLabel.setFont(new Font("Calibri", Font.PLAIN, 16));
		serviceHours_awardsLabel.setBounds(400, 190, 150, 30);
		serviceHours_panels.add(serviceHours_awardsLabel);
		
		JCheckBox serviceHours_csaCommunity = new JCheckBox("CSA Community");
		serviceHours_awardsLabel.setLabelFor(serviceHours_csaCommunity);
		serviceHours_csaCommunity.setFont(new Font("Calibri", Font.PLAIN, 16));
		serviceHours_csaCommunity.setBounds(562, 193, 150, 23);
		serviceHours_panels.add(serviceHours_csaCommunity);
		
		JCheckBox serviceHours_csaService = new JCheckBox("CSA Service");
		serviceHours_csaService.setFont(new Font("Calibri", Font.PLAIN, 16));
		serviceHours_csaService.setBounds(562, 238, 150, 23);
		serviceHours_panels.add(serviceHours_csaService);
		
		JCheckBox serviceHours_csaAchievement = new JCheckBox("CSA Achievement");
		serviceHours_csaAchievement.setFont(new Font("Calibri", Font.PLAIN, 16));
		serviceHours_csaAchievement.setBounds(562, 283, 150, 23);
		serviceHours_panels.add(serviceHours_csaAchievement);
		
		JSeparator serviceHours_numberSeparator = new JSeparator();
		serviceHours_numberSeparator.setForeground(Color.BLACK);
		serviceHours_numberSeparator.setBounds(323, 333, 424, 6);
		serviceHours_panels.add(serviceHours_numberSeparator);
		
		JButton serviceHours_confirmButton = new JButton("Confirm Changes");
		serviceHours_confirmButton.setToolTipText("Press this if you want to confirm these changes to the system.");
		serviceHours_confirmButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		serviceHours_confirmButton.setBounds(375, 380, 325, 57);
		serviceHours_panels.add(serviceHours_confirmButton);
		
		JButton serviceHours_resetButton = new JButton("Reset Changes");
		serviceHours_resetButton.setToolTipText("If you make a mistake, and you didn't mean to edit, press this to set it back to default.");
		serviceHours_resetButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		serviceHours_resetButton.setBounds(375, 450, 325, 57);
		serviceHours_panels.add(serviceHours_resetButton);
		
		/*----------------------------------------------------------------------------------------Rankings Tab----------------------------------------------------------------------------------------------------*/

		
		JPanel rankings_panel = new JPanel();
		tabbedPane.addTab("Rankings", null, rankings_panel, null);
		rankings_panel.setLayout(null);
		
		JPanel rankings_HelpPanel = new JPanel();
		rankings_HelpPanel.setLayout(null);
		rankings_HelpPanel.setBackground(Color.LIGHT_GRAY);
		rankings_HelpPanel.setBounds(0, 0, 325, 552);
		rankings_panel.add(rankings_HelpPanel);
		
		JSeparator rankings_HelpSeparator = new JSeparator();
		rankings_HelpSeparator.setForeground(Color.BLACK);
		rankings_HelpSeparator.setBounds(16, 77, 291, 17);
		rankings_HelpPanel.add(rankings_HelpSeparator);
		
		JLabel rankings_HelpLabel = new JLabel("Leaderboard Ranks");
		rankings_HelpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rankings_HelpLabel.setFont(new Font("Calibri", Font.PLAIN, 36));
		rankings_HelpLabel.setBounds(6, -10, 313, 135);
		rankings_HelpPanel.add(rankings_HelpLabel);
		
		JTextPane rankings_HelpText = new JTextPane();
		rankings_HelpText.setFont(new Font("Calibri", Font.PLAIN, 24));
		rankings_HelpText.setText("See who is in the lead with this tab. It shows how many hours of community service everyone in this chapter has. Your name is highlighted in bold, to see if you need to do more community service to catch up.");
		rankings_HelpText.setEditable(false);
		rankings_HelpText.setBackground(Color.LIGHT_GRAY);
		rankings_HelpText.setBounds(16, 101, 291, 380);
		rankings_HelpPanel.add(rankings_HelpText);
		
		JScrollPane rankings_scrollPane = new JScrollPane();
		rankings_scrollPane.setBounds(345, 20, 382, 512);
		rankings_panel.add(rankings_scrollPane);
		
		String[] rankings_columnTitles = {
			"Rank",
			"Full Name",
			"Grade",
			"# of Service Hours"
		};
		
		Object[][] rankings_tableData = {
				{0, "admin", "N/A", 0}	
		};
		
		rankings_table = new JTable(rankings_tableData, rankings_columnTitles);
		rankings_scrollPane.setViewportView(rankings_table);
		
		/*----------------------------------------------------------------------------------------Reports Tab----------------------------------------------------------------------------------------------------*/

		
		JPanel reports_panel = new JPanel();
		tabbedPane.addTab("Reports", null, reports_panel, null);
		reports_panel.setLayout(null);
		
		JPanel reports_HelpPanel = new JPanel();
		reports_HelpPanel.setLayout(null);
		reports_HelpPanel.setBackground(Color.LIGHT_GRAY);
		reports_HelpPanel.setBounds(0, 0, 325, 552);
		reports_panel.add(reports_HelpPanel);
		
		JSeparator reports_HelpSeparator = new JSeparator();
		reports_HelpSeparator.setForeground(Color.BLACK);
		reports_HelpSeparator.setBounds(16, 77, 291, 17);
		reports_HelpPanel.add(reports_HelpSeparator);
		
		JLabel reports_HelpLabel = new JLabel("Generate Reports");
		reports_HelpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reports_HelpLabel.setFont(new Font("Calibri", Font.PLAIN, 36));
		reports_HelpLabel.setBounds(6, -10, 313, 135);
		reports_HelpPanel.add(reports_HelpLabel);
		
		JTextPane reports_HelpText = new JTextPane();
		reports_HelpText.setText("Use this tab to generate reports based on the hours or awards done by students. You can generate each of them monthly, or weekly. For more information, hover over the part you wish to know more about.");
		reports_HelpText.setFont(new Font("Calibri", Font.PLAIN, 24));
		reports_HelpText.setEditable(false);
		reports_HelpText.setBackground(Color.LIGHT_GRAY);
		reports_HelpText.setBounds(16, 101, 291, 345);
		reports_HelpPanel.add(reports_HelpText);
		
		JButton reports_serviceReportButton = new JButton("Generate Community Service Report");
		reports_serviceReportButton.setToolTipText("Generates a communit service report per student. Either weekly or monthly reports can be generated.");
		reports_serviceReportButton.setBounds(370, 91, 325, 162);
		reports_panel.add(reports_serviceReportButton);
		
		JButton reports_csaReportButton = new JButton("Generate CSA Program Report");
		reports_csaReportButton.setToolTipText("Generates a report based on your earned awards, total hours for the week/month, and how many more hours you need until the next reward.");
		reports_csaReportButton.setBounds(370, 305, 325, 162);
		reports_panel.add(reports_csaReportButton);
	}
}

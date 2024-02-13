package EMPSClient;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import javafx.scene.control.ContentDisplay;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CLogin {

	private JFrame frmClientLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CLogin window = new CLogin();
					window.frmClientLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClientLogin = new JFrame();
		frmClientLogin.setTitle("Client Login");
		frmClientLogin.getContentPane().setBackground(new Color(255, 255, 255));
		frmClientLogin.setForeground(new Color(25, 25, 112));
		frmClientLogin.setBounds(100, 100, 450, 300);
		frmClientLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\SLITT\\Copy of Expert Skilled Workers - Made with PosterMyWall.png"));
		frmClientLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmClientLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(195, 25, 134, 35);
		frmClientLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(25, 25, 112));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(195, 95, 134, 35);
		frmClientLogin.getContentPane().add(lblPassword);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(195, 54, 208, 35);
		frmClientLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
			
		});
		btnNewButton.setForeground(new Color(0, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(317, 195, 107, 41);
		frmClientLogin.getContentPane().add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (DataSaved.userLogin(textField.getText(), passwordField.getText())==true) {
					JOptionPane.showMessageDialog(null, "User Authorized");
					DataSaved.serverUI(textField.getText());
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Wrong Credentials");
				}
			}
		});
		btnLogin.setForeground(new Color(0, 255, 255));
		btnLogin.setBackground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogin.setBounds(170, 195, 107, 41);
		frmClientLogin.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Guest");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				surveyQ1 q1 = new surveyQ1();
				q1.main(null);
				dispose();
			}
		});
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setForeground(new Color(0, 255, 255));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExit.setBounds(29, 195, 107, 41);
		frmClientLogin.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(CLogin.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		lblNewLabel_1.setBounds(-78, -98, 349, 359);
		frmClientLogin.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordField.setBounds(195, 124, 208, 35);
		frmClientLogin.getContentPane().add(passwordField);
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
}

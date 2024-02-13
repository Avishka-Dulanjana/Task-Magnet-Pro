package EMPSServer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ALogin {

	private JFrame frmAdminLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	public static String uname = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ALogin window = new ALogin();
					window.frmAdminLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ALogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminLogin = new JFrame();
		frmAdminLogin.setTitle("Admin Login");
		frmAdminLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(ALogin.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		frmAdminLogin.getContentPane().setBackground(new Color(255, 255, 255));
		frmAdminLogin.getContentPane().setForeground(new Color(0, 255, 255));
		frmAdminLogin.setBounds(100, 100, 450, 300);
		frmAdminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminLogin.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(212, 49, 179, 41);
		frmAdminLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(212, 126, 179, 41);
		frmAdminLogin.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(212, 23, 114, 25);
		frmAdminLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(212, 100, 114, 25);
		frmAdminLogin.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean result = false;
				try {
					result = DBCRUD.authenticateUN(textField.getText(), passwordField.getText());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String auth=null;
				if (result==true) {
					auth = "Authorised!";
					ServerAdminUX.uname = textField.getText();
					JOptionPane.showMessageDialog(null, auth);

					
					ServerAdminUX.main(null);
					frmAdminLogin.setVisible(false);
					frmAdminLogin.dispose();
					try {
						//DBCRUD.dataWrite("5,4,3,2,4,5,1,3,4,5");//test db data write
						//System.out.println(DBCRUD.getRecordByID(3));//test db data retrieve
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					frmAdminLogin.setVisible(false); frmAdminLogin.dispose();
					
				}else {
					auth="Not Authorised!";
					JOptionPane.showMessageDialog(null, auth);
				}
			}
		});
		btnNewButton.setBounds(118, 255, 123, 31);
		frmAdminLogin.getContentPane().add(btnNewButton);
			
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 255, 255));
		btnNewButton.setBounds(212, 196, 134, 41);
		frmAdminLogin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setIcon(new ImageIcon(ALogin.class.getResource("/EMPSServer/images/login.png")));
		lblNewLabel_1.setBounds(29, 11, 251, 194);
		frmAdminLogin.getContentPane().add(lblNewLabel_1);
	}

}

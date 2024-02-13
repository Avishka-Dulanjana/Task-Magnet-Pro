package EMPSServer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Button;

public class UserMgt extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMgt frame = new UserMgt();
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
	@SuppressWarnings("unchecked")
	public UserMgt() {
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserMgt.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		setTitle("User Management");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 326);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCurrentUserList = new JLabel("Current User List");
		lblCurrentUserList.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCurrentUserList.setBounds(28, 25, 149, 14);
		contentPane.add(lblCurrentUserList);
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 50, 360, 131);
		contentPane.add(scrollPane);
		
		JTextArea txtpnUser = new JTextArea();
		txtpnUser.setBackground(new Color(0, 0, 0));
		txtpnUser.setForeground(Color.WHITE);
		scrollPane.setViewportView(txtpnUser);
		txtpnUser.setEditable(false);
		
		JLabel lblAddNewUser = new JLabel("Add New User");
		lblAddNewUser.setBounds(28, 192, 110, 14);
		lblAddNewUser.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblAddNewUser);
		
		txtName = new JTextField();
		txtName.setBounds(44, 228, 110, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(44, 210, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblUserType = new JLabel("User Type");
		lblUserType.setBounds(164, 210, 62, 14);
		contentPane.add(lblUserType);
		
		
		
		JComboBox comboType = new JComboBox();
		comboType.setForeground(new Color(0, 255, 255));
		comboType.setBackground(new Color(0, 0, 0));
		comboType.setBounds(164, 228, 96, 20);
		comboType.setModel(new DefaultComboBoxModel(new String[] {"Administrator", "Operator", "User"}));
		contentPane.add(comboType);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setForeground(new Color(0, 255, 255));
		btnAdd.setBackground(new Color(0, 0, 0));
		btnAdd.setBounds(307, 256, 81, 23);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String type = (String) comboType.getSelectedItem();
				if(!txtName.getText().equals("")&&!txtPass.getText().equals("")) {
				try {
					if(DBCRUD.addUser(txtName.getText(), txtPass.getText(), type )==true) {
					JOptionPane.showMessageDialog(null, txtName.getText()+" Added Successful!");
					txtName.setText(null);
					txtPass.setText(null);
					}else {
						JOptionPane.showMessageDialog(null, " ERROR!");
					}
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				JOptionPane.showMessageDialog(null, "One or More Fields Empty!");
			}
			}
		});
		contentPane.add(btnAdd);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(279, 213, 62, 14);
		contentPane.add(lblPassword);
		
		txtPass = new JTextField();
		txtPass.setBounds(278, 228, 110, 20);
		txtPass.setColumns(10);
		contentPane.add(txtPass);
		
		JButton btnGetListrefresh = new JButton("Get List/Refresh");
		btnGetListrefresh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnGetListrefresh.setForeground(new Color(0, 255, 255));
		btnGetListrefresh.setBackground(new Color(0, 0, 0));
		btnGetListrefresh.setBounds(270, 21, 131, 23);
		btnGetListrefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					txtpnUser.setText(DBCRUD.getUserList());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(btnGetListrefresh);
	}
}

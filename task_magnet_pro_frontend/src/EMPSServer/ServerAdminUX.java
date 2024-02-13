package EMPSServer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ServerAdminUX extends JFrame {

	private JPanel contentPane;
	public static String uname = "test";

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerAdminUX frame = new ServerAdminUX();
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
	public ServerAdminUX() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ServerAdminUX.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		setTitle("Server UI");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 476, 437);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 153));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Controls", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 102, 204)));
		panel.setBounds(5, 202, 443, 185);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnViewRecords = new JButton("View Records");
		btnViewRecords.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewRecords.setForeground(new Color(0, 255, 204));
		btnViewRecords.setBackground(Color.BLACK);
		
		btnViewRecords.setBounds(10, 141, 125, 31);
		panel.add(btnViewRecords);
		
		JButton btnReports = new JButton("Reports");
		btnReports.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReports.setForeground(new Color(0, 255, 204));
		btnReports.setBackground(new Color(0, 0, 0));
		
		btnReports.setBounds(155, 141, 125, 31);
		panel.add(btnReports);
		
		JButton btnUserMgt = new JButton("User Management");
		btnUserMgt.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnUserMgt.setForeground(new Color(0, 255, 204));
		btnUserMgt.setBackground(new Color(0, 0, 0));
		
		btnUserMgt.setBounds(308, 141, 125, 31);
		panel.add(btnUserMgt);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ServerAdminUX.class.getResource("/EMPSServer/images/record.png")));
		lblNewLabel_1.setBounds(21, 30, 100, 100);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ServerAdminUX.class.getResource("/EMPSServer/images/report.png")));
		label.setBounds(168, 30, 100, 100);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ServerAdminUX.class.getResource("/EMPSServer/images/users.png")));
		label_1.setBounds(318, 30, 100, 100);
		panel.add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(ServerAdminUX.class.getResource("/EMPSServer/images/back_blue.png")));
		label_3.setBounds(0, 0, 443, 185);
		panel.add(label_3);
		btnUserMgt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserMgt.main(null);
			}
		});
		btnReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reports.main(null);
			}
		});
		btnViewRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RecordViewer.main(null);
			}
		});
		
		JLabel lblCurrentIpAddress = new JLabel("Current IP Address");
		lblCurrentIpAddress.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCurrentIpAddress.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCurrentIpAddress.setBounds(329, 26, 119, 14);
		contentPane.add(lblCurrentIpAddress);
		
		JLabel iplbl = new JLabel("0.0.0.0");
		iplbl.setBounds(329, 51, 119, 15);
		iplbl.setFont(new Font("Dialog", Font.BOLD, 12));
		iplbl.setHorizontalAlignment(SwingConstants.RIGHT);
		iplbl.setForeground(Color.RED);
		contentPane.add(iplbl);
		
		JLabel lblUser = new JLabel("User:");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUser.setBounds(5, 5, 83, 14);
		contentPane.add(lblUser);
		
		JLabel lblAdmin = new JLabel("-----");
		lblAdmin.setBackground(Color.WHITE);
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdmin.setBounds(15, 26, 109, 14);
		lblAdmin.setForeground(Color.RED);
		contentPane.add(lblAdmin);
		
		JLabel lblTotalNumberOf = new JLabel("Total Number of Records");
		lblTotalNumberOf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTotalNumberOf.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalNumberOf.setBounds(291, 77, 157, 14);
		contentPane.add(lblTotalNumberOf);
		
		JLabel lbl_count = new JLabel("----");
		lbl_count.setBounds(339, 102, 109, 15);
		lbl_count.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_count.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_count.setForeground(Color.RED);
		contentPane.add(lbl_count);
		
		JLabel lblLookupName = new JLabel("Server Lookup Name:");
		lblLookupName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLookupName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLookupName.setBounds(291, 128, 157, 14);
		contentPane.add(lblLookupName);
		
		JLabel lblRmilocalhostboundserver = new JLabel("rmi://127.0.0.1:1212/BoundServer");
		lblRmilocalhostboundserver.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRmilocalhostboundserver.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRmilocalhostboundserver.setBounds(169, 153, 279, 14);
		lblRmilocalhostboundserver.setForeground(Color.RED);
		contentPane.add(lblRmilocalhostboundserver);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(ServerAdminUX.class.getResource("/EMPSServer/images/server.png")));
		lblNewLabel.setBounds(5, 26, 179, 187);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(145, -37, 379, 264);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setIcon(new ImageIcon(ServerAdminUX.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		
		
		//request IP address from the getIP method that uses ipify.org web API
		addWindowListener(new WindowAdapter() { 
			@Override
			public void windowOpened(WindowEvent arg0) {
				
				iplbl.setText(API.getIP());//SET ip address label
				try {//set record count label
					lbl_count.setText(Integer.toString(DBCRUD.recCount()));
					lblAdmin.setText(uname);
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}
}

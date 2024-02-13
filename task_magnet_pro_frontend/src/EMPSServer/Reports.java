package EMPSServer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Reports extends JFrame {
	

	public static int[] starArray1 = new int[10];
	public static int[] starArray2 = new int[10];
	public static int[] starArray3 = new int[10];
	public static int[] starArray4 = new int[10];
	public static int[] starArray5 = new int[10];
	public static int[] starArray6 = new int[10];
	public static int[] starArray7 = new int[10];
	public static int[] starArray8 = new int[10];
	public static int[] starArray9 = new int[10];
	public static int[] starArray10 = new int[10];
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reports frame = new Reports();
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
	public Reports() {
		setTitle("View Question Rating Summery Reports");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 645, 358);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("1: I am proud to work for this company ........................................................................................");
		label.setFont(new Font("Calibri", Font.BOLD, 14));
		label.setBounds(13, 34, 421, 17);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2: I feel that my career goals can be met at this company...........................................................");
		label_1.setFont(new Font("Calibri", Font.BOLD, 14));
		label_1.setBounds(13, 62, 421, 17);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("3:The providing equipemnts & Resources enough to work........................................................");
		label_2.setFont(new Font("Calibri", Font.BOLD, 14));
		label_2.setBounds(13, 90, 421, 17);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("4: I am encouraged to come up with better way of doing things................");
		label_3.setFont(new Font("Calibri", Font.BOLD, 14));
		label_3.setBounds(13, 118, 421, 17);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("5:My manager & Team Members encourages me for Tasks....................................................");
		label_4.setFont(new Font("Calibri", Font.BOLD, 14));
		label_4.setBounds(13, 146, 421, 17);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("6:I believe in our leadership’s approach to achieving these goals........................................");
		label_5.setFont(new Font("Calibri", Font.BOLD, 14));
		label_5.setBounds(13, 174, 421, 17);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("7:  Everybody is treated fairly in this organization…....................................................");
		label_6.setFont(new Font("Calibri", Font.BOLD, 14));
		label_6.setBounds(13, 202, 421, 17);
		contentPane.add(label_6);
		
		JButton btnViewSummery = new JButton(" View");
		btnViewSummery.setForeground(new Color(0, 255, 255));
		btnViewSummery.setBackground(new Color(0, 0, 0));
		btnViewSummery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.arraycopy(DBCRUD.qStarCount(1), 0, starArray1, 0, 10);
					GenReport.SetVal(starArray1[0],starArray1[1],starArray1[2],starArray1[3],starArray1[4],starArray1[5],starArray1[6],starArray1[7],starArray1[8],starArray1[9]);
					GenReport.main(null);
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnViewSummery.setBounds(444, 31, 133, 23);
		contentPane.add(btnViewSummery);
		
		JButton button = new JButton(" View");
		button.setForeground(new Color(0, 255, 255));
		button.setBackground(new Color(0, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.arraycopy(DBCRUD.qStarCount(2), 0, starArray2, 0, 10);
					GenReport.SetVal(starArray2[0],starArray2[1],starArray2[2],starArray2[3],starArray2[4],starArray2[5],starArray2[6],starArray2[7],starArray2[8],starArray2[9]);
					GenReport.main(null);
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(444, 59, 133, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("View ");
		button_1.setForeground(new Color(0, 255, 255));
		button_1.setBackground(new Color(0, 0, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.arraycopy(DBCRUD.qStarCount(3), 0, starArray3, 0, 10);
					GenReport.SetVal(starArray3[0],starArray3[1],starArray3[2],starArray3[3],starArray3[4],starArray3[5],starArray3[6],starArray3[7],starArray3[8],starArray3[9]);
					GenReport.main(null);
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setBounds(444, 87, 133, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("View");
		button_2.setForeground(new Color(0, 255, 255));
		button_2.setBackground(new Color(0, 0, 0));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.arraycopy(DBCRUD.qStarCount(4), 0, starArray4, 0, 10);
					GenReport.SetVal(starArray4[0],starArray4[1],starArray4[2],starArray4[3],starArray4[4],starArray4[5],starArray4[6],starArray4[7],starArray4[8],starArray4[9]);
					GenReport.main(null);
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setBounds(444, 115, 133, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("View ");
		button_3.setForeground(new Color(0, 255, 255));
		button_3.setBackground(new Color(0, 0, 0));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.arraycopy(DBCRUD.qStarCount(5), 0, starArray5, 0, 10);
					GenReport.SetVal(starArray5[0],starArray5[1],starArray5[2],starArray5[3],starArray5[4],starArray5[5],starArray5[6],starArray5[7],starArray5[8],starArray5[9]);
					GenReport.main(null);
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setBounds(444, 143, 133, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("View");
		button_4.setForeground(new Color(0, 255, 255));
		button_4.setBackground(new Color(0, 0, 0));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.arraycopy(DBCRUD.qStarCount(6), 0, starArray6, 0, 10);
					GenReport.SetVal(starArray6[0],starArray6[1],starArray6[2],starArray6[3],starArray6[4],starArray6[5],starArray6[6],starArray6[7],starArray6[8],starArray6[9]);
					GenReport.main(null);
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_4.setBounds(444, 171, 133, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("View");
		button_5.setForeground(new Color(0, 255, 255));
		button_5.setBackground(new Color(0, 0, 0));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.arraycopy(DBCRUD.qStarCount(7), 0, starArray7, 0, 10);
					GenReport.SetVal(starArray7[0],starArray7[1],starArray7[2],starArray7[3],starArray7[4],starArray7[5],starArray7[6],starArray7[7],starArray7[8],starArray7[9]);
					GenReport.main(null);
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_5.setBounds(444, 199, 133, 23);
		contentPane.add(button_5);
		
		JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setIcon(new ImageIcon(Reports.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		label_10.setBounds(40, 66, 484, 210);
		contentPane.add(label_10);
	}
}

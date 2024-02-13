package EMPSClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class surveyQ1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					surveyQ1 frame = new surveyQ1();
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
	public surveyQ1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(surveyQ1.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 591, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton("");
		
		button_1.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_1.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(0, 0, 0));
		btnSubmit.setForeground(new Color(0, 255, 255));
		
		btnSubmit.setBounds(186, 286, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(0, 0, 0));
		btnCancel.setForeground(new Color(0, 255, 255));
		
		btnCancel.setBounds(321, 286, 89, 23);
		contentPane.add(btnCancel);
		
		
		button_1.setBounds(5, 216, 52, 40);
		
		
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_2.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		button_2.setContentAreaFilled(false);
		button_2.setBounds(62, 216, 52, 40);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_3.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		button_3.setContentAreaFilled(false);
		button_3.setBounds(119, 216, 52, 40);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_4.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		button_4.setContentAreaFilled(false);
		button_4.setBounds(176, 216, 52, 40);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_5.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		button_5.setContentAreaFilled(false);
		button_5.setBounds(233, 216, 52, 40);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_6.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		button_6.setContentAreaFilled(false);
		button_6.setBounds(290, 216, 52, 40);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_7.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		button_7.setContentAreaFilled(false);
		button_7.setBounds(347, 216, 52, 40);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_8.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		button_8.setContentAreaFilled(false);
		button_8.setBounds(404, 216, 52, 40);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_9.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		button_9.setContentAreaFilled(false);
		button_9.setBounds(461, 216, 52, 40);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setSelectedIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hh.png")));
		button_10.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/hg.png")));
		button_10.setContentAreaFilled(false);
		button_10.setBounds(518, 216, 52, 40);
		contentPane.add(button_10);
		
		JLabel lblQuestion = new JLabel("Question 1 : I am proud to work for this company");
		lblQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion.setForeground(new Color(0, 0, 0));
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuestion.setBounds(10, 118, 555, 66);
		contentPane.add(lblQuestion);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(surveyQ1.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		label.setBounds(5, 11, 188, 126);
		contentPane.add(label);
		
		button_1.setBorder(emptyBorder);
		button_1.setContentAreaFilled(false);
		button_2.setBorder(emptyBorder);
		button_2.setContentAreaFilled(false);
		button_3.setBorder(emptyBorder);
		button_3.setContentAreaFilled(false);
		button_4.setBorder(emptyBorder);
		button_4.setContentAreaFilled(false);
		button_5.setBorder(emptyBorder);
		button_5.setContentAreaFilled(false);
		button_6.setBorder(emptyBorder);
		button_6.setContentAreaFilled(false);
		button_7.setBorder(emptyBorder);
		button_7.setContentAreaFilled(false);
		button_8.setBorder(emptyBorder);
		button_8.setContentAreaFilled(false);
		button_9.setBorder(emptyBorder);
		button_9.setContentAreaFilled(false);
		button_10.setBorder(emptyBorder);
		button_10.setContentAreaFilled(false);
		
		//action listners
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(false);
				button_3.setSelected(false);
				button_4.setSelected(false);
				button_5.setSelected(false);
				button_6.setSelected(false);
				button_7.setSelected(false);
				button_8.setSelected(false);
				button_9.setSelected(false);
				button_10.setSelected(false);
				DataSaved.ratings[0]=1;
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(true);
				button_3.setSelected(false);
				button_4.setSelected(false);
				button_5.setSelected(false);
				button_6.setSelected(false);
				button_7.setSelected(false);
				button_8.setSelected(false);
				button_9.setSelected(false);
				button_10.setSelected(false);
				DataSaved.ratings[0]=2;
			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(true);
				button_3.setSelected(true);
				button_4.setSelected(false);
				button_5.setSelected(false);
				button_6.setSelected(false);
				button_7.setSelected(false);
				button_8.setSelected(false);
				button_9.setSelected(false);
				button_10.setSelected(false);
				DataSaved.ratings[0]=3;
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(true);
				button_3.setSelected(true);
				button_4.setSelected(true);
				button_5.setSelected(false);
				button_6.setSelected(false);
				button_7.setSelected(false);
				button_8.setSelected(false);
				button_9.setSelected(false);
				button_10.setSelected(false);
				DataSaved.ratings[0]=4;
			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(true);
				button_3.setSelected(true);
				button_4.setSelected(true);
				button_5.setSelected(true);
				button_6.setSelected(false);
				button_7.setSelected(false);
				button_8.setSelected(false);
				button_9.setSelected(false);
				button_10.setSelected(false);
				DataSaved.ratings[0]=5;
			}
		});
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(true);
				button_3.setSelected(true);
				button_4.setSelected(true);
				button_5.setSelected(true);
				button_6.setSelected(true);
				button_7.setSelected(false);
				button_8.setSelected(false);
				button_9.setSelected(false);
				button_10.setSelected(false);
				DataSaved.ratings[0]=6;
			}
		});
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(true);
				button_3.setSelected(true);
				button_4.setSelected(true);
				button_5.setSelected(true);
				button_6.setSelected(true);
				button_7.setSelected(true);
				button_8.setSelected(false);
				button_9.setSelected(false);
				button_10.setSelected(false);
				DataSaved.ratings[0]=7;
			}
		});
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(true);
				button_3.setSelected(true);
				button_4.setSelected(true);
				button_5.setSelected(true);
				button_6.setSelected(true);
				button_7.setSelected(true);
				button_8.setSelected(true);
				button_9.setSelected(false);
				button_10.setSelected(false);
				DataSaved.ratings[0]=8;
			}
		});
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(true);
				button_3.setSelected(true);
				button_4.setSelected(true);
				button_5.setSelected(true);
				button_6.setSelected(true);
				button_7.setSelected(true);
				button_8.setSelected(true);
				button_9.setSelected(true);
				button_10.setSelected(false);
				DataSaved.ratings[0]=9;
			}
		});
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				button_1.setSelected(true);
				button_2.setSelected(true);
				button_3.setSelected(true);
				button_4.setSelected(true);
				button_5.setSelected(true);
				button_6.setSelected(true);
				button_7.setSelected(true);
				button_8.setSelected(true);
				button_9.setSelected(true);
				button_10.setSelected(true);
				DataSaved.ratings[0]=10;
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				surveyQ2 nextQ = new surveyQ2();
				nextQ.main(null);
				dispose();
				
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
	}
}

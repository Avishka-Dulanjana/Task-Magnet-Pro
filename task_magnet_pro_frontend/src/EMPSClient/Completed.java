package EMPSClient;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Completed {

	private JFrame frmCompletedSurvey;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Completed window = new Completed();
					window.frmCompletedSurvey.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Completed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompletedSurvey = new JFrame();
		frmCompletedSurvey.getContentPane().setBackground(Color.WHITE);
		frmCompletedSurvey.setBackground(Color.WHITE);
		frmCompletedSurvey.setIconImage(Toolkit.getDefaultToolkit().getImage(Completed.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		frmCompletedSurvey.setTitle("Completed Survey");
		frmCompletedSurvey.setBounds(100, 100, 450, 300);
		frmCompletedSurvey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCompletedSurvey.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Completed.class.getResource("/EMPSClient/Images/giphy.gif")));
		lblNewLabel_2.setBounds(0, 0, 254, 261);
		frmCompletedSurvey.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Completed.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		lblNewLabel.setBounds(256, 76, 178, 112);
		frmCompletedSurvey.getContentPane().add(lblNewLabel);
	}
}

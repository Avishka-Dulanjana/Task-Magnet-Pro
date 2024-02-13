package EMPSServer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class RecordViewer extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private String result=null;
	private int[] ints = new int[10];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordViewer frame = new RecordViewer();
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
	public RecordViewer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RecordViewer.class.getResource("/EMPSClient/Copy of Expert Skilled Workers - Made with PosterMyWall.png")));
		setTitle("EMP Staisfy Summery Viewer");
		setAlwaysOnTop(true);
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 736, 388);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 155));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1: I am proud to work for this company ........................................................................................");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 69, 421, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblIFeel = new JLabel("2: I feel that my career goals can be met at this company...........................................................");
		lblIFeel.setFont(new Font("Calibri", Font.BOLD, 14));
		lblIFeel.setBounds(10, 97, 421, 17);
		contentPane.add(lblIFeel);
		
		JLabel lblres = new JLabel("3: The providing equipemnts & Resources enough to work........................................................");
		lblres.setFont(new Font("Calibri", Font.BOLD, 14));
		lblres.setBounds(10, 125, 421, 17);
		contentPane.add(lblres);
		
		JLabel lblIAm = new JLabel("4: I am encouraged to come up with better way of doing things.................");
		lblIAm.setFont(new Font("Calibri", Font.BOLD, 14));
		lblIAm.setBounds(10, 153, 421, 17);
		contentPane.add(lblIAm);
		
		JLabel lblMyManager = new JLabel("5: My manager & Team Members encourages me for Tasks....................................................");
		lblMyManager.setFont(new Font("Calibri", Font.BOLD, 14));
		lblMyManager.setBounds(10, 181, 421, 17);
		contentPane.add(lblMyManager);
		
		JLabel lblIBelieve = new JLabel("6: I believe in our leadership’s approach to achieving these goals.........................................");
		lblIBelieve.setFont(new Font("Calibri", Font.BOLD, 14));
		lblIBelieve.setBounds(10, 209, 421, 17);
		contentPane.add(lblIBelieve);
		
		JLabel lblEvery = new JLabel("7: Everybody is treated fairly in this organization…......");
		lblEvery.setFont(new Font("Calibri", Font.BOLD, 14));
		lblEvery.setBounds(10, 237, 421, 17);
		contentPane.add(lblEvery);
	
		
		JLabel l11 = new JLabel("\u2665");
		l11.setForeground(Color.GRAY);
		l11.setHorizontalAlignment(SwingConstants.CENTER);
		l11.setFont(new Font("Tahoma", Font.BOLD, 30));
		l11.setBounds(441, 69, 18, 17);
		contentPane.add(l11);
		
		JLabel l12 = new JLabel("\u2665");
		l12.setHorizontalAlignment(SwingConstants.CENTER);
		l12.setForeground(Color.GRAY);
		l12.setFont(new Font("Tahoma", Font.BOLD, 30));
		l12.setBounds(469, 70, 18, 17);
		contentPane.add(l12);
		
		JLabel l13 = new JLabel("\u2665");
		l13.setHorizontalAlignment(SwingConstants.CENTER);
		l13.setForeground(Color.GRAY);
		l13.setFont(new Font("Tahoma", Font.BOLD, 30));
		l13.setBounds(497, 70, 18, 17);
		contentPane.add(l13);
		
		JLabel l14 = new JLabel("\u2665");
		l14.setHorizontalAlignment(SwingConstants.CENTER);
		l14.setForeground(Color.GRAY);
		l14.setFont(new Font("Tahoma", Font.BOLD, 30));
		l14.setBounds(525, 70, 18, 17);
		contentPane.add(l14);
		
		JLabel l15 = new JLabel("\u2665");
		l15.setHorizontalAlignment(SwingConstants.CENTER);
		l15.setForeground(Color.GRAY);
		l15.setFont(new Font("Tahoma", Font.BOLD, 30));
		l15.setBounds(553, 70, 18, 17);
		contentPane.add(l15);
		
		JLabel l16 = new JLabel("\u2665");
		l16.setHorizontalAlignment(SwingConstants.CENTER);
		l16.setForeground(Color.GRAY);
		l16.setFont(new Font("Tahoma", Font.BOLD, 30));
		l16.setBounds(581, 70, 18, 17);
		contentPane.add(l16);
		
		JLabel l17 = new JLabel("\u2665");
		l17.setHorizontalAlignment(SwingConstants.CENTER);
		l17.setForeground(Color.GRAY);
		l17.setFont(new Font("Tahoma", Font.BOLD, 30));
		l17.setBounds(609, 70, 18, 17);
		contentPane.add(l17);
		
		JLabel l18 = new JLabel("\u2665");
		l18.setHorizontalAlignment(SwingConstants.CENTER);
		l18.setForeground(Color.GRAY);
		l18.setFont(new Font("Tahoma", Font.BOLD, 30));
		l18.setBounds(637, 70, 18, 17);
		contentPane.add(l18);
		
		JLabel l19 = new JLabel("\u2665");
		l19.setHorizontalAlignment(SwingConstants.CENTER);
		l19.setForeground(Color.GRAY);
		l19.setFont(new Font("Tahoma", Font.BOLD, 30));
		l19.setBounds(665, 70, 18, 17);
		contentPane.add(l19);
		
		JLabel l110 = new JLabel("\u2665");
		l110.setHorizontalAlignment(SwingConstants.CENTER);
		l110.setForeground(Color.GRAY);
		l110.setFont(new Font("Tahoma", Font.BOLD, 30));
		l110.setBounds(693, 70, 18, 17);
		contentPane.add(l110);
		
		JLabel label_9 = new JLabel("\u2665");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.GRAY);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_9.setBounds(441, 96, 18, 17);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("\u2665");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.GRAY);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_10.setBounds(469, 97, 18, 17);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\u2665");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.GRAY);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_11.setBounds(497, 97, 18, 17);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\u2665");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.GRAY);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_12.setBounds(525, 97, 18, 17);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("\u2665");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.GRAY);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_13.setBounds(553, 97, 18, 17);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("\u2665");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(Color.GRAY);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_14.setBounds(581, 97, 18, 17);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("\u2665");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(Color.GRAY);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_15.setBounds(609, 97, 18, 17);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("\u2665");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(Color.GRAY);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_16.setBounds(637, 97, 18, 17);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("\u2665");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.GRAY);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_17.setBounds(665, 97, 18, 17);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("\u2665");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.GRAY);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_18.setBounds(693, 97, 18, 17);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("\u2665");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(Color.GRAY);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_19.setBounds(441, 124, 18, 17);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("\u2665");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setForeground(Color.GRAY);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_20.setBounds(469, 125, 18, 17);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("\u2665");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setForeground(Color.GRAY);
		label_21.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_21.setBounds(497, 125, 18, 17);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("\u2665");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setForeground(Color.GRAY);
		label_22.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_22.setBounds(525, 125, 18, 17);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("\u2665");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setForeground(Color.GRAY);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_23.setBounds(553, 125, 18, 17);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("\u2665");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setForeground(Color.GRAY);
		label_24.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_24.setBounds(581, 125, 18, 17);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("\u2665");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setForeground(Color.GRAY);
		label_25.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_25.setBounds(609, 125, 18, 17);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("\u2665");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setForeground(Color.GRAY);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_26.setBounds(637, 125, 18, 17);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("\u2665");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setForeground(Color.GRAY);
		label_27.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_27.setBounds(665, 125, 18, 17);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("\u2665");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setForeground(Color.GRAY);
		label_28.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_28.setBounds(693, 125, 18, 17);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("\u2665");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setForeground(Color.GRAY);
		label_29.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_29.setBounds(441, 152, 18, 17);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("\u2665");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setForeground(Color.GRAY);
		label_30.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_30.setBounds(469, 153, 18, 17);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("\u2665");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setForeground(Color.GRAY);
		label_31.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_31.setBounds(497, 153, 18, 17);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("\u2665");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setForeground(Color.GRAY);
		label_32.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_32.setBounds(525, 153, 18, 17);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel("\u2665");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setForeground(Color.GRAY);
		label_33.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_33.setBounds(553, 153, 18, 17);
		contentPane.add(label_33);
		
		JLabel label_34 = new JLabel("\u2665");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setForeground(Color.GRAY);
		label_34.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_34.setBounds(581, 153, 18, 17);
		contentPane.add(label_34);
		
		JLabel label_35 = new JLabel("\u2665");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setForeground(Color.GRAY);
		label_35.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_35.setBounds(609, 153, 18, 17);
		contentPane.add(label_35);
		
		JLabel label_36 = new JLabel("\u2665");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setForeground(Color.GRAY);
		label_36.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_36.setBounds(637, 153, 18, 17);
		contentPane.add(label_36);
		
		JLabel label_37 = new JLabel("\u2665");
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setForeground(Color.GRAY);
		label_37.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_37.setBounds(665, 153, 18, 17);
		contentPane.add(label_37);
		
		JLabel label_38 = new JLabel("\u2665");
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setForeground(Color.GRAY);
		label_38.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_38.setBounds(693, 153, 18, 17);
		contentPane.add(label_38);
		
		JLabel label_39 = new JLabel("\u2665");
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setForeground(Color.GRAY);
		label_39.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_39.setBounds(441, 180, 18, 17);
		contentPane.add(label_39);
		
		JLabel label_40 = new JLabel("\u2665");
		label_40.setHorizontalAlignment(SwingConstants.CENTER);
		label_40.setForeground(Color.GRAY);
		label_40.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_40.setBounds(469, 181, 18, 17);
		contentPane.add(label_40);
		
		JLabel label_41 = new JLabel("\u2665");
		label_41.setHorizontalAlignment(SwingConstants.CENTER);
		label_41.setForeground(Color.GRAY);
		label_41.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_41.setBounds(497, 181, 18, 17);
		contentPane.add(label_41);
		
		JLabel label_42 = new JLabel("\u2665");
		label_42.setHorizontalAlignment(SwingConstants.CENTER);
		label_42.setForeground(Color.GRAY);
		label_42.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_42.setBounds(525, 181, 18, 17);
		contentPane.add(label_42);
		
		JLabel label_43 = new JLabel("\u2665");
		label_43.setHorizontalAlignment(SwingConstants.CENTER);
		label_43.setForeground(Color.GRAY);
		label_43.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_43.setBounds(553, 181, 18, 17);
		contentPane.add(label_43);
		
		JLabel label_44 = new JLabel("\u2665");
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setForeground(Color.GRAY);
		label_44.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_44.setBounds(581, 181, 18, 17);
		contentPane.add(label_44);
		
		JLabel label_45 = new JLabel("\u2665");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setForeground(Color.GRAY);
		label_45.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_45.setBounds(609, 181, 18, 17);
		contentPane.add(label_45);
		
		JLabel label_46 = new JLabel("\u2665");
		label_46.setHorizontalAlignment(SwingConstants.CENTER);
		label_46.setForeground(Color.GRAY);
		label_46.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_46.setBounds(637, 181, 18, 17);
		contentPane.add(label_46);
		
		JLabel label_47 = new JLabel("\u2665");
		label_47.setHorizontalAlignment(SwingConstants.CENTER);
		label_47.setForeground(Color.GRAY);
		label_47.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_47.setBounds(665, 181, 18, 17);
		contentPane.add(label_47);
		
		JLabel label_48 = new JLabel("\u2665");
		label_48.setHorizontalAlignment(SwingConstants.CENTER);
		label_48.setForeground(Color.GRAY);
		label_48.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_48.setBounds(693, 181, 18, 17);
		contentPane.add(label_48);
		
		JLabel label_49 = new JLabel("\u2665");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setForeground(Color.GRAY);
		label_49.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_49.setBounds(441, 209, 18, 17);
		contentPane.add(label_49);
		
		JLabel label_50 = new JLabel("\u2665");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setForeground(Color.GRAY);
		label_50.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_50.setBounds(469, 210, 18, 17);
		contentPane.add(label_50);
		
		JLabel label_51 = new JLabel("\u2665");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setForeground(Color.GRAY);
		label_51.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_51.setBounds(497, 210, 18, 17);
		contentPane.add(label_51);
		
		JLabel label_52 = new JLabel("\u2665");
		label_52.setHorizontalAlignment(SwingConstants.CENTER);
		label_52.setForeground(Color.GRAY);
		label_52.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_52.setBounds(525, 210, 18, 17);
		contentPane.add(label_52);
		
		JLabel label_53 = new JLabel("\u2665");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setForeground(Color.GRAY);
		label_53.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_53.setBounds(553, 210, 18, 17);
		contentPane.add(label_53);
		
		JLabel label_54 = new JLabel("\u2665");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setForeground(Color.GRAY);
		label_54.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_54.setBounds(581, 210, 18, 17);
		contentPane.add(label_54);
		
		JLabel label_55 = new JLabel("\u2665");
		label_55.setHorizontalAlignment(SwingConstants.CENTER);
		label_55.setForeground(Color.GRAY);
		label_55.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_55.setBounds(609, 210, 18, 17);
		contentPane.add(label_55);
		
		JLabel label_56 = new JLabel("\u2665");
		label_56.setHorizontalAlignment(SwingConstants.CENTER);
		label_56.setForeground(Color.GRAY);
		label_56.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_56.setBounds(637, 210, 18, 17);
		contentPane.add(label_56);
		
		JLabel label_57 = new JLabel("\u2665");
		label_57.setHorizontalAlignment(SwingConstants.CENTER);
		label_57.setForeground(Color.GRAY);
		label_57.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_57.setBounds(665, 210, 18, 17);
		contentPane.add(label_57);
		
		JLabel label_58 = new JLabel("\u2665");
		label_58.setHorizontalAlignment(SwingConstants.CENTER);
		label_58.setForeground(Color.GRAY);
		label_58.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_58.setBounds(693, 210, 18, 17);
		contentPane.add(label_58);
		
		JLabel label_59 = new JLabel("\u2665");
		label_59.setHorizontalAlignment(SwingConstants.CENTER);
		label_59.setForeground(Color.GRAY);
		label_59.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_59.setBounds(441, 236, 18, 17);
		contentPane.add(label_59);
		
		JLabel label_60 = new JLabel("\u2665");
		label_60.setHorizontalAlignment(SwingConstants.CENTER);
		label_60.setForeground(Color.GRAY);
		label_60.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_60.setBounds(469, 237, 18, 17);
		contentPane.add(label_60);
		
		JLabel label_61 = new JLabel("\u2665");
		label_61.setHorizontalAlignment(SwingConstants.CENTER);
		label_61.setForeground(Color.GRAY);
		label_61.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_61.setBounds(497, 237, 18, 17);
		contentPane.add(label_61);
		
		JLabel label_62 = new JLabel("\u2665");
		label_62.setHorizontalAlignment(SwingConstants.CENTER);
		label_62.setForeground(Color.GRAY);
		label_62.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_62.setBounds(525, 237, 18, 17);
		contentPane.add(label_62);
		
		JLabel label_63 = new JLabel("\u2665");
		label_63.setHorizontalAlignment(SwingConstants.CENTER);
		label_63.setForeground(Color.GRAY);
		label_63.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_63.setBounds(553, 237, 18, 17);
		contentPane.add(label_63);
		
		JLabel label_64 = new JLabel("\u2665");
		label_64.setHorizontalAlignment(SwingConstants.CENTER);
		label_64.setForeground(Color.GRAY);
		label_64.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_64.setBounds(581, 237, 18, 17);
		contentPane.add(label_64);
		
		JLabel label_65 = new JLabel("\u2665");
		label_65.setHorizontalAlignment(SwingConstants.CENTER);
		label_65.setForeground(Color.GRAY);
		label_65.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_65.setBounds(609, 237, 18, 17);
		contentPane.add(label_65);
		
		JLabel label_66 = new JLabel("\u2665");
		label_66.setHorizontalAlignment(SwingConstants.CENTER);
		label_66.setForeground(Color.GRAY);
		label_66.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_66.setBounds(637, 237, 18, 17);
		contentPane.add(label_66);
		
		JLabel label_67 = new JLabel("\u2665");
		label_67.setHorizontalAlignment(SwingConstants.CENTER);
		label_67.setForeground(Color.GRAY);
		label_67.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_67.setBounds(665, 237, 18, 17);
		contentPane.add(label_67);
		
		JLabel label_68 = new JLabel("\u2665");
		label_68.setHorizontalAlignment(SwingConstants.CENTER);
		label_68.setForeground(Color.GRAY);
		label_68.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_68.setBounds(693, 237, 18, 17);
		contentPane.add(label_68);
		
		JLabel lblSearchRecord = new JLabel("Search Record");
		lblSearchRecord.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSearchRecord.setBounds(10, 11, 97, 14);
		contentPane.add(lblSearchRecord);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(117, 9, 86, 20);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search"); //get record details for the entered ID number
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSearch.setBackground(new Color(0, 0, 0));
		btnSearch.setForeground(new Color(0, 255, 255));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					result = DBCRUD.getRecordByID(Integer.parseInt(txtSearch.getText()));
					ints= Arrays.asList(result.split(",")).stream().mapToInt(Integer::parseInt).toArray(); //store the result dataset into an array
					
					System.out.println(Arrays.toString(ints));
					
	///////////////////////q1 stars
					if(ints[0]==1) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.GRAY);
						l13.setForeground(Color.GRAY);
						l14.setForeground(Color.GRAY);
						l15.setForeground(Color.GRAY);
						l16.setForeground(Color.GRAY);
						l17.setForeground(Color.GRAY);
						l18.setForeground(Color.GRAY);
						l19.setForeground(Color.GRAY);
						l110.setForeground(Color.GRAY);
					}else if(ints[0]==2) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.RED);
						l13.setForeground(Color.GRAY);
						l14.setForeground(Color.GRAY);
						l15.setForeground(Color.GRAY);
						l16.setForeground(Color.GRAY);
						l17.setForeground(Color.GRAY);
						l18.setForeground(Color.GRAY);
						l19.setForeground(Color.GRAY);
						l110.setForeground(Color.GRAY);
					}else if(ints[0]==3) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.RED);
						l13.setForeground(Color.RED);
						l14.setForeground(Color.GRAY);
						l15.setForeground(Color.GRAY);
						l16.setForeground(Color.GRAY);
						l17.setForeground(Color.GRAY);
						l18.setForeground(Color.GRAY);
						l19.setForeground(Color.GRAY);
						l110.setForeground(Color.GRAY);
					}else if(ints[0]==4) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.RED);
						l13.setForeground(Color.RED);
						l14.setForeground(Color.RED);
						l15.setForeground(Color.GRAY);
						l16.setForeground(Color.GRAY);
						l17.setForeground(Color.GRAY);
						l18.setForeground(Color.GRAY);
						l19.setForeground(Color.GRAY);
						l110.setForeground(Color.GRAY);
					}else if(ints[0]==5) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.RED);
						l13.setForeground(Color.RED);
						l14.setForeground(Color.RED);
						l15.setForeground(Color.RED);
						l16.setForeground(Color.GRAY);
						l17.setForeground(Color.GRAY);
						l18.setForeground(Color.GRAY);
						l19.setForeground(Color.GRAY);
						l110.setForeground(Color.GRAY);
					}else if(ints[0]==6) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.RED);
						l13.setForeground(Color.RED);
						l14.setForeground(Color.RED);
						l15.setForeground(Color.RED);
						l16.setForeground(Color.RED);
						l17.setForeground(Color.GRAY);
						l18.setForeground(Color.GRAY);
						l19.setForeground(Color.GRAY);
						l110.setForeground(Color.GRAY);
					}else if(ints[0]==7) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.RED);
						l13.setForeground(Color.RED);
						l14.setForeground(Color.RED);
						l15.setForeground(Color.RED);
						l16.setForeground(Color.RED);
						l17.setForeground(Color.RED);
						l18.setForeground(Color.GRAY);
						l19.setForeground(Color.GRAY);
						l110.setForeground(Color.GRAY);
					}else if(ints[0]==8) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.RED);
						l13.setForeground(Color.RED);
						l14.setForeground(Color.RED);
						l15.setForeground(Color.RED);
						l16.setForeground(Color.RED);
						l17.setForeground(Color.RED);
						l18.setForeground(Color.RED);
						l19.setForeground(Color.GRAY);
						l110.setForeground(Color.GRAY);
					}else if(ints[0]==9) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.RED);
						l13.setForeground(Color.RED);
						l14.setForeground(Color.RED);
						l15.setForeground(Color.RED);
						l16.setForeground(Color.RED);
						l17.setForeground(Color.RED);
						l18.setForeground(Color.RED);
						l19.setForeground(Color.RED);
						l110.setForeground(Color.GRAY);
					}else if(ints[0]==10) {
						l11.setForeground(Color.RED);
						l12.setForeground(Color.RED);
						l13.setForeground(Color.RED);
						l14.setForeground(Color.RED);
						l15.setForeground(Color.RED);
						l16.setForeground(Color.RED);
						l17.setForeground(Color.RED);
						l18.setForeground(Color.RED);
						l19.setForeground(Color.RED);
						l110.setForeground(Color.RED);
					}
					
	//////////////////////
					
///////////////////////q2 stars
					if(ints[1]==1) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.GRAY);
						label_11.setForeground(Color.GRAY);
						label_12.setForeground(Color.GRAY);
						label_13.setForeground(Color.GRAY);
						label_14.setForeground(Color.GRAY);
						label_15.setForeground(Color.GRAY);
						label_16.setForeground(Color.GRAY);
						label_17.setForeground(Color.GRAY);
						label_18.setForeground(Color.GRAY);
					}else if(ints[1]==2) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.RED);
						label_11.setForeground(Color.GRAY);
						label_12.setForeground(Color.GRAY);
						label_13.setForeground(Color.GRAY);
						label_14.setForeground(Color.GRAY);
						label_15.setForeground(Color.GRAY);
						label_16.setForeground(Color.GRAY);
						label_17.setForeground(Color.GRAY);
						label_18.setForeground(Color.GRAY);
					}else if(ints[1]==3) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.RED);
						label_11.setForeground(Color.RED);
						label_12.setForeground(Color.GRAY);
						label_13.setForeground(Color.GRAY);
						label_14.setForeground(Color.GRAY);
						label_15.setForeground(Color.GRAY);
						label_16.setForeground(Color.GRAY);
						label_17.setForeground(Color.GRAY);
						label_18.setForeground(Color.GRAY);
					}else if(ints[1]==4) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.RED);
						label_11.setForeground(Color.RED);
						label_12.setForeground(Color.RED);
						label_13.setForeground(Color.GRAY);
						label_14.setForeground(Color.GRAY);
						label_15.setForeground(Color.GRAY);
						label_16.setForeground(Color.GRAY);
						label_17.setForeground(Color.GRAY);
						label_18.setForeground(Color.GRAY);
					}else if(ints[1]==5) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.RED);
						label_11.setForeground(Color.RED);
						label_12.setForeground(Color.RED);
						label_13.setForeground(Color.RED);
						label_14.setForeground(Color.GRAY);
						label_15.setForeground(Color.GRAY);
						label_16.setForeground(Color.GRAY);
						label_17.setForeground(Color.GRAY);
						label_18.setForeground(Color.GRAY);
					}else if(ints[1]==6) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.RED);
						label_11.setForeground(Color.RED);
						label_12.setForeground(Color.RED);
						label_13.setForeground(Color.RED);
						label_14.setForeground(Color.RED);
						label_15.setForeground(Color.GRAY);
						label_16.setForeground(Color.GRAY);
						label_17.setForeground(Color.GRAY);
						label_18.setForeground(Color.GRAY);
					}else if(ints[1]==7) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.RED);
						label_11.setForeground(Color.RED);
						label_12.setForeground(Color.RED);
						label_13.setForeground(Color.RED);
						label_14.setForeground(Color.RED);
						label_15.setForeground(Color.RED);
						label_16.setForeground(Color.GRAY);
						label_17.setForeground(Color.GRAY);
						label_18.setForeground(Color.GRAY);
					}else if(ints[1]==8) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.RED);
						label_11.setForeground(Color.RED);
						label_12.setForeground(Color.RED);
						label_13.setForeground(Color.RED);
						label_14.setForeground(Color.RED);
						label_15.setForeground(Color.RED);
						label_16.setForeground(Color.RED);
						label_17.setForeground(Color.GRAY);
						label_18.setForeground(Color.GRAY);
					}else if(ints[1]==9) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.RED);
						label_11.setForeground(Color.RED);
						label_12.setForeground(Color.RED);
						label_13.setForeground(Color.RED);
						label_14.setForeground(Color.RED);
						label_15.setForeground(Color.RED);
						label_16.setForeground(Color.RED);
						label_17.setForeground(Color.RED);
						label_18.setForeground(Color.GRAY);
					}else if(ints[1]==10) {
						label_9.setForeground(Color.RED);
						label_10.setForeground(Color.RED);
						label_11.setForeground(Color.RED);
						label_12.setForeground(Color.RED);
						label_13.setForeground(Color.RED);
						label_14.setForeground(Color.RED);
						label_15.setForeground(Color.RED);
						label_16.setForeground(Color.RED);
						label_17.setForeground(Color.RED);
						label_18.setForeground(Color.RED);
					}
					
	//////////////////////
///////////////////////q3 stars
					if(ints[2]==1) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.GRAY);
						label_21.setForeground(Color.GRAY);
						label_22.setForeground(Color.GRAY);
						label_23.setForeground(Color.GRAY);
						label_24.setForeground(Color.GRAY);
						label_25.setForeground(Color.GRAY);
						label_26.setForeground(Color.GRAY);
						label_27.setForeground(Color.GRAY);
						label_28.setForeground(Color.GRAY);
					}else if(ints[2]==2) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.RED);
						label_21.setForeground(Color.GRAY);
						label_22.setForeground(Color.GRAY);
						label_23.setForeground(Color.GRAY);
						label_24.setForeground(Color.GRAY);
						label_25.setForeground(Color.GRAY);
						label_26.setForeground(Color.GRAY);
						label_27.setForeground(Color.GRAY);
						label_28.setForeground(Color.GRAY);
					}else if(ints[2]==3) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.RED);
						label_21.setForeground(Color.RED);
						label_22.setForeground(Color.GRAY);
						label_23.setForeground(Color.GRAY);
						label_24.setForeground(Color.GRAY);
						label_25.setForeground(Color.GRAY);
						label_26.setForeground(Color.GRAY);
						label_27.setForeground(Color.GRAY);
						label_28.setForeground(Color.GRAY);
					}else if(ints[2]==4) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.RED);
						label_21.setForeground(Color.RED);
						label_22.setForeground(Color.RED);
						label_23.setForeground(Color.GRAY);
						label_24.setForeground(Color.GRAY);
						label_25.setForeground(Color.GRAY);
						label_26.setForeground(Color.GRAY);
						label_27.setForeground(Color.GRAY);
						label_28.setForeground(Color.GRAY);
					}else if(ints[2]==5) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.RED);
						label_21.setForeground(Color.RED);
						label_22.setForeground(Color.RED);
						label_23.setForeground(Color.RED);
						label_24.setForeground(Color.GRAY);
						label_25.setForeground(Color.GRAY);
						label_26.setForeground(Color.GRAY);
						label_27.setForeground(Color.GRAY);
						label_28.setForeground(Color.GRAY);
					}else if(ints[2]==6) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.RED);
						label_21.setForeground(Color.RED);
						label_22.setForeground(Color.RED);
						label_23.setForeground(Color.RED);
						label_24.setForeground(Color.RED);
						label_25.setForeground(Color.GRAY);
						label_26.setForeground(Color.GRAY);
						label_27.setForeground(Color.GRAY);
						label_28.setForeground(Color.GRAY);
					}else if(ints[2]==7) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.RED);
						label_21.setForeground(Color.RED);
						label_22.setForeground(Color.RED);
						label_23.setForeground(Color.RED);
						label_24.setForeground(Color.RED);
						label_25.setForeground(Color.RED);
						label_26.setForeground(Color.GRAY);
						label_27.setForeground(Color.GRAY);
						label_28.setForeground(Color.GRAY);
					}else if(ints[2]==8) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.RED);
						label_21.setForeground(Color.RED);
						label_22.setForeground(Color.RED);
						label_23.setForeground(Color.RED);
						label_24.setForeground(Color.RED);
						label_25.setForeground(Color.RED);
						label_26.setForeground(Color.RED);
						label_27.setForeground(Color.GRAY);
						label_28.setForeground(Color.GRAY);
					}else if(ints[2]==9) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.RED);
						label_21.setForeground(Color.RED);
						label_22.setForeground(Color.RED);
						label_23.setForeground(Color.RED);
						label_24.setForeground(Color.RED);
						label_25.setForeground(Color.RED);
						label_26.setForeground(Color.RED);
						label_27.setForeground(Color.RED);
						label_28.setForeground(Color.GRAY);
					}else if(ints[2]==10) {
						label_19.setForeground(Color.RED);
						label_20.setForeground(Color.RED);
						label_21.setForeground(Color.RED);
						label_22.setForeground(Color.RED);
						label_23.setForeground(Color.RED);
						label_24.setForeground(Color.RED);
						label_25.setForeground(Color.RED);
						label_26.setForeground(Color.RED);
						label_27.setForeground(Color.RED);
						label_28.setForeground(Color.RED);
					}
					
	//////////////////////
///////////////////////q4 stars
					if(ints[3]==1) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.GRAY);
						label_31.setForeground(Color.GRAY);
						label_32.setForeground(Color.GRAY);
						label_33.setForeground(Color.GRAY);
						label_34.setForeground(Color.GRAY);
						label_35.setForeground(Color.GRAY);
						label_36.setForeground(Color.GRAY);
						label_37.setForeground(Color.GRAY);
						label_38.setForeground(Color.GRAY);
					}else if(ints[3]==2) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.RED);
						label_31.setForeground(Color.GRAY);
						label_32.setForeground(Color.GRAY);
						label_33.setForeground(Color.GRAY);
						label_34.setForeground(Color.GRAY);
						label_35.setForeground(Color.GRAY);
						label_36.setForeground(Color.GRAY);
						label_37.setForeground(Color.GRAY);
						label_38.setForeground(Color.GRAY);
					}else if(ints[3]==3) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.RED);
						label_31.setForeground(Color.RED);
						label_32.setForeground(Color.GRAY);
						label_33.setForeground(Color.GRAY);
						label_34.setForeground(Color.GRAY);
						label_35.setForeground(Color.GRAY);
						label_36.setForeground(Color.GRAY);
						label_37.setForeground(Color.GRAY);
						label_38.setForeground(Color.GRAY);
					}else if(ints[3]==4) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.RED);
						label_31.setForeground(Color.RED);
						label_32.setForeground(Color.RED);
						label_33.setForeground(Color.GRAY);
						label_34.setForeground(Color.GRAY);
						label_35.setForeground(Color.GRAY);
						label_36.setForeground(Color.GRAY);
						label_37.setForeground(Color.GRAY);
						label_38.setForeground(Color.GRAY);
					}else if(ints[3]==5) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.RED);
						label_31.setForeground(Color.RED);
						label_32.setForeground(Color.RED);
						label_33.setForeground(Color.RED);
						label_34.setForeground(Color.GRAY);
						label_35.setForeground(Color.GRAY);
						label_36.setForeground(Color.GRAY);
						label_37.setForeground(Color.GRAY);
						label_38.setForeground(Color.GRAY);
					}else if(ints[3]==6) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.RED);
						label_31.setForeground(Color.RED);
						label_32.setForeground(Color.RED);
						label_33.setForeground(Color.RED);
						label_34.setForeground(Color.RED);
						label_35.setForeground(Color.GRAY);
						label_36.setForeground(Color.GRAY);
						label_37.setForeground(Color.GRAY);
						label_38.setForeground(Color.GRAY);
					}else if(ints[3]==7) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.RED);
						label_31.setForeground(Color.RED);
						label_32.setForeground(Color.RED);
						label_33.setForeground(Color.RED);
						label_34.setForeground(Color.RED);
						label_35.setForeground(Color.RED);
						label_36.setForeground(Color.GRAY);
						label_37.setForeground(Color.GRAY);
						label_38.setForeground(Color.GRAY);
					}else if(ints[3]==8) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.RED);
						label_31.setForeground(Color.RED);
						label_32.setForeground(Color.RED);
						label_33.setForeground(Color.RED);
						label_34.setForeground(Color.RED);
						label_35.setForeground(Color.RED);
						label_36.setForeground(Color.RED);
						label_37.setForeground(Color.GRAY);
						label_38.setForeground(Color.GRAY);
					}else if(ints[3]==9) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.RED);
						label_31.setForeground(Color.RED);
						label_32.setForeground(Color.RED);
						label_33.setForeground(Color.RED);
						label_34.setForeground(Color.RED);
						label_35.setForeground(Color.RED);
						label_36.setForeground(Color.RED);
						label_37.setForeground(Color.RED);
						label_38.setForeground(Color.GRAY);
					}else if(ints[3]==10) {
						label_29.setForeground(Color.RED);
						label_30.setForeground(Color.RED);
						label_31.setForeground(Color.RED);
						label_32.setForeground(Color.RED);
						label_33.setForeground(Color.RED);
						label_34.setForeground(Color.RED);
						label_35.setForeground(Color.RED);
						label_36.setForeground(Color.RED);
						label_37.setForeground(Color.RED);
						label_38.setForeground(Color.RED);
					}
					
	//////////////////////

///////////////////////q5 stars
					if(ints[4]==1) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.GRAY);
						label_41.setForeground(Color.GRAY);
						label_42.setForeground(Color.GRAY);
						label_43.setForeground(Color.GRAY);
						label_44.setForeground(Color.GRAY);
						label_45.setForeground(Color.GRAY);
						label_46.setForeground(Color.GRAY);
						label_47.setForeground(Color.GRAY);
						label_48.setForeground(Color.GRAY);
					}else if(ints[4]==2) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.RED);
						label_41.setForeground(Color.GRAY);
						label_42.setForeground(Color.GRAY);
						label_43.setForeground(Color.GRAY);
						label_44.setForeground(Color.GRAY);
						label_45.setForeground(Color.GRAY);
						label_46.setForeground(Color.GRAY);
						label_47.setForeground(Color.GRAY);
						label_48.setForeground(Color.GRAY);
					}else if(ints[4]==3) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.RED);
						label_41.setForeground(Color.RED);
						label_42.setForeground(Color.GRAY);
						label_43.setForeground(Color.GRAY);
						label_44.setForeground(Color.GRAY);
						label_45.setForeground(Color.GRAY);
						label_46.setForeground(Color.GRAY);
						label_47.setForeground(Color.GRAY);
						label_48.setForeground(Color.GRAY);
					}else if(ints[4]==4) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.RED);
						label_41.setForeground(Color.RED);
						label_42.setForeground(Color.RED);
						label_43.setForeground(Color.GRAY);
						label_44.setForeground(Color.GRAY);
						label_45.setForeground(Color.GRAY);
						label_46.setForeground(Color.GRAY);
						label_47.setForeground(Color.GRAY);
						label_48.setForeground(Color.GRAY);
					}else if(ints[4]==5) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.RED);
						label_41.setForeground(Color.RED);
						label_42.setForeground(Color.RED);
						label_43.setForeground(Color.RED);
						label_44.setForeground(Color.GRAY);
						label_45.setForeground(Color.GRAY);
						label_46.setForeground(Color.GRAY);
						label_47.setForeground(Color.GRAY);
						label_48.setForeground(Color.GRAY);
					}else if(ints[4]==6) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.RED);
						label_41.setForeground(Color.RED);
						label_42.setForeground(Color.RED);
						label_43.setForeground(Color.RED);
						label_44.setForeground(Color.RED);
						label_45.setForeground(Color.GRAY);
						label_46.setForeground(Color.GRAY);
						label_47.setForeground(Color.GRAY);
						label_48.setForeground(Color.GRAY);
					}else if(ints[4]==7) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.RED);
						label_41.setForeground(Color.RED);
						label_42.setForeground(Color.RED);
						label_43.setForeground(Color.RED);
						label_44.setForeground(Color.RED);
						label_45.setForeground(Color.RED);
						label_46.setForeground(Color.GRAY);
						label_47.setForeground(Color.GRAY);
						label_48.setForeground(Color.GRAY);
					}else if(ints[4]==8) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.RED);
						label_41.setForeground(Color.RED);
						label_42.setForeground(Color.RED);
						label_43.setForeground(Color.RED);
						label_44.setForeground(Color.RED);
						label_45.setForeground(Color.RED);
						label_46.setForeground(Color.RED);
						label_47.setForeground(Color.GRAY);
						label_48.setForeground(Color.GRAY);
					}else if(ints[4]==9) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.RED);
						label_41.setForeground(Color.RED);
						label_42.setForeground(Color.RED);
						label_43.setForeground(Color.RED);
						label_44.setForeground(Color.RED);
						label_45.setForeground(Color.RED);
						label_46.setForeground(Color.RED);
						label_47.setForeground(Color.RED);
						label_48.setForeground(Color.GRAY);
					}else if(ints[4]==10) {
						label_39.setForeground(Color.RED);
						label_40.setForeground(Color.RED);
						label_41.setForeground(Color.RED);
						label_42.setForeground(Color.RED);
						label_43.setForeground(Color.RED);
						label_44.setForeground(Color.RED);
						label_45.setForeground(Color.RED);
						label_46.setForeground(Color.RED);
						label_47.setForeground(Color.RED);
						label_48.setForeground(Color.RED);
					}
					
	//////////////////////

///////////////////////q6 stars
					if(ints[5]==1) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.GRAY);
						label_51.setForeground(Color.GRAY);
						label_52.setForeground(Color.GRAY);
						label_53.setForeground(Color.GRAY);
						label_54.setForeground(Color.GRAY);
						label_55.setForeground(Color.GRAY);
						label_56.setForeground(Color.GRAY);
						label_57.setForeground(Color.GRAY);
						label_58.setForeground(Color.GRAY);
					}else if(ints[5]==2) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.RED);
						label_51.setForeground(Color.GRAY);
						label_52.setForeground(Color.GRAY);
						label_53.setForeground(Color.GRAY);
						label_54.setForeground(Color.GRAY);
						label_55.setForeground(Color.GRAY);
						label_56.setForeground(Color.GRAY);
						label_57.setForeground(Color.GRAY);
						label_58.setForeground(Color.GRAY);
					}else if(ints[5]==3) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.RED);
						label_51.setForeground(Color.RED);
						label_52.setForeground(Color.GRAY);
						label_53.setForeground(Color.GRAY);
						label_54.setForeground(Color.GRAY);
						label_55.setForeground(Color.GRAY);
						label_56.setForeground(Color.GRAY);
						label_57.setForeground(Color.GRAY);
						label_58.setForeground(Color.GRAY);
					}else if(ints[5]==4) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.RED);
						label_51.setForeground(Color.RED);
						label_52.setForeground(Color.RED);
						label_53.setForeground(Color.GRAY);
						label_54.setForeground(Color.GRAY);
						label_55.setForeground(Color.GRAY);
						label_56.setForeground(Color.GRAY);
						label_57.setForeground(Color.GRAY);
						label_58.setForeground(Color.GRAY);
					}else if(ints[5]==5) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.RED);
						label_51.setForeground(Color.RED);
						label_52.setForeground(Color.RED);
						label_53.setForeground(Color.RED);
						label_54.setForeground(Color.GRAY);
						label_55.setForeground(Color.GRAY);
						label_56.setForeground(Color.GRAY);
						label_57.setForeground(Color.GRAY);
						label_58.setForeground(Color.GRAY);
					}else if(ints[5]==6) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.RED);
						label_51.setForeground(Color.RED);
						label_52.setForeground(Color.RED);
						label_53.setForeground(Color.RED);
						label_54.setForeground(Color.RED);
						label_55.setForeground(Color.GRAY);
						label_56.setForeground(Color.GRAY);
						label_57.setForeground(Color.GRAY);
						label_58.setForeground(Color.GRAY);
					}else if(ints[5]==7) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.RED);
						label_51.setForeground(Color.RED);
						label_52.setForeground(Color.RED);
						label_53.setForeground(Color.RED);
						label_54.setForeground(Color.RED);
						label_55.setForeground(Color.RED);
						label_56.setForeground(Color.GRAY);
						label_57.setForeground(Color.GRAY);
						label_58.setForeground(Color.GRAY);
					}else if(ints[5]==8) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.RED);
						label_51.setForeground(Color.RED);
						label_52.setForeground(Color.RED);
						label_53.setForeground(Color.RED);
						label_54.setForeground(Color.RED);
						label_55.setForeground(Color.RED);
						label_56.setForeground(Color.RED);
						label_57.setForeground(Color.GRAY);
						label_58.setForeground(Color.GRAY);
					}else if(ints[5]==9) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.RED);
						label_51.setForeground(Color.RED);
						label_52.setForeground(Color.RED);
						label_53.setForeground(Color.RED);
						label_54.setForeground(Color.RED);
						label_55.setForeground(Color.RED);
						label_56.setForeground(Color.RED);
						label_57.setForeground(Color.RED);
						label_58.setForeground(Color.GRAY);
					}else if(ints[5]==10) {
						label_49.setForeground(Color.RED);
						label_50.setForeground(Color.RED);
						label_51.setForeground(Color.RED);
						label_52.setForeground(Color.RED);
						label_53.setForeground(Color.RED);
						label_54.setForeground(Color.RED);
						label_55.setForeground(Color.RED);
						label_56.setForeground(Color.RED);
						label_57.setForeground(Color.RED);
						label_58.setForeground(Color.RED);
					}
					
	//////////////////////

///////////////////////q7 stars
					if(ints[6]==1) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.GRAY);
						label_61.setForeground(Color.GRAY);
						label_62.setForeground(Color.GRAY);
						label_63.setForeground(Color.GRAY);
						label_64.setForeground(Color.GRAY);
						label_65.setForeground(Color.GRAY);
						label_66.setForeground(Color.GRAY);
						label_67.setForeground(Color.GRAY);
						label_68.setForeground(Color.GRAY);
					}else if(ints[6]==2) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.RED);
						label_61.setForeground(Color.GRAY);
						label_62.setForeground(Color.GRAY);
						label_63.setForeground(Color.GRAY);
						label_64.setForeground(Color.GRAY);
						label_65.setForeground(Color.GRAY);
						label_66.setForeground(Color.GRAY);
						label_67.setForeground(Color.GRAY);
						label_68.setForeground(Color.GRAY);
					}else if(ints[6]==3) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.RED);
						label_61.setForeground(Color.RED);
						label_62.setForeground(Color.GRAY);
						label_63.setForeground(Color.GRAY);
						label_64.setForeground(Color.GRAY);
						label_65.setForeground(Color.GRAY);
						label_66.setForeground(Color.GRAY);
						label_67.setForeground(Color.GRAY);
						label_68.setForeground(Color.GRAY);
					}else if(ints[6]==4) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.RED);
						label_61.setForeground(Color.RED);
						label_62.setForeground(Color.RED);
						label_63.setForeground(Color.GRAY);
						label_64.setForeground(Color.GRAY);
						label_65.setForeground(Color.GRAY);
						label_66.setForeground(Color.GRAY);
						label_67.setForeground(Color.GRAY);
						label_68.setForeground(Color.GRAY);
					}else if(ints[6]==5) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.RED);
						label_61.setForeground(Color.RED);
						label_62.setForeground(Color.RED);
						label_63.setForeground(Color.RED);
						label_64.setForeground(Color.GRAY);
						label_65.setForeground(Color.GRAY);
						label_66.setForeground(Color.GRAY);
						label_67.setForeground(Color.GRAY);
						label_68.setForeground(Color.GRAY);
					}else if(ints[6]==6) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.RED);
						label_61.setForeground(Color.RED);
						label_62.setForeground(Color.RED);
						label_63.setForeground(Color.RED);
						label_64.setForeground(Color.RED);
						label_65.setForeground(Color.GRAY);
						label_66.setForeground(Color.GRAY);
						label_67.setForeground(Color.GRAY);
						label_68.setForeground(Color.GRAY);
					}else if(ints[6]==7) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.RED);
						label_61.setForeground(Color.RED);
						label_62.setForeground(Color.RED);
						label_63.setForeground(Color.RED);
						label_64.setForeground(Color.RED);
						label_65.setForeground(Color.RED);
						label_66.setForeground(Color.GRAY);
						label_67.setForeground(Color.GRAY);
						label_68.setForeground(Color.GRAY);
					}else if(ints[6]==8) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.RED);
						label_61.setForeground(Color.RED);
						label_62.setForeground(Color.RED);
						label_63.setForeground(Color.RED);
						label_64.setForeground(Color.RED);
						label_65.setForeground(Color.RED);
						label_66.setForeground(Color.RED);
						label_67.setForeground(Color.GRAY);
						label_68.setForeground(Color.GRAY);
					}else if(ints[6]==9) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.RED);
						label_61.setForeground(Color.RED);
						label_62.setForeground(Color.RED);
						label_63.setForeground(Color.RED);
						label_64.setForeground(Color.RED);
						label_65.setForeground(Color.RED);
						label_66.setForeground(Color.RED);
						label_67.setForeground(Color.RED);
						label_68.setForeground(Color.GRAY);
					}else if(ints[6]==10) {
						label_59.setForeground(Color.RED);
						label_60.setForeground(Color.RED);
						label_61.setForeground(Color.RED);
						label_62.setForeground(Color.RED);
						label_63.setForeground(Color.RED);
						label_64.setForeground(Color.RED);
						label_65.setForeground(Color.RED);
						label_66.setForeground(Color.RED);
						label_67.setForeground(Color.RED);
						label_68.setForeground(Color.RED);
					}
					
	//////////////////////


					
	//////////////////////
					
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSearch.setBounds(213, 8, 77, 23);
		contentPane.add(btnSearch);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(0, 0, 0));
		label.setBackground(new Color(0, 51, 255));
		label.setBounds(0, 0, 720, 349);
		contentPane.add(label);
		
		
	}
}

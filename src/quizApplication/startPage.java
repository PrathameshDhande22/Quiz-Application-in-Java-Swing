package quizApplication;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class startPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3096525787044740026L;
	
	JPanel contentPane;
	JLabel textname;
	JButton startbtn;
	JLabel date;
	JLabel time;
	int m=0;
	String s1;
	int count=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			
			
	}

	/**
	 * Create the frame.
	 */
	public startPage(String name) {
		s1=name;
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Welcome "+name);
		
		
		textname = new JLabel("Welcome "+s1);
		textname.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textname.setBounds(91, 22, 274, 21);
		contentPane.add(textname);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Instruction :");
		lblNewLabel_1.setBounds(10, 66, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1. Press Start Button to start the Test.");
		lblNewLabel_2.setBounds(10, 83, 263, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2. There Will be 10 Questions each question is of 5 Marks");
		lblNewLabel_3.setBounds(10, 100, 390, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("3. The passing Marks is 23 Marks.");
		lblNewLabel_4.setBounds(10, 117, 304, 14);
		contentPane.add(lblNewLabel_4);
		
		startbtn = new JButton("START");
		startbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				q1 q=new q1(s1,m,count);
				q.setVisible(true);
				dispose();
			}
		});
		startbtn.setToolTipText("Press start button to start the test");
		startbtn.setBackground(new Color(240, 230, 140));
		startbtn.setFont(new Font("Arial Black", Font.BOLD, 18));
		startbtn.setBounds(242, 189, 158, 50);
		contentPane.add(startbtn);
		
		JLabel lblNewLabel_5 = new JLabel("4. Once you click on next button that question is saved and it cannot be selected.");
		lblNewLabel_5.setBounds(10, 134, 424, 14);
		contentPane.add(lblNewLabel_5);
		
		date = new JLabel("New label");
		date.setFont(new Font("Calibri", Font.PLAIN, 13));
		date.setBounds(10, 225, 147, 14);
		contentPane.add(date);
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy");
		LocalDateTime dt=LocalDateTime.now();
		String logindate=dt.format(df);
		date.setText(logindate);
		
		time = new JLabel("New label");
		time.setFont(new Font("Calibri", Font.PLAIN, 13));
		time.setBounds(10, 236, 117, 14);
		contentPane.add(time);
		DateTimeFormatter dtime=DateTimeFormatter.ofPattern("hh:mm:ss");
		LocalTime dtimes=LocalTime.now();
		logindate=dtimes.format(dtime);
		time.setText(logindate);
		
		JLabel lblNewLabel = new JLabel("You Logged in at:");
		lblNewLabel.setBounds(10, 210, 127, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("5. Total Marks is 50 M.");
		lblNewLabel_6.setBounds(10, 150, 289, 14);
		contentPane.add(lblNewLabel_6);
	}
}

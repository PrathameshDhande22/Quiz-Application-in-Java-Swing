package quizApplication;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;

public class q1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3985057624056040625L;
	JPanel contentPane;
	ButtonGroup buttonGroup = new ButtonGroup();
	
	

	/**
	 * Create the frame.
	 */
	String s1;
	int m1;
	int c;
	public q1(String name,int m,int count) {
	     s1=name;
	     m1=m;
	     c=count;
		setTitle("Question 1");
		setBackground(new Color(255, 255, 255));
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "You cannot close this window now give all test first");
			//mp.frmQuizApplicationLogin.setVisible(true);
		//	mp.closed.setText("You choose to close the test");
			
			q1 ques=new q1(name,m1,c);
			ques.setVisible(true);
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		
		});
		
		JLabel lblNewLabel = new JLabel("1. What is correct Syntax for main method of java class ?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 31, 389, 24);
		contentPane.add(lblNewLabel);
		
		JRadioButton opt1 = new JRadioButton("public static int main(String [] args)");
		opt1.setBackground(new Color(255, 255, 255));
		buttonGroup.add(opt1);
		opt1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		opt1.setBounds(20, 62, 379, 23);
		contentPane.add(opt1);
		
		JRadioButton opt2 = new JRadioButton("public int main(String [] args)");
		opt2.setBackground(new Color(255, 255, 255));
		buttonGroup.add(opt2);
		opt2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		opt2.setBounds(20, 92, 357, 23);
		contentPane.add(opt2);
		
		JRadioButton opt3 = new JRadioButton("public static void main(String [] args)");
		opt3.setBackground(new Color(255, 255, 255));
		buttonGroup.add(opt3);
		opt3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		opt3.setBounds(20, 121, 368, 23);
		contentPane.add(opt3);
		
		JRadioButton opt4 = new JRadioButton("None of the Above");
		opt4.setBackground(new Color(255, 255, 255));
		buttonGroup.add(opt4);
		opt4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		opt4.setBounds(20, 147, 271, 23);
		contentPane.add(opt4);
		
		JButton next = new JButton("Next ");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opt3.isSelected()) {
				
					m1=m1+5;
					c=c+1;
			
					q2 question2=new q2(s1,m1,c);
					question2.setVisible(true);
					dispose();
					
				}
				else if(opt1.isSelected()==false && opt2.isSelected()==false && opt4.isSelected()==false ) {
					JOptionPane.showMessageDialog(null,"Select any One Option " );
				}
				else {
					q2 question2=new q2(s1,m1,c);
					question2.setVisible(true);
					dispose();
				}
			}
		});
		next.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		next.setBounds(320, 221, 89, 29);
		contentPane.add(next);
	}
}

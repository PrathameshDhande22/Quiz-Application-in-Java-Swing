package quizApplication;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class resultPage {
	JLabel nameset;

	String s1;
	JFrame f;
	int m2;
	JLabel score;
	resultPage(String name,int m,int count){
		s1=name;
		
		f=new JFrame();
		
		f.setSize(300, 300);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.WHITE);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESULTS");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(173, 22, 127, 35);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name : ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 85, 105, 18);
		f.getContentPane().add(lblNewLabel_1);
		
		nameset = new JLabel(name);
		nameset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		nameset.setBounds(116, 87, 308, 14);
		f.getContentPane().add(nameset);
		System.out.println();
		
		JLabel lblNewLabel_2 = new JLabel("Score :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 123, 105, 18);
		f.getContentPane().add(lblNewLabel_2);
		
		score = new JLabel(m+"/50");
		score.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		score.setBounds(116, 126, 216, 14);
		f.getContentPane().add(score);
		
		JLabel lblNewLabel_4 = new JLabel("Correct :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 162, 105, 14);
		f.getContentPane().add(lblNewLabel_4);
		
		JLabel anscorrect = new JLabel(count+" /10");
		anscorrect.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		anscorrect.setBounds(116, 163, 216, 14);
		f.getContentPane().add(anscorrect);
		f.setBackground(Color.WHITE);
		f.setTitle("Result of Test Given by "+name);
		f.setBounds(100, 100, 450, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel setDiscription=new JLabel("SetD");
		setDiscription.setFont(new Font("Times New Roman", Font.BOLD, 15));
		setDiscription.setBounds(10, 200, 5000, 50);
		f.add(setDiscription);
		if(m==50) {
			setDiscription.setText("<html>Congratulations "+name+" <br>You Scored Full Marks in the test</html>");
		}
		else if((m==0)||(m<=24)){
			setDiscription.setText("Very Poor Performance "+name+" You Failed In the Tests");
		}
		else {
			setDiscription.setText("You Passed In the test");
		}
	}

	

}

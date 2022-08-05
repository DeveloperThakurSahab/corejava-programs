import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

public class Registration implements ActionListener {
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JLabel l16,l17;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	ButtonGroup bg;
	JRadioButton r1,r2;
	JButton b1,b2,b3,b4,b5;
	
	String blood[]= {"A+","A-","B+","B-","AB+","AB-","O+","O-"};
	JComboBox cb = new JComboBox(blood);
	public Registration() {
		f = new JFrame("Student Registration");
		f.setVisible(true);
		f.setSize(850, 600);
		f.setLayout(null);
		f.setResizable(false);
		
		l1 = new JLabel("ID");
		l2 = new JLabel("Firstname");
		l3 = new JLabel("Middlename");
		l4 = new JLabel("Lastname");
		l5 = new JLabel("Date of Birth");
		l6 = new JLabel("Gender");
		l7= new JLabel("Age");
		l8 = new JLabel("BloodGroup");
		l9 = new JLabel("Father's Name");
		l10 = new JLabel("Occupation");
		l11 = new JLabel("Father's Mobile");
		l12 = new JLabel("Mother's Name");
		l13 = new JLabel("Occupation");
		l14 = new JLabel("Mother's Mobile");
		l15 = new JLabel("Address");
		
		l16 = new JLabel("STUDENT INFORMATION");
		l17 = new JLabel("PARENT'S INFORMATION");
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		t6 = new JTextField(20);
		t7 = new JTextField(20);
		t8 = new JTextField(20);
		t9 = new JTextField(20);
		t10 = new JTextField(20);
		t11 = new JTextField(20);
		t12 = new JTextField(20);
		t13 = new JTextField(100);
		
		b1 = new JButton("SUBMIT");
		b2 = new JButton("SEARCH");
		b3 = new JButton("EDIT");
		b4 = new JButton("DELETE");
		b5 = new JButton("CLEAR");
		
		bg = new ButtonGroup();
		r1 = new JRadioButton("MALE");
		r2 = new JRadioButton("FEMALE");
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(l15);
		
		f.add(l16);
		f.add(l17);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
		f.add(t8);
		f.add(t9);
		f.add(t10);
		f.add(t11);
		f.add(t12);
		f.add(t13);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		bg.add(r1);
		bg.add(r2);
		f.add(r1);
		f.add(r2);
		
		f.add(cb);
		
		l16.setBounds(300, 0, 200, 40);
		l1.setBounds(30, 50, 100, 30);
		t1.setBounds(130, 50, 150, 30);
		
		l2.setBounds(30, 100, 100, 30);
		t2.setBounds(130, 100, 150, 30);
		l3.setBounds(300, 100, 100, 30);
		t3.setBounds(380, 100, 150, 30);
		l4.setBounds(550, 100, 100, 30);
		t4.setBounds(650, 100, 150, 30);
		
		l5.setBounds(30, 150, 100, 30);
		t5.setBounds(130, 150, 150, 30);
		l6.setBounds(300, 150, 100, 30);
		r1.setBounds(380, 150, 80, 30);
		r2.setBounds(460, 150, 100, 30);
		
		l7.setBounds(30, 200, 100, 30);
		t6.setBounds(130, 200, 150, 30);
		l8.setBounds(300, 200, 100, 30);
		cb.setBounds(380, 200, 100, 30);
		
		l17.setBounds(300, 250, 200, 40);
		l9.setBounds(30, 300, 100, 30);
		t7.setBounds(130, 300, 150, 30);
		l10.setBounds(300, 300, 100, 30);
		t8.setBounds(380, 300, 150, 30);
		l11.setBounds(550, 300, 100, 30);
		t9.setBounds(650, 300, 150,30);
		
		l12.setBounds(30, 350, 100, 30);
		t10.setBounds(130, 350, 150, 30);
		l13.setBounds(300, 350, 100, 30);
		t11.setBounds(380, 350, 150, 30);
		l14.setBounds(550, 350, 100, 30);
		t12.setBounds(650, 350, 150,30);
		
		l15.setBounds(30, 400, 100, 30);
		t13.setBounds(130, 400, 670, 30);
		
		b1.setBounds(20, 500, 150, 30);
		b2.setBounds(180, 500, 150, 30);
		b3.setBounds(340, 500, 150, 30);
		b4.setBounds(500, 500, 150, 30);
		b5.setBounds(660, 500, 150, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Registration();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

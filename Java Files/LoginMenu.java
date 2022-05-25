import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class LoginMenu {

	//declare n use
	private JFrame frm=new JFrame("Login Menu");
	private JPanel pnl =new JPanel();
	private JLabel lbl=new JLabel("Welcome to UKM Parking System");
	private JButton btn1, btn2,btn3,btn4;
	
	public LoginMenu(){
		//set n use
		pnl.setLayout(new BorderLayout());
		pnl.add(lbl, BorderLayout.NORTH);
		btn1=new JButton("Add");
		pnl.add(btn1, BorderLayout.CENTER);
		btn2=new JButton("Edit");
		pnl.add(btn2, BorderLayout.WEST);
		btn3=new JButton("Remove");
		pnl.add(btn3, BorderLayout.EAST);
		btn4=new JButton("List Of Parking");
		pnl.add(btn4, BorderLayout.SOUTH);
		
		frm.add(pnl);
		frm.setVisible(true);
		frm.setSize(280, 130);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Act c=new Act();
		btn1.addActionListener(c);
		btn2.addActionListener(c);
		btn3.addActionListener(c);		
		btn4.addActionListener(c);
	}
	
	public class Act implements ActionListener{
		
		public void actionPerformed(ActionEvent p) {
			if(p.getSource()==btn1) {
				new Person();
				frm.dispose();
			}else if(p.getSource()==btn4) {
				new ListParking();
				frm.dispose();
			}else if(p.getSource()==btn3) {
				new Remove();
				frm.dispose();
			}else if(p.getSource()==btn2) {
				new Edit();
				frm.dispose();
			}
			
		}
		
	
	}
}

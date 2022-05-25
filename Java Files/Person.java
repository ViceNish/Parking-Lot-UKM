import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Person {
	private JButton btn1, btn2, btn3,btn4; 
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	
	public Person() {
		
		//declare

		frame=new JFrame();
		panel=new JPanel();
		label = new JLabel("Are You : ");
		 label1= new JLabel(" ?");
		 label2= new JLabel(" , ");
		 label3= new JLabel(" or ");
		
		btn1= new JButton("Student");
		btn2= new JButton("Staff");
		btn3= new JButton("Management Staff");
		btn4=new JButton("Back");
		//add or set 
		
		panel.setLayout(new FlowLayout());//new FlowLayout());
		
		panel.add(label);
		panel.add(btn1);
		panel.add(label2);
		panel.add(btn2);
		panel.add(label3);
		panel.add(btn3);
		
		panel.add(label1);
		
		panel.add(btn4);
		
		
		
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Parking System");
		frame.setSize(480, 110);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		Action act = new Action();
		btn1.addActionListener(act);
		btn2.addActionListener(act);
		btn3.addActionListener(act);
		btn4.addActionListener(act);
	}
	
	public class Action implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn1) {
				new Students();
				//frame.dispose();
			}else if(e.getSource()==btn2) {
				new Staff();
				//frame.dispose();
			}else if(e.getSource()==btn3) {
				new Management_Staff();
				//frame.dispose();
			}else if(e.getSource()==btn4) {
				new LoginMenu();
				frame.dispose();
			}
		}
	}		
	
}
//*****************************************************



//BORDER




//******************************************************

class Students{
	
	//declare n use
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel lbl1 = new JLabel("Student ID :");
	private JLabel lbl2 = new JLabel("Name :");
	private JLabel lbl3=new JLabel("Password :");
	private JTextField txt1 = new JTextField(10);
	private JTextField txt2 = new JTextField(10);
	private JTextField txt3 = new JTextField(10);
	private JButton btn1 = new JButton("Enter");
	private JButton btn2=new JButton("Back");
	
	

//constructor
	public Students() {
		//set n add
		panel.setLayout(new FlowLayout());
		panel.add(lbl2);
		panel.add(txt1);
	
		panel.add(lbl1);
		panel.add(txt2);
		panel.add(lbl3);
		panel.add(txt3);
		panel.add(btn1);
		panel.add(btn2);
	
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Students");
		frame.setSize(230, 230);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		The bt =new The();
		btn2.addActionListener(bt);
		btn1.addActionListener(bt);
		 
	}
	
	public class The implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn2) {
				frame.dispose();
			}else if(e.getSource()==btn1) {
				String name,summ;
				try {
					 name=txt1.getText().trim();
					String id=txt2.getText().trim();
					String pass=txt3.getText().trim();
					String namep="Name : "+name;
					String idd="\nID : "+id;
					String paus="\nPassword : "+pass;
					String job="\nJob : Student";
					 //summ="Student Data"+"\nStudent Name : "+name+"\nStudent ID : "+id+"\nStudent Password : "+pass;
					/*FileWriter x=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\1.Student\\"+name+".txt");
					BufferedWriter out= new BufferedWriter(x);
					out.write(summ);
					out.close();
					System.out.println("success");*/
					new VehicleS(name, namep,idd,paus,job);
					frame.dispose();
				}
				catch(Exception except) {
					System.out.println("error");
				}
				
			}
			
		}
		
	}	
}
//*****************************************************



//BORDER




//******************************************************
	
	

class Staff {
	//declare
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private  JLabel lbl1 = new JLabel("Staff ID :");
	private JLabel lbl2 = new JLabel("Name :");
	private JLabel lbl3=new JLabel("Password :");
	private JTextField txt1 = new JTextField(10);
	private JTextField txt2 = new JTextField(10);
	private	JTextField txt3 = new JTextField(10);
	private	JButton btn1 = new JButton("Enter");
	private	JButton btn2=new JButton("Back");
	
		//gui
		public Staff(){
			panel.setLayout(new FlowLayout());
			panel.add(lbl2);
			panel.add(txt1);//name
			panel.add(lbl1);
			panel.add(txt2);//id
			panel.add(lbl3);
			panel.add(txt3);//pass
			panel.add(btn1);
			panel.add(btn2);
		
			
			frame.add(panel);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setTitle("Staff Login");
			frame.setSize(230, 230);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
			Stf st=new Stf();
			btn2.addActionListener(st);
			btn1.addActionListener(st);
			
		}
		
		public class Stf implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn2) {
					frame.dispose();
				}else if(e.getSource()==btn1) {
					String name, summ;
					try {
						 name=txt1.getText().trim();
						String id=txt2.getText().trim();
						String pass=txt3.getText().trim();
						String namep="Name : "+name;
						String idd="\nID : "+id;
						String paus="\nPassword : "+pass;
						String job="\nJob : Staff";
						//summ="Staff Data"+"\nStaff Name : "+name+"\nStaff ID : "+id+"\nStaff Password : "+pass;
						/*FileWriter x=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\2.Staff\\"+name+".txt");
						BufferedWriter out= new BufferedWriter(x);
						out.write(summ);
						out.close();
						System.out.println("success");*/
						new VehicleSt(name,namep,idd,paus,job);
						frame.dispose();
					}
					catch(Exception except) {
						System.out.println("error");
					}
						
				}
				
			}
			
		}
}
//*****************************************************



//BORDER




//******************************************************


class Management_Staff {
	//declare
	private	JFrame frame = new JFrame();
	private	JPanel panel = new JPanel();
	private	JLabel lbl1 = new JLabel("MStaff ID :");
	private	JLabel lbl2 = new JLabel("Name :");
	private	JLabel lbl3=new JLabel("Password :");
	private	JTextField txt1 = new JTextField(10);
	private	JTextField txt2 = new JTextField(10);
	private	JTextField txt3 = new JTextField(10);
	private	JButton btn1 = new JButton("Enter");
	private	JButton btn2=new JButton("Back");
		
		
		//constructor
		public Management_Staff(){
			
			//panel n frame
			panel.setLayout(new FlowLayout());
			panel.add(lbl2);
			panel.add(txt1);
			panel.add(lbl1);
			panel.add(txt2);
			panel.add(lbl3);
			panel.add(txt3);
			panel.add(btn1);
			panel.add(btn2);
			
			
			frame.add(panel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("MStaff Login");
			frame.setVisible(true);
			frame.setSize(240, 230);
			frame.setLocationRelativeTo(null);
			
			Mts mt = new Mts();
			btn2.addActionListener(mt);
			btn1.addActionListener(mt);
		}
		
		public class Mts implements ActionListener{

			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btn2) {
					frame.dispose();
				}else if(arg0.getSource()==btn1) {
					String name, summ;
					try {
						 name=txt1.getText().trim();
						String id=txt2.getText().trim();
						String pass=txt3.getText().trim();
						String namep="Name : "+name;
						String idd="\nID : "+id;
						String paus="\nPassword : "+pass;
						String job="\nJob : Management";
						//summ="MStaff Data "+"\nMStaff Name : "+name+"\nMStaff ID : "+id+"\nMStaff Password : "+pass;
						/*FileWriter x=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\3.MStaff\\"+name+".txt");
						BufferedWriter out= new BufferedWriter(x);
						out.write(summ);
						out.close();
						System.out.println("success");*/
						new VehicleM(name, namep,idd,paus,job);
						frame.dispose();
					}
					catch(Exception except) {
						System.out.println("error");
					}
					
				}
				
			}
			
		}
}
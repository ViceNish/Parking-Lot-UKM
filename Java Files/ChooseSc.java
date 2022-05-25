import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class ChooseSc{

	//declare
	private JFrame frame=new JFrame("Choose Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn1, btn2;
	
	String name,namep,idd,paus,job, car, tmpt, p;
	public ChooseSc(String name,String namep,String idd,String paus,String job,String car, String tmpt, String p) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
		this.tmpt=tmpt;
		this.p=p;
		//set n use
		label=new JLabel("Please Choose Section Parking");
		btn1=new JButton("Public");
		btn2=new JButton("Premium Park");
		
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new CarPark(name,namep,idd,paus,job,car,tmpt,p);
				frame.dispose();
				
			}
			
		});
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				new StaffParkingc(name,namep,idd,paus,job,car,tmpt,p);
				frame.dispose();
				
			}
			
		});
		
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(260, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}


//************************************************************************



//BORDER





//************************************************************************


class ChooseSm{

	//declare
	private JFrame frame=new JFrame("Choose Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn1, btn2;
	
	String name,namep,idd,paus,job, motor, tmpt, p;
	public ChooseSm(String name,String namep,String idd,String paus,String job,String motor, String tmpt, String p) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.motor=motor;
		this.tmpt=tmpt;
		this.p=p;
		//set n use
		label=new JLabel("Please Choose Section Parking");
		btn1=new JButton("Public");
		btn2=new JButton("Premium Park");
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new MotorPark(name,namep,idd,paus,job,motor,tmpt,p);
				frame.dispose();
				
			}
			
		});
		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				new StaffParkingm(name,namep,idd,paus,job,motor,tmpt,p);
				frame.dispose();
				
			}
			
		});
		
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(260, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}




//************************************************************************



//BORDER





//************************************************************************

class ChooseMc{

	//declare
	private JFrame frame=new JFrame("Choose Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn1, btn2,btn3;
	
	String name,namep,idd,paus,job, car, tmpt, p;
	public ChooseMc(String name,String namep,String idd,String paus,String job,String car, String tmpt, String p) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
		this.tmpt=tmpt;
		this.p=p;
		//set n use
		label=new JLabel("Please Choose Section Parking");
		btn1=new JButton("Public");
		btn2=new JButton("Premium Park");
		btn3=new JButton("Premium M Park");
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new CarPark(name,namep,idd,paus,job,car,tmpt,p);
				frame.dispose();
				
			}
			
		});
		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				new StaffParkingc(name,namep,idd,paus,job,car,tmpt,p);
				frame.dispose();
				
			}
			
		});
		
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				new MStaffParkingc(name,namep,idd,paus,job,car,tmpt,p);
				frame.dispose();
				
			}
			
		});
		//buat btn2 dn btn3
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(260, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}



//************************************************************************



//BORDER





//************************************************************************

class ChooseMm{

	//declare
	private JFrame frame=new JFrame("Choose Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn1, btn2,btn3;
	
	String name,namep,idd,paus,job, motor, tmpt, p;
	public ChooseMm(String name,String namep,String idd,String paus,String job,String motor, String tmpt, String p) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.motor=motor;
		this.tmpt=tmpt;
		this.p=p;
		//set n use
		label=new JLabel("Please Choose Section Parking");
		btn1=new JButton("Public");
		btn2=new JButton("Premium Park");
		btn3=new JButton("Premium M Park");
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new MotorPark(name,namep,idd,paus,job,motor,tmpt,p);
				frame.dispose();
				
			}
			
		});
		
		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				new StaffParkingm(name,namep,idd,paus,job,motor,tmpt,p);
				frame.dispose();
				
			}
			
		});
		
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				new MStaffParkingm(name,namep,idd,paus,job,motor,tmpt,p);
				frame.dispose();
				
			}
			
		});
		//buat btn2 N btn3
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(260, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}

import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class ParkingSm{
	//set n add
	private JFrame frame=new JFrame("Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn;
	private String plc[] = {"FTSM"};
	private JComboBox cb = new JComboBox(plc);
	String name,namep,idd,paus,job,motor;
	//constructor
	public ParkingSm(String name,String namep,String idd,String paus,String job,String motor){
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.motor=motor;
		label=new JLabel("Where You Want To Park?");
		btn=new JButton("Enter");
	
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(cb);
		panel.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmpt,p;
				try {
					//cb.getItemAt(cb.getSelectedIndex());
					p=cb.getSelectedItem().toString();
					tmpt="\nParking At : "+cb.getSelectedItem().toString();
					/*FileWriter x=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\1.Student\\"+name+".txt");
					BufferedWriter out= new BufferedWriter(x);
					out.write(summ);
					out.write(car);
					out.write(tmpt);
					out.close();
					System.out.println("success");*/
					new MotorPark(name,namep,idd,paus,job,motor,tmpt, p);
					frame.dispose();
				}
				catch(Exception except){
					System.out.println("error");
				}
			}
		});
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(265, 200);
		frame.setLocationRelativeTo(null);
	}
}


//************************************************************************



//BORDER





//************************************************************************

class ParkingStm{
	//set n add
	private JFrame frame=new JFrame("Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn;
	private String plc[] = {"FTSM"};
	private JComboBox cb = new JComboBox(plc);
	String name,namep,idd,paus,job,motor;
	//constructor
	public ParkingStm(String name,String namep,String idd,String paus,String job,String motor){
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.motor=motor;
		label=new JLabel("Where You Want To Park?");
		btn=new JButton("Enter");
	
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(cb);
		panel.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmpt,p;
				try {
					//cb.getItemAt(cb.getSelectedIndex());
					p=cb.getSelectedItem().toString();
					tmpt="\nParking At : "+cb.getSelectedItem().toString();
					/*FileWriter x=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\1.Student\\"+name+".txt");
					BufferedWriter out= new BufferedWriter(x);
					out.write(summ);
					out.write(car);
					out.write(tmpt);
					out.close();
					System.out.println("success");*/
					new ChooseSm(name,namep,idd,paus,job,motor,tmpt, p);
					frame.dispose();
				}
				catch(Exception except){
					System.out.println("error");
				}
			}
		});
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(265, 200);
		frame.setLocationRelativeTo(null);
	}
}


//************************************************************************



//BORDER





//************************************************************************

class ParkingMm{
	//set n add
	private JFrame frame=new JFrame("Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn;
	private String plc[] = {"FTSM"};
	private JComboBox cb = new JComboBox(plc);
	String name,namep,idd,paus,job,motor;
	//constructor
	public ParkingMm(String name,String namep,String idd,String paus,String job,String motor){
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.motor=motor;
		label=new JLabel("Where You Want To Park?");
		btn=new JButton("Enter");
	
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(cb);
		panel.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmpt,p;
				try {
					//cb.getItemAt(cb.getSelectedIndex());
					p=cb.getSelectedItem().toString();
					tmpt="\nParking At : "+cb.getSelectedItem().toString();
					/*FileWriter x=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\1.Student\\"+name+".txt");
					BufferedWriter out= new BufferedWriter(x);
					out.write(summ);
					out.write(car);
					out.write(tmpt);
					out.close();
					System.out.println("success");*/
					new ChooseMm(name,namep,idd,paus,job,motor,tmpt, p);
					frame.dispose();
				}
				catch(Exception except){
					System.out.println("error");
				}
			}
		});
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(265, 200);
		frame.setLocationRelativeTo(null);
	}
}

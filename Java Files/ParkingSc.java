import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class ParkingSc{
	//set n add
	private JFrame frame=new JFrame("Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn;
	private String plc[] = {"FTSM"};
	private JComboBox cb = new JComboBox(plc);
	String name,namep,idd,paus,job,car;
	//constructor
	public ParkingSc(String name,String namep,String idd,String paus,String job,String car){
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
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
					new CarPark(name,namep,idd,paus,job,car,tmpt, p);
					//new Inherit(name,summ,car,tmpt,p);
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


class ParkingStc{
	//set n add
	private JFrame frame=new JFrame("Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn;
	private String plc[] = {"FTSM"};
	private JComboBox cb = new JComboBox(plc);
	String name,namep,idd,paus,job,car;
	//constructor
	public ParkingStc(String name,String namep,String idd,String paus,String job,String car){
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
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
					new ChooseSc(name,namep,idd,paus,job,car,tmpt, p);
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


class ParkingMc{
	//set n add
	private JFrame frame=new JFrame("Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private JButton btn;
	private String plc[] = {"FTSM"};
	private JComboBox cb = new JComboBox(plc);
	String name,namep,idd,paus,job,car;
	//constructor
	public ParkingMc(String name,String namep,String idd,String paus,String job,String car){
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
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
					new ChooseMc(name,namep,idd,paus,job,car,tmpt, p);
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

import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class MStaffParkingm{

	private JFrame frame=new JFrame("MStaff Parking");
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"M_Lot 1","M_Lot 2","M_Lot 3", "M_Lot 4","M_Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	private JButton btn, btn2;
	private String name,namep,idd,paus,job, motor, tmpt,p;
	
	//constructor
	public MStaffParkingm(String name,String namep,String idd,String paus, String job,String motor, String tmpt, String p) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.motor=motor;
		this.tmpt=tmpt;
		this.p=p;
		label=new JLabel("Select Lot : ");
		btn=new JButton ("Enter");
		btn2=new JButton("Login Menu");
		
		if(p=="FTSM") {
			panel.setLayout(new FlowLayout());
			panel.add(label);
			panel.add(bx);
			panel.add(btn);
			panel.add(btn2);
			System.out.println("FTSM");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new LoginMenu();
					frame.dispose();
				}
			});
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String l, cl;
					l=bx.getSelectedItem().toString();
					cl="\nPark : "+l;
					
					if(l=="M_Lot 1") {
							try {
								File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
								if(file.exists()) {
									JOptionPane.showMessageDialog(frame,
										    "Sorry, The Parking Have Been Used.",
										    "WARNING",
										    JOptionPane.WARNING_MESSAGE);
									
								}else {
								//FileWriter exi=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\exist.txt");
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
								//FileWriter y=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\Parking List\\"+name+".txt");
								BufferedWriter out= new BufferedWriter(x);
								//BufferedWriter pout= new BufferedWriter(y);
								out.write(namep);
								out.write(idd);
								out.write(paus);
								out.write(job);
								out.write(motor);
								out.write(tmpt);
								out.write(cl);
								out.close();
								
								System.out.println("success");
								JOptionPane.showMessageDialog(frame,
									    "You Have Been Parking Successfully !",
									    "NOTICE !",
									    JOptionPane.PLAIN_MESSAGE);
								new LoginMenu();
								frame.dispose();
								}
							}
							catch(Exception except) {
								System.out.println("error");			
							
						}
						
					}else if(l=="M_Lot 2") {
						try {
							File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
							if(file.exists()) {
								JOptionPane.showMessageDialog(frame,
									    "Sorry, The Parking Have Been Used.",
									    "WARNING",
									    JOptionPane.WARNING_MESSAGE);
								
							}else {
							//FileWriter exi=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\exist.txt");
							FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
							//FileWriter y=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\Parking List\\"+name+".txt");
							BufferedWriter out= new BufferedWriter(x);
							//BufferedWriter pout= new BufferedWriter(y);
							out.write(namep);
							out.write(idd);
							out.write(paus);
							out.write(job);
							out.write(motor);
							out.write(tmpt);
							out.write(cl);
							out.close();
							
							System.out.println("success");
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Parking Successfully !",
								    "NOTICE !",
								    JOptionPane.PLAIN_MESSAGE);
							new LoginMenu();
							frame.dispose();
							}
						}
						catch(Exception except) {
							System.out.println("error");			
						
					}
					}else if(l=="M_Lot 3") {
						try {
							File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
							if(file.exists()) {
								JOptionPane.showMessageDialog(frame,
									    "Sorry, The Parking Have Been Used.",
									    "WARNING",
									    JOptionPane.WARNING_MESSAGE);
								
							}else {
							//FileWriter exi=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\exist.txt");
							FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
							///FileWriter y=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\Parking List\\"+name+".txt");
							BufferedWriter out= new BufferedWriter(x);
							//BufferedWriter pout= new BufferedWriter(y);
							out.write(namep);
							out.write(idd);
							out.write(paus);
							out.write(job);
							out.write(motor);
							out.write(tmpt);
							out.write(cl);
							out.close();
							
							System.out.println("success");
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Parking Successfully !",
								    "NOTICE !",
								    JOptionPane.PLAIN_MESSAGE);
							new LoginMenu();
							frame.dispose();
							}
						}
						catch(Exception except) {
							System.out.println("error");			
						
					}
					}else if(l=="M_Lot 4") {
						try {
							File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
							if(file.exists()) {
								JOptionPane.showMessageDialog(frame,
									    "Sorry, The Parking Have Been Used.",
									    "WARNING",
									    JOptionPane.WARNING_MESSAGE);
								
							}else {
						//	FileWriter exi=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\exist.txt");
							FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
						//	FileWriter y=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\Parking List\\"+name+".txt");
							BufferedWriter out= new BufferedWriter(x);
						//	BufferedWriter pout= new BufferedWriter(y);
							out.write(namep);
							out.write(idd);
							out.write(paus);
							out.write(job);
							out.write(motor);
							out.write(tmpt);
							out.write(cl);
							out.close();
							
							System.out.println("success");
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Parking Successfully !",
								    "NOTICE !",
								    JOptionPane.PLAIN_MESSAGE);
							new LoginMenu();
							frame.dispose();
							}
						}
						catch(Exception except) {
							System.out.println("error");			
						
					}
					}else if(l=="M_Lot 5") {
						try {
							File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
							if(file.exists()) {
								JOptionPane.showMessageDialog(frame,
									    "Sorry, The Parking Have Been Used.",
									    "WARNING",
									    JOptionPane.WARNING_MESSAGE);
								
							}else {
							//FileWriter exi=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\exist.txt");
							FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
							//FileWriter y=new FileWriter("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\Parking List\\"+name+".txt");
							BufferedWriter out= new BufferedWriter(x);
							//BufferedWriter pout= new BufferedWriter(y);
							out.write(namep);
							out.write(idd);
							out.write(paus);
							out.write(job);
							out.write(motor);
							out.write(tmpt);
							out.write(cl);
							out.close();
							
							System.out.println("success");
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Parking Successfully !",
								    "NOTICE !",
								    JOptionPane.PLAIN_MESSAGE);
							new LoginMenu();
							frame.dispose();
							}
						}
						catch(Exception except) {
							System.out.println("error");			
						
					}
					}
					
				}
			});
			
		
		}
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(280, 200);
		frame.setLocationRelativeTo(null);
	}
	
}

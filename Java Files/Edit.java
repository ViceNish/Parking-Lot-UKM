import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Edit {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton btn1,btn2,btn3;
	//private String name,namep,idd,paus,job, car, tmpt,p;
	public Edit() {//String name,String namep,String idd,String paus, String job,String car, String tmpt, String p) {
		//super(name,namep,idd,paus,job,car,tmpt,p);
		frame=new JFrame("Edit");
		panel=new JPanel();
		label=new JLabel("Choose What you Want To Edit");
		btn1=new JButton("Change Vehicle Owner");
		btn2=new JButton("Promote/Demote Staff");
		btn3=new JButton("Back");
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ChangeVehicle();
				frame.dispose();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new PDS();
				frame.dispose();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new LoginMenu();
				frame.dispose();
			}
		});
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(530, 120);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
	}
}



//*****************************************************



//BORDER




//******************************************************


class ChangeVehicle {
	private JFrame frame;
	private JPanel panel;
	private JLabel label,lbl;
	private JButton btn1,btn2,btn3,btn4;
	private JTextField txt,txt2;
	//private String name,namep,idd,paus,job, car, tmpt,p;
	public ChangeVehicle() {//String name,String namep,String idd,String paus, String job,String car, String tmpt, String p){
		
		/*this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
		this.tmpt=tmpt;*/
		frame=new JFrame("Edit");
		panel=new JPanel();
		label=new JLabel("Your Name : ");
		lbl=new JLabel("Your ID : ");
		btn1=new JButton("Car");
		btn2=new JButton("Motor");
		btn3=new JButton("Staff");
		btn4=new JButton("MStaff");
		txt=new JTextField(10);
		txt2=new JTextField(10);
		String nme=txt.getText().trim();
		String id=txt2.getText().trim();
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(txt);
		panel.add(lbl);
		panel.add(txt2);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nme=txt.getText().trim();
				String id=txt2.getText().trim();
				new ECAR (nme,id);
				frame.dispose();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nme=txt.getText().trim();
				String id=txt2.getText().trim();
				new EMOTOR(nme,id);
				frame.dispose();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nme=txt.getText().trim();
				String id=txt2.getText().trim();
				new ESTAFF(nme,id);
				frame.dispose();
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nme=txt.getText().trim();
				String id=txt2.getText().trim();
				new EMSTAFF(nme,id);
				frame.dispose();
			}
		});
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(430, 120);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}

//*****************************************************



//BORDER




//******************************************************

class ECAR {
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	//private String plc[] = {"FTSM","FKAB","FUU"};
	//private JComboBox cb = new JComboBox(plc);
	private JButton btn;
	private String nme,id;
	
	private ArrayList<String> lines = new ArrayList<String>();
	//private String line=null;
	//private String name,namep,idd,paus,job, car, tmpt,p;
	public ECAR(String nme,String id) {//,String name,String namep,String idd,String paus, String job,String car, String tmpt, String p) {
		this.nme=nme;
		this.id=id;
		/*this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
		this.tmpt=tmpt;*/
		frame=new JFrame("Car Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="Lot 1") {
						try {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 1\\parked.txt");
						if(f.exists()) {
							BufferedReader pout= new BufferedReader(new FileReader(f));
							for(int i=1;(line=pout.readLine() )!=null;i++) {
								if(i==1) {
									line="Name : "+nme;
									
								}else if(i==2) {
									line="ID : "+id;
									
								}
									
								lines.add(line);
								lines.add(lnl);
							}
							pout.close();
							FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 1\\parked.txt");
							BufferedWriter out= new BufferedWriter(x);
							for(String s : lines)
								out.write("\n"+s);
							
							out.flush();
							out.close();
							
							JOptionPane.showMessageDialog(frame,
								    "You Have Changed The Owner Of This Vehicle.");
							new LoginMenu();
							frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
						}catch(Exception e) {
							System.out.println("error");
						}
					}else if(l=="Lot 2") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 2\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 2\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 3") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 3\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 3\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 4") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 4\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 4\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 5") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 5\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 5\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}
			}	
		});
		
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		//panel.add(cb);
		panel.add(bx);
		panel.add(btn);
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(260, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}


//*****************************************************



//BORDER




//******************************************************


class EMOTOR {
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	//private String plc[] = {"FTSM","FKAB","FUU"};
	//private JComboBox cb = new JComboBox(plc);
	private JButton btn;
	private String nme,id;
	
	private ArrayList<String> lines = new ArrayList<String>();
	//private String line=null;
	//private String name,namep,idd,paus,job, car, tmpt,p;
	public EMOTOR(String nme,String id) {//,String name,String namep,String idd,String paus, String job,String car, String tmpt, String p) {
		this.nme=nme;
		this.id=id;
		/*this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
		this.tmpt=tmpt;*/
		frame=new JFrame("Motor Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="Lot 1") {
						try {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 1\\parked.txt");
						if(f.exists()) {
							BufferedReader pout= new BufferedReader(new FileReader(f));
							for(int i=1;(line=pout.readLine() )!=null;i++) {
								if(i==1) {
									line="Name : "+nme;
									
								}else if(i==2) {
									line="ID : "+id;
									
								}
									
								lines.add(line);
								lines.add(lnl);
							}
							pout.close();
							FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 1\\parked.txt");
							BufferedWriter out= new BufferedWriter(x);
							for(String s : lines)
								out.write("\n"+s);
							
							out.flush();
							out.close();
							
							JOptionPane.showMessageDialog(frame,
								    "You Have Changed The Owner Of This Vehicle.");
							new LoginMenu();
							frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
						}catch(Exception e) {
							System.out.println("error");
						}
					}else if(l=="Lot 2") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 2\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 2\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 3") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 3\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 3\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 4") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 4\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 4\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 5") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 5\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 5\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}
			}	
		});
		
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		//panel.add(cb);
		panel.add(bx);
		panel.add(btn);
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(260, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}


//*****************************************************



//BORDER




//******************************************************

class ESTAFF {
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"S_Lot 1","S_Lot 2","S_Lot 3", "S_Lot 4","S_Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	//private String plc[] = {"FTSM","FKAB","FUU"};
	//private JComboBox cb = new JComboBox(plc);
	private JButton btn;
	private String nme,id;
	
	private ArrayList<String> lines = new ArrayList<String>();
	//private String line=null;
	//private String name,namep,idd,paus,job, car, tmpt,p;
	public ESTAFF(String nme,String id) {//,String name,String namep,String idd,String paus, String job,String car, String tmpt, String p) {
		this.nme=nme;
		this.id=id;
		/*this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
		this.tmpt=tmpt;*/
		frame=new JFrame("Staff Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="S_Lot 1") {
						try {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 1\\parked.txt");
						if(f.exists()) {
							BufferedReader pout= new BufferedReader(new FileReader(f));
							for(int i=1;(line=pout.readLine() )!=null;i++) {
								if(i==1) {
									line="Name : "+nme;
									
								}else if(i==2) {
									line="ID : "+id;
									
								}
									
								lines.add(line);
								lines.add(lnl);
							}
							pout.close();
							FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 1\\parked.txt");
							BufferedWriter out= new BufferedWriter(x);
							for(String s : lines)
								out.write("\n"+s);
							
							out.flush();
							out.close();
							
							JOptionPane.showMessageDialog(frame,
								    "You Have Changed The Owner Of This Vehicle.");
							new LoginMenu();
							frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
						}catch(Exception e) {
							System.out.println("error");
						}
					}else if(l=="S_Lot 2") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 2\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 2\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="S_Lot 3") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 3\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 3\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="S_Lot 4") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 4\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 4\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="S_Lot 5") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}
			}	
		});
		
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		//panel.add(cb);
		panel.add(bx);
		panel.add(btn);
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(260, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}


//*****************************************************



//BORDER




//******************************************************

class EMSTAFF {
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"S_Lot 1","S_Lot 2","S_Lot 3", "S_Lot 4","S_Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	//private String plc[] = {"FTSM","FKAB","FUU"};
	//private JComboBox cb = new JComboBox(plc);
	private JButton btn;
	private String nme,id;
	
	private ArrayList<String> lines = new ArrayList<String>();
	//private String line=null;
	//private String name,namep,idd,paus,job, car, tmpt,p;
	public EMSTAFF(String nme,String id) {//,String name,String namep,String idd,String paus, String job,String car, String tmpt, String p) {
		this.nme=nme;
		this.id=id;
		/*this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		this.car=car;
		this.tmpt=tmpt;*/
		frame=new JFrame("MStaff Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="M_Lot 1") {
						try {
						File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
						if(f.exists()) {
							BufferedReader pout= new BufferedReader(new FileReader(f));
							for(int i=1;(line=pout.readLine() )!=null;i++) {
								if(i==1) {
									line="Name : "+nme;
									
								}else if(i==2) {
									line="ID : "+id;
									
								}
									
								lines.add(line);
								lines.add(lnl);
							}
							pout.close();
							FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
							BufferedWriter out= new BufferedWriter(x);
							for(String s : lines)
								out.write("\n"+s);
							
							out.flush();
							out.close();
							
							JOptionPane.showMessageDialog(frame,
								    "You Have Changed The Owner Of This Vehicle.");
							new LoginMenu();
							frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
						}catch(Exception e) {
							System.out.println("error");
						}
					}else if(l=="M_Lot 2") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="M_Lot 3") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="M_Lot 4") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="M_Lot 5") {
						try {
							File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
							if(f.exists()) {
								BufferedReader pout= new BufferedReader(new FileReader(f));
								for(int i=1;(line=pout.readLine() )!=null;i++) {
									if(i==1) {
										line="Name : "+nme;
										
									}else if(i==2) {
										line="ID : "+id;
										
									}
										
									lines.add(line);
									lines.add(lnl);
								}
								pout.close();
								FileWriter x=new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
								BufferedWriter out= new BufferedWriter(x);
								for(String s : lines)
									out.write("\n"+s);
								
								out.flush();
								out.close();
								
								JOptionPane.showMessageDialog(frame,
									    "You Have Changed The Owner Of This Vehicle.");
								new LoginMenu();
								frame.dispose();
							}else {
								JOptionPane.showMessageDialog(frame,
									    "Parking is empty.");
							}
							}catch(Exception e) {
								System.out.println("error");
							}
					}
			}	
		});
		
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		//panel.add(cb);
		panel.add(bx);
		panel.add(btn);
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(260, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}




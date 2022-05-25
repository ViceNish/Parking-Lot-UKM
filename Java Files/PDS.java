import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class PDS{
	private JFrame frame;
	private JPanel panel;
	private JButton btn1,btn2;
	
	public PDS() {
		frame=new JFrame("Promote/Demote Staff");
		panel=new JPanel();
		btn1=new JButton("Promote Staff");
		btn2=new JButton("Demote Staff");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new Promote();
				frame.dispose();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new Demote();
				frame.dispose();
			}
		});
		panel.setLayout(new FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}


//*****************************************************



//BORDER




//******************************************************


class Promote{
	private JFrame frame;
	private JPanel panel;
	private JButton btn1,btn2,btn3,btn4;
	public Promote() {
		frame=new JFrame("Promote Staff");
		panel=new JPanel();
		btn1=new JButton("Car Park");
		btn2=new JButton("Motor Park");
		btn3=new JButton("Staff Park");
		btn4=new JButton("MStaff Park");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new ECP();
				frame.dispose();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new EMP();
				frame.dispose();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new ESP();
				frame.dispose();
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new EMSP();
				frame.dispose();
			}
		});
		
		panel.setLayout(new FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(300, 130);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
}


//*****************************************************



//BORDER




//******************************************************

class ECP{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	
	private JButton btn;
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	public ECP() {
		
		frame=new JFrame("Car Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					//String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="Lot 1") {
						try {
						
						FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 1\\parked.txt");
						BufferedReader b=new BufferedReader(f);
						while((line=b.readLine())!=null) {
							if(line.contains("Staff")) 
								line=line.replace("Staff", "Management");
							lines.add(line);
							}
						f.close();
						b.close();
						FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 1\\parked.txt");
						BufferedWriter out = new BufferedWriter(y);
						
						for(String s : lines)
							out.write(s+"\n");
						out.flush();
						out.close();
						JOptionPane.showMessageDialog(frame,
							    "You Have Been Promoted !");
						new LoginMenu();
						frame.dispose();
						}catch(Exception e) {
							System.out.println("error");
						}
						
					}else if(l=="Lot 2") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 2\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 2\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 3") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 3\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 3\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 4") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 4\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 4\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 5") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 5\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 5\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
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


class EMP{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	
	private JButton btn;
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	public EMP() {
		
		frame=new JFrame("Motor Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					//String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="Lot 1") {
						try {
						
						FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 1\\parked.txt");
						BufferedReader b=new BufferedReader(f);
						while((line=b.readLine())!=null) {
							if(line.contains("Staff")) 
								line=line.replace("Staff", "Management");
							lines.add(line);
							}
						f.close();
						b.close();
						FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 1\\parked.txt");
						BufferedWriter out = new BufferedWriter(y);
						
						for(String s : lines)
							out.write(s+"\n");
						out.flush();
						out.close();
						JOptionPane.showMessageDialog(frame,
							    "You Have Been Promoted !");
						new LoginMenu();
						frame.dispose();
						}catch(Exception e) {
							System.out.println("error");
						}
						
					}else if(l=="Lot 2") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 2\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 2\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 3") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 3\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 3\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 4") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 4\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 4\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 5") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 5\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 5\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
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

class ESP{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"S_Lot 1","S_Lot 2","S_Lot 3", "S_Lot 4","S_Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	
	private JButton btn;
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	public ESP() {
		
		frame=new JFrame("Staff Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					//String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="S_Lot 1") {
						try {
						
						FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 1\\parked.txt");
						BufferedReader b=new BufferedReader(f);
						while((line=b.readLine())!=null) {
							if(line.contains("Staff")) 
								line=line.replace("Staff", "Management");
							lines.add(line);
							}
						f.close();
						b.close();
						FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 1\\parked.txt");
						BufferedWriter out = new BufferedWriter(y);
						
						for(String s : lines)
							out.write(s+"\n");
						out.flush();
						out.close();
						JOptionPane.showMessageDialog(frame,
							    "You Have Been Promoted !");
						new LoginMenu();
						frame.dispose();
						}catch(Exception e) {
							System.out.println("error");
						}
						
					}else if(l=="S_Lot 2") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 2\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 2\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="S_Lot 3") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 3\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 3\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="S_Lot 4") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 4\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 4\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="S_Lot 5") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
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

class EMSP{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"M_Lot 1","M_Lot 2","M_Lot 3", "M_Lot 4","M_Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	
	private JButton btn;
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	public EMSP() {
		
		frame=new JFrame("MStaff Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					//String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="M_Lot 1") {
						try {
						
						FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
						BufferedReader b=new BufferedReader(f);
						while((line=b.readLine())!=null) {
							if(line.contains("Staff")) 
								line=line.replace("Staff", "Management");
							lines.add(line);
							}
						f.close();
						b.close();
						FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
						BufferedWriter out = new BufferedWriter(y);
						
						for(String s : lines)
							out.write(s+"\n");
						out.flush();
						out.close();
						JOptionPane.showMessageDialog(frame,
							    "You Have Been Promoted !");
						new LoginMenu();
						frame.dispose();
						}catch(Exception e) {
							System.out.println("error");
						}
						
					}else if(l=="M_Lot 2") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="M_Lot 3") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="M_Lot 4") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="M_Lot 5") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Staff")) 
									line=line.replace("Staff", "Management");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Promoted !");
							new LoginMenu();
							frame.dispose();
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
//*****************************************************



//BORDER




//******************************************************


class Demote{
	private JFrame frame;
	private JPanel panel;
	private JButton btn1,btn2,btn3,btn4;
	public Demote() {
		frame=new JFrame("Demote Staff");
		panel=new JPanel();
		btn1=new JButton("Car Park");
		btn2=new JButton("Motor Park");
		btn3=new JButton("Staff Park");
		btn4=new JButton("MStaff Park");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new ECD();
				frame.dispose();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new EMD();
				frame.dispose();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new ESD();
				frame.dispose();
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				new EMSD();
				frame.dispose();
			}
		});
		
		panel.setLayout(new FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(300, 130);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
}

//*****************************************************



//BORDER




//******************************************************

class ECD{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	
	private JButton btn;
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	public ECD() {
		
		frame=new JFrame("Car Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					//String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="Lot 1") {
						try {
						
						FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 1\\parked.txt");
						BufferedReader b=new BufferedReader(f);
						while((line=b.readLine())!=null) {
							if(line.contains("Management")) 
								line=line.replace("Management", "Staff");
							lines.add(line);
							}
						f.close();
						b.close();
						FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 1\\parked.txt");
						BufferedWriter out = new BufferedWriter(y);
						
						for(String s : lines)
							out.write(s+"\n");
						out.flush();
						out.close();
						JOptionPane.showMessageDialog(frame,
							    "You Have Been Demoted.");
						new LoginMenu();
						frame.dispose();
						}catch(Exception e) {
							System.out.println("error");
						}
						
					}else if(l=="Lot 2") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 2\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 2\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 3") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 3\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 3\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 4") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 4\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 4\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 5") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 5\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 5\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
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

class EMD{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	
	private JButton btn;
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	public EMD() {
		
		frame=new JFrame("Motor Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					//String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="Lot 1") {
						try {
						
						FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 1\\parked.txt");
						BufferedReader b=new BufferedReader(f);
						while((line=b.readLine())!=null) {
							if(line.contains("Management")) 
								line=line.replace("Management", "Staff");
							lines.add(line);
							}
						f.close();
						b.close();
						FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 1\\parked.txt");
						BufferedWriter out = new BufferedWriter(y);
						
						for(String s : lines)
							out.write(s+"\n");
						out.flush();
						out.close();
						JOptionPane.showMessageDialog(frame,
							    "You Have Been Demoted.");
						new LoginMenu();
						frame.dispose();
						}catch(Exception e) {
							System.out.println("error");
						}
						
					}else if(l=="Lot 2") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 2\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 2\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 3") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 3\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 3\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 4") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 4\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 4\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="Lot 5") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 5\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 5\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
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

class ESD{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"S_Lot 1","S_Lot 2","S_Lot 3", "S_Lot 4","S_Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	
	private JButton btn;
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	public ESD() {
		
		frame=new JFrame("Staff Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					//String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="S_Lot 1") {
						try {
						
						FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 1\\parked.txt");
						BufferedReader b=new BufferedReader(f);
						while((line=b.readLine())!=null) {
							if(line.contains("Management")) 
								line=line.replace("Management", "Staff");
							lines.add(line);
							}
						f.close();
						b.close();
						FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 1\\parked.txt");
						BufferedWriter out = new BufferedWriter(y);
						
						for(String s : lines)
							out.write(s+"\n");
						out.flush();
						out.close();
						JOptionPane.showMessageDialog(frame,
							    "You Have Been Demoted.");
						new LoginMenu();
						frame.dispose();
						}catch(Exception e) {
							System.out.println("error");
						}
						
					}else if(l=="S_Lot 2") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 2\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 2\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="S_Lot 3") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 3\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 3\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="S_Lot 4") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 4\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 4\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="S_Lot 5") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\Usavefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
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


class EMSD{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"M_Lot 1","M_Lot 2","M_Lot 3", "M_Lot 4","M_Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	
	private JButton btn;
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	public EMSD() {
		
		frame=new JFrame("MStaff Parking");
		panel=new JPanel();
		label=new JLabel("Select Lot");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l;//, cl;
					String line="";
					//String lnl="";
					l=bx.getSelectedItem().toString();
					//cl="\nPark : "+l;
					if(l=="M_Lot 1") {
						try {
						
						FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
						BufferedReader b=new BufferedReader(f);
						while((line=b.readLine())!=null) {
							if(line.contains("Management")) 
								line=line.replace("Management", "Staff");
							lines.add(line);
							}
						f.close();
						b.close();
						FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
						BufferedWriter out = new BufferedWriter(y);
						
						for(String s : lines)
							out.write(s+"\n");
						out.flush();
						out.close();
						JOptionPane.showMessageDialog(frame,
							    "You Have Been Demoted.");
						new LoginMenu();
						frame.dispose();
						}catch(Exception e) {
							System.out.println("error");
						}
						
					}else if(l=="M_Lot 2") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="M_Lot 3") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="M_Lot 4") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
							}catch(Exception e) {
								System.out.println("error");
							}
					}else if(l=="M_Lot 5") {
						try {
							
							FileReader f=new FileReader("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
							BufferedReader b=new BufferedReader(f);
							while((line=b.readLine())!=null) {
								if(line.contains("Management")) 
									line=line.replace("Management", "Staff");
								lines.add(line);
								}
							f.close();
							b.close();
							FileWriter y = new FileWriter("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
							BufferedWriter out = new BufferedWriter(y);
							
							for(String s : lines)
								out.write(s+"\n");
							out.flush();
							out.close();
							JOptionPane.showMessageDialog(frame,
								    "You Have Been Demoted.");
							new LoginMenu();
							frame.dispose();
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
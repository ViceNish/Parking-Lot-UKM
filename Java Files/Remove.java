import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Remove{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton btn1,btn2,btn3,btn4;
	public Remove() {
		frame=new JFrame("Parked Out");
		panel=new JPanel();
		label=new JLabel("Select Type of Park");
		btn1=new JButton("Public");
		btn2=new JButton("Premium Park");
		btn3=new JButton("Premium M Park");
		btn4=new JButton("Back");
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RPUBLIC();
				frame.dispose();
			}	
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RPPARK();
				frame.dispose();
			}	
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RMPARK();
				frame.dispose();
			}	
		});
		btn4.addActionListener(new ActionListener() {
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
		panel.add(btn4);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(460, 120);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}




//*****************************************************



//BORDER




//******************************************************


class RPUBLIC{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton btn1,btn2;
	
	public RPUBLIC() {
		frame=new JFrame("Public");
		panel=new JPanel();
		label=new JLabel("Select Vehicle");
		btn1=new JButton("Car");
		btn2=new JButton("Motorcycle");
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RCAR();
				frame.dispose();
			}	
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RMOTOR();
				frame.dispose();
			}
		});
		
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		
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

class RPPARK{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"S_Lot 1","S_Lot 2","S_Lot 3", "S_Lot 4","S_Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	//private String plc[] = {"FTSM","FKAB","FUU"};
	//private JComboBox cb = new JComboBox(plc);
	private JButton btn;
	
	
	public RPPARK() {
		frame=new JFrame("Premium Park");
		panel=new JPanel();
		label=new JLabel("Select Vehicle");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l, cl;
					l=bx.getSelectedItem().toString();
					cl="\nPark : "+l;
					if(l=="S_Lot 1") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 1\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="S_Lot 2") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 2\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="S_Lot 3") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 3\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="S_Lot 4") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 4\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="S_Lot 5") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
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


class RMPARK{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"M_Lot 1","M_Lot 2","M_Lot 3", "M_Lot 4","M_Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	//private String plc[] = {"FTSM","FKAB","FUU"};
	//private JComboBox cb = new JComboBox(plc);
	private JButton btn;
	
	
	public RMPARK() {
		frame=new JFrame("Premium M Park");
		panel=new JPanel();
		label=new JLabel("Select Vehicle");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l, cl;
					l=bx.getSelectedItem().toString();
					cl="\nPark : "+l;
					if(l=="M_Lot 1") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="M_Lot 2") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="M_Lot 3") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="M_Lot 4") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="M_Lot 5") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
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

class RCAR{
	private JFrame frame;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	//private String plc[] = {"FTSM","FKAB","FUU"};
	//private JComboBox cb = new JComboBox(plc);
	private JButton btn;
	
	
	public RCAR() {
		frame=new JFrame("Car");
		panel=new JPanel();
		label=new JLabel("Select Vehicle");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l, cl;
					l=bx.getSelectedItem().toString();
					cl="\nPark : "+l;
					if(l=="Lot 1") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 1\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="Lot 2") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 2\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="Lot 3") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\ot 3\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
						}else if(l=="Lot 4") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 4\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
						}else if(l=="Lot 5") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 5\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
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

class RMOTOR{
	private JFrame frame;;
	private JPanel panel=new JPanel();
	private JLabel label;
	private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	private JComboBox bx=new JComboBox(lot);
	//private String plc[] = {"FTSM","FKAB","FUU"};
	//private JComboBox cb = new JComboBox(plc);
	private JButton btn;
	
	
	public RMOTOR() {
		frame=new JFrame("Motor");
		panel=new JPanel();
		label=new JLabel("Select Vehicle");
		btn=new JButton("Enter");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String p=cb.getSelectedItem().toString();
				
					String l, cl;
					l=bx.getSelectedItem().toString();
					cl="\nPark : "+l;
					if(l=="Lot 1") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 1\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="Lot 2") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 2\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="Lot 3") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\ot 3\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="Lot 4") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 4\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
						}
					}else if(l=="Lot 5") {
						File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 5\\parked.txt");
						if(f.exists()) {
						f.delete();
						JOptionPane.showMessageDialog(frame,
							    "You have parked out.");
						new LoginMenu();
						frame.dispose();
						}else {
							JOptionPane.showMessageDialog(frame,
								    "Parking is empty.");
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
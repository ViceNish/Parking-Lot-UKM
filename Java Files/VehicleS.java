import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class VehicleS {

	//declare n use
	private JFrame frame=new JFrame();
	private JPanel panel=new JPanel();
	private JButton btn1, btn2, btn3, btn4;
	private JLabel lbl=new JLabel("Which vehicle do you want to park?");
	private String name, namep,idd,paus, job;
	
	public VehicleS(String name, String namep,String idd,String paus,String job)  {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		//set
		panel.setLayout(new BorderLayout(3,3));
		btn1=new JButton("Car");
		panel.add(btn1, BorderLayout.CENTER);
		btn2=new JButton("Motorcycle");
		panel.add(btn2, BorderLayout.SOUTH);
		btn3=new JButton("Bus");
		panel.add(btn3, BorderLayout.EAST);
		btn4=new JButton("Lorry");
		panel.add(btn4, BorderLayout.WEST);
		panel.add(lbl, BorderLayout.NORTH);
		
		frame.add(panel);
		frame.setTitle("Vehicle");
		frame.setVisible(true);
		frame.setSize(280, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Vehi V=new Vehi();
		btn1.addActionListener(V);
		btn2.addActionListener(V);
		btn3.addActionListener(V);
		btn4.addActionListener(V);
	}
	
	public class Vehi implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn3) {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, BUS are not allowed to parked at UKM.",
					    "WARNING",
					    JOptionPane.ERROR_MESSAGE);
			}else if(e.getSource()==btn4) {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, LORRY are not allowed to parked at UKM.",
					    "WARNING",
					    JOptionPane.ERROR_MESSAGE);
			}else if(e.getSource()==btn1) {
				//String student="student";
				new CarS(name,namep,idd,paus,job);
				frame.dispose();
			}else if(e.getSource()==btn2) {
				//String student="student";
				new MotorS(name,namep,idd,paus,job);
				frame.dispose();
			}
			
		}
		
	}
	
	
}
//*****************************************************



//BORDER




//******************************************************

class VehicleSt {

	//declare n use
	private JFrame frame=new JFrame();
	private JPanel panel=new JPanel();
	private JButton btn1, btn2, btn3, btn4;
	private JLabel lbl=new JLabel("Which vehicle do you want to park?");
	private String name, namep,idd,paus, job;
	
	public VehicleSt(String name, String namep,String idd,String paus,String job)  {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		//set
		panel.setLayout(new BorderLayout(3,3));
		btn1=new JButton("Car");
		panel.add(btn1, BorderLayout.CENTER);
		btn2=new JButton("Motorcycle");
		panel.add(btn2, BorderLayout.SOUTH);
		btn3=new JButton("Bus");
		panel.add(btn3, BorderLayout.EAST);
		btn4=new JButton("Lorry");
		panel.add(btn4, BorderLayout.WEST);
		panel.add(lbl, BorderLayout.NORTH);
		
		frame.add(panel);
		frame.setTitle("Vehicle");
		frame.setVisible(true);
		frame.setSize(280, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Vehi V=new Vehi();
		btn1.addActionListener(V);
		btn2.addActionListener(V);
		btn3.addActionListener(V);
		btn4.addActionListener(V);
	}
	
	public class Vehi implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn3) {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, BUS are not allowed to parked at UKM.",
					    "WARNING",
					    JOptionPane.ERROR_MESSAGE);
			}else if(e.getSource()==btn4) {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, LORRY are not allowed to parked at UKM.",
					    "WARNING",
					    JOptionPane.ERROR_MESSAGE);
			}else if(e.getSource()==btn1) {
				//String staff="staff";
				new CarSt(name,namep,idd,paus,job);
				frame.dispose();
			}else if(e.getSource()==btn2) {
				//String staff="staff";
				new MotorSt(name,namep,idd,paus,job);
				frame.dispose();
			}
			
		}
		
	}
	
	
}
//*****************************************************



//BORDER




//******************************************************

class VehicleM {

	//declare n use
	private JFrame frame=new JFrame();
	private JPanel panel=new JPanel();
	private JButton btn1, btn2, btn3, btn4;
	private JLabel lbl=new JLabel("Which vehicle do you want to park?");
	private String name, namep,idd,paus, job;
	
	public VehicleM(String name, String namep,String idd,String paus,String job)  {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		//set
		panel.setLayout(new BorderLayout(3,3));
		btn1=new JButton("Car");
		panel.add(btn1, BorderLayout.CENTER);
		btn2=new JButton("Motorcycle");
		panel.add(btn2, BorderLayout.SOUTH);
		btn3=new JButton("Bus");
		panel.add(btn3, BorderLayout.EAST);
		btn4=new JButton("Lorry");
		panel.add(btn4, BorderLayout.WEST);
		panel.add(lbl, BorderLayout.NORTH);
		
		frame.add(panel);
		frame.setTitle("Vehicle");
		frame.setVisible(true);
		frame.setSize(280, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Vehi V=new Vehi();
		btn1.addActionListener(V);
		btn2.addActionListener(V);
		btn3.addActionListener(V);
		btn4.addActionListener(V);
	}
	
	public class Vehi implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn3) {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, BUS are not allowed to parked at UKM.",
					    "WARNING",
					    JOptionPane.ERROR_MESSAGE);
			}else if(e.getSource()==btn4) {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, LORRY are not allowed to parked at UKM.",
					    "WARNING",
					    JOptionPane.ERROR_MESSAGE);
			}else if(e.getSource()==btn1) {
				//String Mstaff="Mstaff";
				new CarM(name,namep,idd,paus,job);
				frame.dispose();
			}else if(e.getSource()==btn2) {
				//String Mstaff="Mstaff";
				new MotorM(name,namep,idd,paus,job);
				frame.dispose();
			}
			
		}
		
	}
	
	
}
//*****************************************************



//BORDER
//START CAR STUDENT,STAFF N MSTAFF



//******************************************************


class CarS{
	//declare n use
	private JFrame frame=new JFrame ("Car");
	private JPanel panel=new JPanel();
	private JLabel lbl =new JLabel("Enter Plate No. :");
	//JLabel lbl2 = new JLabel("When done, press Enter");

	private JButton btn2;
	private JList list;
	private JTextField txt;
	private JLabel label;
	private DefaultListModel model;
	private String name, namep,idd,paus, job;
	//constructor
	public CarS(String name, String namep,String idd,String paus,String job) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		//set n add
		panel.setLayout(new FlowLayout());
		
		btn2=new JButton("Next");
		
		model=new DefaultListModel();
		list=new JList(model);
		//list.setBackground(Color.lightGray);
		label=new JLabel("Enter Plate No. :");
		txt=new JTextField(10);
		txt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				txt.setText("");
			}
		});
		
		txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(txt.getText());
				JOptionPane.showMessageDialog(null, "Good");
				txt.setText("");
			}
		});
		panel.add(label);
		panel.add(txt);
		//panel.add(lbl2);
		panel.add(btn2);
		panel.add(list);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(180, 150);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		The C =new The();
		
		btn2.addActionListener(C);
		
	}
	
	public class The implements ActionListener{

		public void actionPerformed(ActionEvent p) {
			if(p.getSource()==btn2) {
				String car;
				String plateno;
				try {
					plateno=txt.getText().trim();
					car="\nType : Car"+"\nPlate No : "+plateno;
					new ParkingSc(name,namep,idd,paus,job, car);
					frame.dispose();
					
				}
				catch(Exception except){
					System.out.println("error");
				}
				
			}
		}
		
	}
}

//*****************************************************



//BORDER




//******************************************************

class CarSt{
	//declare n use
	private JFrame frame=new JFrame ("Car");
	private JPanel panel=new JPanel();
	private JLabel lbl =new JLabel("Enter Plate No. :");
	//JLabel lbl2 = new JLabel("When done, press Enter");

	private JButton btn2;
	private JList list;
	private JTextField txt;
	private JLabel label;
	private DefaultListModel model;
	private String name, namep,idd,paus, job;
	//constructor
	public CarSt(String name, String namep,String idd,String paus,String job) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		//set n add
		panel.setLayout(new FlowLayout());
		
		btn2=new JButton("Next");
		
		model=new DefaultListModel();
		list=new JList(model);
		//list.setBackground(Color.lightGray);
		label=new JLabel("Enter Plate No. :");
		txt=new JTextField(10);
		txt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				txt.setText("");
			}
		});
		
		txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(txt.getText());
				JOptionPane.showMessageDialog(null, "Good");
				txt.setText("");
			}
		});
		panel.add(label);
		panel.add(txt);
		//panel.add(lbl2);
		panel.add(btn2);
		panel.add(list);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(180, 150);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		The C =new The();
		
		btn2.addActionListener(C);
		
	}
	
	public class The implements ActionListener{

		public void actionPerformed(ActionEvent p) {
			if(p.getSource()==btn2) {
				String car;
				String plateno;
				try {
					
					plateno=txt.getText().trim();
					car="\nType : Car"+" \nPlate No : "+plateno;
					new ParkingStc(name,namep,idd,paus,job, car);
					frame.dispose();
					
				}
				catch(Exception except){
					System.out.println("error");
				}
				
			}
		}
		
	}
}
//*****************************************************



//BORDER




//******************************************************

class CarM{
	//declare n use
	private JFrame frame=new JFrame ("Car");
	private JPanel panel=new JPanel();
	private JLabel lbl =new JLabel("Enter Plate No. :");
	//JLabel lbl2 = new JLabel("When done, press Enter");

	private JButton btn2;
	private JList list;
	private JTextField txt;
	private JLabel label;
	private DefaultListModel model;
	private String name, namep,idd,paus, job;
	//constructor
	public CarM(String name, String namep,String idd,String paus,String job) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		//set n add
		panel.setLayout(new FlowLayout());
		
		btn2=new JButton("Next");
		
		model=new DefaultListModel();
		list=new JList(model);
		//list.setBackground(Color.lightGray);
		label=new JLabel("Enter Plate No. :");
		txt=new JTextField(10);
		txt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				txt.setText("");
			}
		});
		
		txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(txt.getText());
				JOptionPane.showMessageDialog(null, "Good");
				txt.setText("");
			}
		});
		panel.add(label);
		panel.add(txt);
		//panel.add(lbl2);
		panel.add(btn2);
		panel.add(list);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(180, 150);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		The C =new The();
		
		btn2.addActionListener(C);
		
	}
	
	public class The implements ActionListener{

		public void actionPerformed(ActionEvent p) {
			if(p.getSource()==btn2) {
				String car;
				String plateno;
				try {
					
					plateno=txt.getText().trim();
					car="\nType : Car"+" \nPlate No : "+plateno;
					new ParkingMc(name,namep,idd,paus,job, car);
					frame.dispose();
					
				}
				catch(Exception except){
					System.out.println("error");
				}
				
			}
		}
		
	}
}
//*****************************************************



//BORDER
//START MOTOR STUDENT, STAFF N MSTAFF



//******************************************************


class MotorS{
	//declare n use
	private JFrame frame=new JFrame ("Motor");
	private JPanel panel=new JPanel();
	private JLabel lbl =new JLabel("Enter Plate No. :");
	//JLabel lbl2 = new JLabel("When done, press Enter");

	private JButton btn2;
	private JList list;
	private JTextField txt;
	private JLabel label;
	private DefaultListModel model;
	private String name, namep,idd,paus, job;
	//constructor
	public MotorS(String name, String namep,String idd,String paus,String job) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		//set n add
		panel.setLayout(new FlowLayout());
		
		btn2=new JButton("Next");
		
		model=new DefaultListModel();
		list=new JList(model);
		//list.setBackground(Color.lightGray);
		label=new JLabel("Enter Plate No. :");
		txt=new JTextField(10);
		txt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				txt.setText("");
			}
		});
		
		txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(txt.getText());
				JOptionPane.showMessageDialog(null, "Good");
				txt.setText("");
			}
		});
		panel.add(label);
		panel.add(txt);
		//panel.add(lbl2);
		panel.add(btn2);
		panel.add(list);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(180, 150);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		The C =new The();
		
		btn2.addActionListener(C);
		
	}
	
	public class The implements ActionListener{

		public void actionPerformed(ActionEvent p) {
			if(p.getSource()==btn2) {
				String motor;
				String plateno;
				try {
					
					plateno=txt.getText().trim();
					motor="\nType : Motor"+" \nPlate No : "+plateno;
					new ParkingSm(name,namep,idd,paus,job, motor);
					frame.dispose();
					
				}
				catch(Exception except){
					System.out.println("error");
				}
				
			}
		}
		
	}
}

//*****************************************************



//BORDER




//******************************************************



class MotorSt{
	//declare n use
	private JFrame frame=new JFrame ("Motor");
	private JPanel panel=new JPanel();
	private JLabel lbl =new JLabel("Enter Plate No. :");
	//JLabel lbl2 = new JLabel("When done, press Enter");

	private JButton btn2;
	private JList list;
	private JTextField txt;
	private JLabel label;
	private DefaultListModel model;
	private String name, namep,idd,paus, job;
	//constructor
	public MotorSt(String name, String namep,String idd,String paus,String job) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		//set n add
		panel.setLayout(new FlowLayout());
		
		btn2=new JButton("Next");
		
		model=new DefaultListModel();
		list=new JList(model);
		//list.setBackground(Color.lightGray);
		label=new JLabel("Enter Plate No. :");
		txt=new JTextField(10);
		txt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				txt.setText("");
			}
		});
		
		txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(txt.getText());
				JOptionPane.showMessageDialog(null, "Good");
				txt.setText("");
			}
		});
		panel.add(label);
		panel.add(txt);
		//panel.add(lbl2);
		panel.add(btn2);
		panel.add(list);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(180, 150);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		The C =new The();
		
		btn2.addActionListener(C);
		
	}
	
	public class The implements ActionListener{

		public void actionPerformed(ActionEvent p) {
			if(p.getSource()==btn2) {
				String motor;
				String plateno;
				try {
					
					plateno=txt.getText().trim();
					motor="\nType : Motor"+" \nPlate No : "+plateno;
					new ParkingStm(name,namep,idd,paus,job, motor);
					frame.dispose();
					
				}
				catch(Exception except){
					System.out.println("error");
				}
				
			}
		}
		
	}
}

//*****************************************************



//BORDER




//******************************************************


class MotorM{
	//declare n use
	private JFrame frame=new JFrame ("Motor");
	private JPanel panel=new JPanel();
	private JLabel lbl =new JLabel("Enter Plate No. :");
	//JLabel lbl2 = new JLabel("When done, press Enter");

	private JButton btn2;
	private JList list;
	private JTextField txt;
	private JLabel label;
	private DefaultListModel model;
	private String name, namep,idd,paus, job;
	//constructor
	public MotorM(String name, String namep,String idd,String paus,String job) {
		this.name=name;
		this.namep=namep;
		this.idd=idd;
		this.paus=paus;
		this.job=job;
		//set n add
		panel.setLayout(new FlowLayout());
		
		btn2=new JButton("Next");
		
		model=new DefaultListModel();
		list=new JList(model);
		//list.setBackground(Color.lightGray);
		label=new JLabel("Enter Plate No. :");
		txt=new JTextField(10);
		txt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				txt.setText("");
			}
		});
		
		txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(txt.getText());
				JOptionPane.showMessageDialog(null, "Good");
				txt.setText("");
			}
		});
		panel.add(label);
		panel.add(txt);
		//panel.add(lbl2);
		panel.add(btn2);
		panel.add(list);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(180, 150);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		The C =new The();
		
		btn2.addActionListener(C);
		
	}
	
	public class The implements ActionListener{

		public void actionPerformed(ActionEvent p) {
			if(p.getSource()==btn2) {
				String motor;
				String plateno;
				try {
					
					plateno=txt.getText().trim();
					motor="\nType : Motor"+" \nPlate No : "+plateno;
					new ParkingMm(name,namep,idd,paus,job, motor);
					frame.dispose();
					
				}
				catch(Exception except){
					System.out.println("error");
				}
				
			}
		}
		
	}
}
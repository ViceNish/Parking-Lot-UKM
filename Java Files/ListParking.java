import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class ListParking {

	private JFrame frame=new JFrame("List of Parking");
	private JPanel panel=new JPanel();
	//private JList<String> list;
	private JButton btn, btn2,btn3,btn4,btn5;
	//private DefaultListModel model;
	public ListParking() {
		//list=new JList();
		btn=new JButton("Back");
		btn2=new JButton("Car Park");
		btn3=new JButton("Motor Park");
		btn4=new JButton("Staff Park");
		btn5=new JButton("M Staff Park");
		// model=new DefaultListModel();
		panel.setLayout(new FlowLayout());
		//panel.add(list);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginMenu();
				frame.dispose();	
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LCP();
				
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LMP();
				
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LSP();
					
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LMSP();
			
			}
		});
		/*File file=new File("C:\\Users\\ADMIN1\\Desktop\\t1\\Assignment\\Parking List");
		String[] files=file.list();
		for(String string : files) {
			model.addElement(string);
			//list=new JList<String>(string);
			//System.out.println(string);
		}*/
		
		//list=new JList<String>(model);
		
		//panel.add(list);
		
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(280, 230);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

//*****************************************************



//BORDER




//******************************************************


class LCP{
	private JFrame frame=new JFrame("Car Park");
	private JPanel panel=new JPanel();
	private JList<String> list;
	//private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	//private JComboBox bx=new JComboBox(lot);
	private JButton btn,btn2,btn3,btn4,btn5;
	private DefaultListModel model;
	public LCP() {
		model=new DefaultListModel();
		list=new JList<String>(model);
		//String l=bx.getSelectedItem().toString();
		btn=new JButton("Lot 1");
		btn2=new JButton("Lot 2");
		btn3=new JButton("Lot 3");
		btn4=new JButton("Lot 4");
		btn5=new JButton("Lot 5");
		
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new CLot_1();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new CLot_2();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new CLot_3();
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new CLot_4();
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new CLot_5();
			}
		});
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(280, 200);
		frame.setLocationRelativeTo(null);
		
	}
}


class CLot_1{
	private JFrame frame=new JFrame("Car Lot 1");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public CLot_1(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 1\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class CLot_2{
	private JFrame frame=new JFrame("Car Lot 2");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public CLot_2(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 2\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class CLot_3{
	private JFrame frame=new JFrame("Car Lot 3");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public CLot_3(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 3\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}

class CLot_4{
	private JFrame frame=new JFrame("Car Lot 4");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public CLot_4(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 4\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class CLot_5{
	private JFrame frame=new JFrame("Car Lot 5");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public CLot_5(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 5\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


//*****************************************************



//BORDER




//******************************************************

class LMP{
	private JFrame frame=new JFrame("Motor Park");
	private JPanel panel=new JPanel();
	private JList<String> list;
	//private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	//private JComboBox bx=new JComboBox(lot);
	private JButton btn,btn2,btn3,btn4,btn5;
	private DefaultListModel model;
	public LMP() {
		model=new DefaultListModel();
		list=new JList<String>(model);
		//String l=bx.getSelectedItem().toString();
		btn=new JButton("Lot 1");
		btn2=new JButton("Lot 2");
		btn3=new JButton("Lot 3");
		btn4=new JButton("Lot 4");
		btn5=new JButton("Lot 5");
		
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MLot_1();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MLot_2();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MLot_3();
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MLot_4();
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MLot_5();
			}
		});
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(280, 200);
		frame.setLocationRelativeTo(null);
		
	}
}


class MLot_1{
	private JFrame frame=new JFrame("Motor Lot 1");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MLot_1(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 1\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class MLot_2{
	private JFrame frame=new JFrame("Motor Lot 2");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MLot_2(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 2\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class MLot_3{
	private JFrame frame=new JFrame("Motor Lot 3");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MLot_3(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 3\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}

class MLot_4{
	private JFrame frame=new JFrame("Motor Lot 4");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MLot_4(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 4\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class MLot_5{
	private JFrame frame=new JFrame("Motor Lot 5");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MLot_5(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 5\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


//*****************************************************



//BORDER




//******************************************************


class LSP{
	private JFrame frame=new JFrame("Staff Park");
	private JPanel panel=new JPanel();
	private JList<String> list;
	//private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	//private JComboBox bx=new JComboBox(lot);
	private JButton btn,btn2,btn3,btn4,btn5;
	private DefaultListModel model;
	public LSP() {
		model=new DefaultListModel();
		list=new JList<String>(model);
		//String l=bx.getSelectedItem().toString();
		btn=new JButton("S_Lot 1");
		btn2=new JButton("S_Lot 2");
		btn3=new JButton("S_Lot 3");
		btn4=new JButton("S_Lot 4");
		btn5=new JButton("S_Lot 5");
		
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new SLot_1();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new SLot_2();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new SLot_3();
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new SLot_4();
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new SLot_5();
			}
		});
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(280, 200);
		frame.setLocationRelativeTo(null);
		
	}
}


class SLot_1{
	private JFrame frame=new JFrame("S_Lot 1");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public SLot_1(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 1\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class SLot_2{
	private JFrame frame=new JFrame("S_Lot 2");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public SLot_2(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 2\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class SLot_3{
	private JFrame frame=new JFrame("S_Lot 3");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public SLot_3(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 3\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}

class SLot_4{
	private JFrame frame=new JFrame("S_Lot 4");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public SLot_4(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 4\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class SLot_5{
	private JFrame frame=new JFrame("S_Lot 5");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public SLot_5(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}

//*****************************************************



//BORDER




//******************************************************

class LMSP{
	private JFrame frame=new JFrame("MStaff Park");
	private JPanel panel=new JPanel();
	private JList<String> list;
	//private String lot[]= {"Lot 1","Lot 2","Lot 3", "Lot 4","Lot 5"};
	//private JComboBox bx=new JComboBox(lot);
	private JButton btn,btn2,btn3,btn4,btn5;
	private DefaultListModel model;
	public LMSP() {
		model=new DefaultListModel();
		list=new JList<String>(model);
		//String l=bx.getSelectedItem().toString();
		btn=new JButton("M_Lot 1");
		btn2=new JButton("M_Lot 2");
		btn3=new JButton("M_Lot 3");
		btn4=new JButton("M_Lot 4");
		btn5=new JButton("M_Lot 5");
		
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MSLot_1();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MSLot_2();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MSLot_3();
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MSLot_4();
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					new MSLot_5();
			}
		});
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(280, 200);
		frame.setLocationRelativeTo(null);
		
	}
}


class MSLot_1{
	private JFrame frame=new JFrame("M_Lot 1");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MSLot_1(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class MSLot_2{
	private JFrame frame=new JFrame("M_Lot 2");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MSLot_2(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class MSLot_3{
	private JFrame frame=new JFrame("M_Lot 3");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MSLot_3(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}

class MSLot_4{
	private JFrame frame=new JFrame("M_Lot 4");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MSLot_4(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}


class MSLot_5{
	private JFrame frame=new JFrame("MS_Lot 5");
	private JPanel panel=new JPanel();
	private JList<String> list;
	private DefaultListModel model;
	public MSLot_5(){
		model=new DefaultListModel();
		list=new JList<String>(model);
		panel.add(list);
		try {
			File file=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
			if(file.exists()) {
				Scanner lc=new Scanner(file);
				while(lc.hasNext()) {
					String s=lc.nextLine();
					model.addElement(s);
				}
				lc.close();
				list.setModel(model);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(280, 230);
				frame.setLocationRelativeTo(null);
			}else {
				JOptionPane.showMessageDialog(frame,
					    "Sorry, No One Have Been Parked Here.");
			}
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
}
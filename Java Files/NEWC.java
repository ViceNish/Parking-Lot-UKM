import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class NEWC {
	private JFrame frame=new JFrame("Select");
	private JPanel panel =new JPanel();
	private JButton btn1, btn2;
	public NEWC() {
		btn1=new JButton("New");
		btn2=new JButton("Continue");
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new LoginMenu();
				frame.dispose();
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File a=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 1\\parked.txt");
				File b=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 2\\parked.txt");
				File c=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 3\\parked.txt");
				File d=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 4\\parked.txt");
				File e=new File("C:\\savefile\\Parking\\FTSM\\Carpark\\Lot 5\\parked.txt");
				
				File f=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 1\\parked.txt");
				File g=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 2\\parked.txt");
				File h=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 3\\parked.txt");
				File i=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 4\\parked.txt");
				File j=new File("C:\\savefile\\Parking\\FTSM\\Motorpark\\Lot 5\\parked.txt");
				
				File k=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 1\\parked.txt");
				File l=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 2\\parked.txt");
				File m=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 3\\parked.txt");
				File n=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 4\\parked.txt");
				File o=new File("C:\\savefile\\Parking\\FTSM\\Staffpark\\S_Lot 5\\parked.txt");
				
				File p=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 1\\parked.txt");
				File q=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 2\\parked.txt");
				File r=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 3\\parked.txt");
				File s=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 4\\parked.txt");
				File t=new File("C:\\savefile\\Parking\\FTSM\\MStaffpark\\M_Lot 5\\parked.txt");
				
				a.delete();
				b.delete();
				c.delete();
				d.delete();
				e.delete();

				f.delete();
				g.delete();
				h.delete();
				i.delete();
				j.delete();
				
				k.delete();
				l.delete();
				m.delete();
				n.delete();
				o.delete();
				
				p.delete();
				q.delete();
				r.delete();
				s.delete();
				t.delete();
				
				JOptionPane.showMessageDialog(frame,
					    "The System Have Been Reset !");
				new LoginMenu();
				frame.dispose();
			}
		});
		panel.add(btn1);
		panel.add(btn2);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(280, 90);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}

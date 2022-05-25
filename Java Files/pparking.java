import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class pparking implements data{
	String lot;
	public pparking(String lot) {
		this.lot=lot;
	}
	public void display() {
		System.out.println(lot);
	}
}

class pcarpark extends pparking{

	public pcarpark(String lot) {
		super(lot);
	}
	public void display() {
		super.display();
	}
}


class pmotorpark extends pparking{

	public pmotorpark(String lot) {
		super(lot);
	}
	public void display() {
		super.display();
	}
}

class pstaffparking extends pparking{

	public pstaffparking(String lot) {
		super(lot);
	}
	public void display() {
		super.display();
	}
}

class pmstaffparking extends pparking{

	public pmstaffparking(String lot) {
		super(lot);
	}
	public void display() {
		super.display();
	}
}
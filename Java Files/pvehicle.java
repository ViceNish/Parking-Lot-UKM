import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class pvehicle implements data {

	String plate,type;
	public pvehicle(String plate,String type) {
		this.plate=plate;
		this.type=type;
	}
	public String getPlate(){
		return plate;
	}
	public String getType() {
		return type;
	}
	public void display() {
		System.out.println(plate+" "+type);
	}
}


class pcar extends pvehicle{

	public pcar(String plate, String type) {
		super(plate, type);
	}
	public void display() {
		super.display();
	}
}



class pmotor extends pvehicle{

	public pmotor(String plate, String type) {
		super(plate, type);
	}
	public void display() {
		super.display();
	}
}


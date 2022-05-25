import java.util.*;
import javax.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class pperson implements data{

	private String name,id,pass,job;
	public pperson(String name,String id,String pass,String job) {
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.job=job;
	}
	public String getName() {
		return name;
	}
	public String getID() {
		return id;
	}
	public String getPass() {
		return pass;
	}
	public String getJob() {
		return job;
	}
	public void display() {
		System.out.println(name+" "+id+" "+pass+" "+job);
	}
}



class pstudent extends pperson {
	private String name,id,pass,job;
	public pstudent(String name, String id, String pass,String job) {
		super(name, id, pass, job);
	}
	public void display() {
		super.display();
	}
	
}


class pstaff extends pperson{

	public pstaff(String name, String id, String pass, String job) {
		super(name, id, pass, job);
	}
	public void display() {
		super.display();
	}
}



class pmstaff extends pperson{

	public pmstaff(String name, String id, String pass, String job) {
		super(name, id, pass, job);
	}
	public void display() {
		super.display();
	}
}
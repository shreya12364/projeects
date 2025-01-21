package com.edu;



import java.util.ArrayList;
import java.util.Iterator;




class Student{
	private int sid;
	private String sname;
	private float sfees;
	
	
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}

	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}


	public float getSfees() {
		return sfees;
	}
	public void setSfees(float sfees) {
		this.sfees = sfees;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}
public class Java2 {


	public static void main(String[] args) {
		Student s1 = new Student(1,"Manoj",3000);
		Student s2 = new Student(2,"Ravi",13000);
		Student s3 = new Student(3,"Sweta",4000);
		Student s4 = new Student(5,"Rani",7000);
		
		ArrayList<Student>slist=new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		System.out.println(slist);
		
		
		
		Iterator<Student> sobj = slist.iterator();
		
		System.out.println("ID\tNAME\tFees");
		while(sobj.hasNext()) {
			Student s = sobj.next();
			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());
		}
	}


}









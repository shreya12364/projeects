package com.studyopedia;

class Employee {
	private int eid;
	private String ename;
	private float salary;
	public Employee()
	{
		super();
		System.out.println("No argument Constructor");
		}
	public Employee(int eid,String ename,float salary)
	{
		super();}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String toString()
	{
		return "Employee[eid="+eid+",ename="+ename+",salary="+salary+"]";
	}
	
		
	
	
}

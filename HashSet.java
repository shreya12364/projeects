package com.edu;




	import java.util.Comparator;
	import java.util.TreeSet;


	class Employee{
		private int eid;
		private String ename;
		public Employee(int eid, String ename) {
			super();
			this.eid = eid;
			this.ename = ename;
		}
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
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + "]";
		}
		
		
	}


	class EmployeeSortId implements Comparator<Employee>{


		@Override
		public int compare(Employee e1, Employee e2) {
		    if(e1.getEid()<e2.getEid())
			  return -1;
		    else if(e1.getEid()>e2.getEid())
			  return 1;
		    else 
		    	return 0;
		}
		
	}


	public class HashSet {


		public static void main(String[] args) {
//			TreeSet<Integer> tob = new TreeSet<Integer>();
//			
//			tob.add(9);
//			tob.add(12);
//			tob.add(5);
//			System.out.println(tob.descendingSet());
			
			Employee e1 = new Employee(12,"Manoj");
			Employee e2 = new Employee(7,"Ravi");
			
			EmployeeSortId eobj=new EmployeeSortId();
			
			TreeSet<Employee> etset = new TreeSet<Employee>(eobj);
			 etset.add(e1);
			 etset.add(e2);
			 
			 System.out.println(etset);
	     }
	}


package com.oops;

public class Student1 {

	private int sid  ;
	private String sname;
	private int sage;
	private double sfess;
	private int sid1 ;
	private int sid2=145;
	
	public void setsid (int sid){
		this.sid=sid;
	}
	public int getsid() {
		return sid;
	}
	
	
	public void setsname(String sname) {
		this.sname=sname;
	}
	public String getsname() {
		return sname;
	}
	
	public int getsage() {
		return sage;
	}
	public void setsage(int sage) {
		this.sage = sage;
	}
	
	
	public double getsfess() {
		return sfess;
	}
	public void setsfess(double sfess) {
		this.sfess = sfess;
	}
	
	public void setsid1(int sid1) {
		this.sid1=sid1;
	}
	public int getsid1() {
		return sid1;
	}
	public void  setsid2(int sid2) {
		this.sid2=sid2;
	}
	public int getsid2() {
		return sid2;
	}
}
		
	
		
		
		//	public static void main(String[] args) {
//	    Student1 st = new Student1();
//		st.setsid(21);
//		st.setsid1(22);
//	    st.setsname("vinay");
//	    st.setsage(23);
//	    st.setsfess(25000.00);
//	    
//		System.out.println("id:"+st.getsid());
//		System.out.println("id:"+st.getsid1());
//		System.out.println("id:"+st.getsid2());
//		System.out.println("Sname:"+st.getsname());
//		System.out.println("StudentAge:"+st.getsage());
//		System.out.println("Student fess deatils :"+st.getsfess()); 
//	}



package com.oops;

public class Student2 {

	public static void main(String[] args) {
    Student1 st = new Student1();
	st.setsid(21);
	st.setsid1(22);
    st.setsname("vinay");
    st.setsage(23);
    st.setsfess(25000.00);
    
	System.out.println("id:"+st.getsid());
	System.out.println("id:"+st.getsid1());
	System.out.println("id:"+st.getsid2());
	System.out.println("Sname:"+st.getsname());
	System.out.println("StudentAge:"+st.getsage());
	System.out.println("Student fess deatils :"+st.getsfess()); 
		
	}

}

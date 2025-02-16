package com.oops;

public class EmployeeManagementSystem2 {

	public static void main(String[] args) {
    EmployeeManagementSystem emp = new EmployeeManagementSystem();
    emp.setEmployeeid(21);
    emp.setEmpname("vinay kumar");
    emp.setEmpage(23);
    emp.setEmpsal(60000);
    emp.setEmpphonenum(901431167);
    
    
    System.out.println(emp.getEmployeeid());
    System.out.println(emp.getEmpname());
    System.out.println(emp.getEmpage());
    System.out.println(emp.getEmpsal());
    System.out.println(emp.getEmpphonenum());
	}

}

package com.oops;

public class Bike {
	
	private int engineCC;
	
	public int  getEngineCC() {
		return engineCC;
		
	}
	public   void  getEngineCC(int  engineCC) {
		//this.engineCC=engineCC;
	}
	
	

	public static void main(String[] args) {
		Bike b = new Bike();
	start()	;
   b.start(3);
		

	}
	
	static void start() {
		System.out.println("Bike is starting");
		System.out.println("dru dru dru ");	
	}
	
	public   void start(int revs) {
		System.out.println("Bike is Starting");
		for(int i = 0 ;i <revs;i++) {
			System.out.println("Revss");
		}
	
	}
}

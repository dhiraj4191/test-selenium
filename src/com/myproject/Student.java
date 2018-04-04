package com.myproject;

class Student{  
	int id = 1;//field or data member or instance variable  
	String name = "test"; 
	static String temp = "fdsa"; 
 
	Student(){}
	
	Student(String sname, int sid){
		id = sid;
		name = sname;
	}
	
	String printMyName() {
		 String name1 = "dhiraj";
		 return name1;
	 }
	   
	void setStudentData(String sname, int sid) {
		name = sname;
		id = sid;
	}
	
	void printStudentData() {
		System.out.println(name);
		System.out.println(id);
	}
}  

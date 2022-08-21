package com.a;

public class StudentInfo {

	public void studentName () {
		System.out.println("studentName");
	}
	public void studentId () {
		System.out.println("studentId");
	}
	public void studentAddress () {
		System.out.println("studentAddress");
	}
	
	public static void main (String[] args) {
		StudentInfo S = new StudentInfo();
		S.studentName();
		S.studentId();
		S.studentAddress();
		
		
	}
	}


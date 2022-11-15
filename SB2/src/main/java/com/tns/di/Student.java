package com.tns.di;
public class Student {

private String studentName;
public Student(int id, String studentname) {
this.id = id;
this.studentName = studentname;
}
private int id;
public void setId(int id) {
	this.id = id;
	System.out.println("setter method called");
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
	System.out.println("setter method called");
}
public void displayStudentInfo() {
System.out.println("student Name is "+studentName +" "+"the student id is:"+ id);
}
}
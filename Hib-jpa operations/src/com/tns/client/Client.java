package com.tns.client;
import com.tns.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		
		student.setStudentId(100);
		student.setName("chandana");
		service.addStudent(student);
		
		student=service.findStudentById(100);
		System.out.println("ID:"+student.getStudentId());
		System.out.println("Name:"+student.getName());
		
		
		student=service.findStudentById(100);
		student.setName("chandana Jayaram");
		service.updateStudent(student);
		
		student=service.findStudentById(100);
		System.out.println("ID:"+student.getStudentId());
		System.out.println("Name:"+student.getName());
		
		student=service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("end of the program");

	}

}

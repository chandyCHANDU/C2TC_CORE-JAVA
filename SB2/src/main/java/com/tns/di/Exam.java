package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Exam {

	public static void main(String[] args) {
		Student st=new Student(1,"Chandana");
		st.displayStudentInfo();

	}

}

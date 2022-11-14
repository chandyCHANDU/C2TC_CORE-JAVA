package com.tns.springprog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mobile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");//getbeanmethod
System.out.println("config loaded");
sim s1=c.getBean("s1",airtel.class);
sim s2=c.getBean("s2",jio.class);
s1.calling();
s2.calling();
s1.data();
s2.data();

	}

}


	

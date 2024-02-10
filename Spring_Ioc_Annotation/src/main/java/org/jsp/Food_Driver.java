package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Food_Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");
//		Food food = context.getBean(Food.class,"food");
//		food.Details();
		
		Bike bike = (Bike) context.getBean("bike");
		bike.detials();
		
		Car car = (Car) context.getBean("car");
		car.carDetials();
		
		Student student = (Student) context.getBean("student");
		student.studentDetails();
		System.out.println(student.getBike());
		System.out.println(student.getCar());
		
	} 

} 

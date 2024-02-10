package org.jsp.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animal_sound_Driver {
	
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");
//		Animal_sound animal_sound = context.getBean(Animal_sound.class,"animalSound");
//		animal_sound.sound();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");
		Animal_sound animal_sound = context.getBean(Animal_sound.class, "animal_Sound");
		animal_sound.sound();
		context.close();
		
	}
 
}

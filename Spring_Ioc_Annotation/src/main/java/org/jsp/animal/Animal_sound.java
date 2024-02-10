package org.jsp.animal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Animal_sound {
	
    private Animal animal;

    //Using constructor
    @Autowired
	public Animal_sound(@Qualifier(value = "cow")  Animal animal) {
		this.animal = animal;
	}

    
	public void sound()
	{
		animal.doSound();
	}
	
	
	//Using_getter & setter
	public Animal getAnimal()
	{
		return animal;
	}
	
//	@Autowired  
//	@Qualifier(value = "cow")
//	public void setAnimal(Animal animal) {
//		this.animal = animal;
//	}

	
	
	static {
		System.out.println("Object is loaded into memory");
	}
	
	@PostConstruct
	void info()
	{
		System.out.println("I am called post construct to initialize the member.");
	}
	
	@PreDestroy
	void removeLoad()
	{
		System.out.println("I am called before to delete and close all the costly resources.");
	}

	
}
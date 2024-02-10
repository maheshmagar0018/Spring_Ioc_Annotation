package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	
	@Value(value = "1")
	int id;
	@Value(value = "Royal enfield")
	String name;
	@Value(value = "350")
	int cc;
	@Value(value = "Stealth Black")
	String color;
	@Value(value = "212000")
	double price;
	
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", cc=" + cc + ", color=" + color + ", price=" + price + "]";
	}


	public void detials()
	{
		System.out.println("Bike id : "+id);
		System.out.println("Bike name : "+name);
		System.out.println("Bike CC : "+cc);
		System.out.println("Bike Color :"+color);
		System.out.println("Bike price : "+price);
		
	}
	
	

}

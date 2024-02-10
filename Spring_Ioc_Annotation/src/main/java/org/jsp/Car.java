package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Value(value = "Ford")
	String name;
	@Value(value = "Blue")
	String color;
	@Value(value = "1600000")
	double price;
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	
	public void carDetials()
	{
		System.out.println("Car name : "+name);
		System.out.println("Car color : "+color);
		System.out.println("Car price : "+price);
		
	}
	

}

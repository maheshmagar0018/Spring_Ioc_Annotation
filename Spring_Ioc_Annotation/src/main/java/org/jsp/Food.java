package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {
	
	@Value(value = "Vada pav")
	String name;
	@Value(value = "15")
	double price;
	@Value(value = "Spicyy")
	String taste;
	
	public void Details()
	{
		System.out.println("Food name is : "+name);
		System.out.println("Food price is : "+price);
		System.out.println("Food taste is : "+taste);
	} 

}

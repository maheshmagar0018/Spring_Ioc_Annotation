package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	int id;
	String name;
	String email;
	String address;
	int age;
	
//	@Autowired
    private Bike bike;
	
//	@Autowired
	private Car car;
	
	public Bike getBike() {
		return bike;
	}

	@Autowired
	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Car getCar() {
		return car;
	}

	@Autowired
	public void setCar(Car car) {
		this.car = car;
	}

	public Student( @Value(value = "101") int id, @Value(value = "Mahesh") String name, @Value(value = "maheshmagar0018@gmail.com") String email, @Value(value = "Thane") String address, @Value(value = "22") int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}
	
	public void studentDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
		System.out.println(age);
	}
	
	

}

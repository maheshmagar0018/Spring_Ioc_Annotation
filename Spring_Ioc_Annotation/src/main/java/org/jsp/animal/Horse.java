package org.jsp.animal;

import org.springframework.stereotype.Component;

@Component
public class Horse implements Animal
{
	public void doSound()
	{
		System.out.println("Horse's sound : hushhh.......");
	}

}

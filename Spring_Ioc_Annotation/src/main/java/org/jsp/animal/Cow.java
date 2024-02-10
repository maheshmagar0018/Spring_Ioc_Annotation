package org.jsp.animal;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal
{
	public void doSound()
	{
		System.out.println("Cow's sound : Hammhaa......");
	}

}

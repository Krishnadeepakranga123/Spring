package org.krish.PrimaryQualifierApp.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Vanilla implements IceCream {
	
	public void eat() {
		System.out.println("Baby is eating vanilla Ice cream");
	}
	

}

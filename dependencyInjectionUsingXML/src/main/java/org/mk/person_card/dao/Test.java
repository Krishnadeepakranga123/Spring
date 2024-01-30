package org.mk.person_card.dao;

import org.mk.person_card.dto.person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("person-card.xml");
		person p1=context.getBean("myPerson",person.class);
		p1.getCard().display();
		person p2=context.getBean("Person",person.class);
		p2.getCard().display();
	}

}

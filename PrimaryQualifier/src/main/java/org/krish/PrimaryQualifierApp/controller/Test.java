package org.krish.PrimaryQualifierApp.controller;

import org.krish.PrimaryQualifierApp.dao.Baby;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("org.krish.PrimaryQualifierApp");
		Baby b=context.getBean(Baby.class);
		b.getIceCream().eat();
	}

}

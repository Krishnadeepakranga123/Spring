package org.mk.CollectionInjection.dao;

import org.mk.CollectionInjection.dto.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("dept.xml");
		Department d=context.getBean(Department.class);
		System.out.println(d.getNames());
		System.out.println(d.getPhones());
		System.out.println(d.getDetails());
		
	}

}

package org.mk.SpringBeanLifeCycleDemo.dao;

import org.mk.SpringBeanLifeCycleDemo.dto.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLCbyApplicationContext {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("LifeCycle.xml");
	System.out.println(context.getBean(Demo.class));
	System.out.println(context.getBean(Demo.class));
	((ClassPathXmlApplicationContext)context).close();
}
}

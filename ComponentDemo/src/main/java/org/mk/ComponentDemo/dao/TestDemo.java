package org.mk.ComponentDemo.dao;

import org.mk.ComponentDemo.dto.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("org.mk.ComponentDemo");
		Demo d=context.getBean("myDemo",Demo.class);
		d.test();
	}

}

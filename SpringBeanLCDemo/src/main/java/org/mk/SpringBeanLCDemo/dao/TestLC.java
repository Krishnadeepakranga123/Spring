package org.mk.SpringBeanLCDemo.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLC {
	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("lc.xml");
			((ClassPathXmlApplicationContext)context).close();
		
	}

}

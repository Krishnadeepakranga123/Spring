package org.mk.SpringBeanLifeCycleDemo.dao;

import org.mk.SpringBeanLifeCycleDemo.dto.Demo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestLCbyBeanFactory {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("LifeCycle.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Demo d=factory.getBean(Demo.class);
		System.out.println(d);
		System.out.println(factory.getBean(Demo.class));
	}

}

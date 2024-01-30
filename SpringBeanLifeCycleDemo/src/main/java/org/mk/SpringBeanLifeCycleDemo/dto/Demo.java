package org.mk.SpringBeanLifeCycleDemo.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean, DisposableBean {
	static {
		System.out.println("Demo class is loaded into JVM memory");
	}

	public void display() {
		System.out.println("It is dispaly() Demo");

	}

	public void destroy() throws Exception {
		System.out.println("Demo object is Destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Demo object is Initialized");
	}

}

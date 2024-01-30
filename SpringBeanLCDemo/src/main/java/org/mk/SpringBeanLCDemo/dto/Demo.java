package org.mk.SpringBeanLCDemo.dto;

public class Demo  {
	static {
		System.out.println("Demo class is loaded into jvm memory");
	}
	public Demo() {
		System.out.println("Demo() is called");
	}
	public void hii() {
		System.out.println("Demo class is initiallized");
	}
	public void byee() {
		System.out.println("Demo class is Destroyed");
	}

}

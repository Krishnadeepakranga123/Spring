package org.mk.SpringBeanLCDemo.dto;

public class Test {
static {
	System.out.println("Test class is loaded into jvm memory");
}
public Test() {
	System.out.println("Test() is called");
}

public void hii() {
	System.out.println("Test class is initiallized");
}
public void byee() {
	System.out.println("Test class is Destroyed");
}

}

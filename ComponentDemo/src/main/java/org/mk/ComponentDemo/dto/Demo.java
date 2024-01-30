package org.mk.ComponentDemo.dto;

import org.springframework.stereotype.Component;

@Component(value = "myDemo")
public class Demo {
	public void test() {
		System.out.println("demo class  is tested");
	}

}

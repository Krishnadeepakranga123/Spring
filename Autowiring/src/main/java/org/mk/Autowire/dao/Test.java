package org.mk.Autowire.dao;

import org.mk.Autowire.dto.Ride;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ride-vehicle.xml");
		Ride r=context.getBean(Ride.class);
		r.getVehicle().start();
	}

}

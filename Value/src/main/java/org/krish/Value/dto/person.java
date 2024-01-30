package org.krish.Value.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class person {
	@Value(value = "krishna")
	private String name;
	private int age;
	private long phone;
	
	public person(@Value(value = "98765456") long phone) {
		this.phone=phone;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	@Value(value = "25")
	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}

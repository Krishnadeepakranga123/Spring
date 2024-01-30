package org.mk.person_card.dto;

public class Aadharcard {
	private String name;
	private long number;

	public void display() {
		System.out.println("name: " + name);
		System.out.println("number: " + number);
		System.out.println("--------------------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}


}

package org.krish.AutowiredApp.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car {
	@Autowired
	private Engine e;

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

}

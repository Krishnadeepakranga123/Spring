package org.krish.PrimaryQualifierApp.dao;

import org.krish.PrimaryQualifierApp.dto.IceCream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	@Autowired
//	@Qualifier("chocolate")
	private IceCream iceCream;

	public IceCream getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}

}

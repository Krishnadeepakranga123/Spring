package org.mk.person_card.dto;

public class person {
	private Aadharcard card;

	public person() {

	}

	public person(Aadharcard card) {
		this.card = card;
	}

	public Aadharcard getCard() {
		return card;
	}

	public void setCard(Aadharcard card) {
		this.card = card;
	}

}

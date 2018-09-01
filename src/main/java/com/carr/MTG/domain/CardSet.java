package com.carr.MTG.domain;

public enum CardSet {

	M19("Core 19"), AKH("Amonkhet"), BFZ("Battle For Zendicar");

	private String longName;

	private CardSet(String longName) {
		this.longName = longName;
	}

	public String getLongName() {
		return longName;
	}
}

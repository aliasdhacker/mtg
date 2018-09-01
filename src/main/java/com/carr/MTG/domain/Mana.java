package com.carr.MTG.domain;

public enum Mana {

	BLACK("Swamp"), WHITE("Plains"), GREEN("Forest"), BLUE("Island"), RED("Mountain"), COLORLESS("Colorless");

	private String friendlyName;

	private Mana(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public String getFriendlyName() {
		return friendlyName;
	}
}

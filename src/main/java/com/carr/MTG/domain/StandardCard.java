package com.carr.MTG.domain;

import java.util.Arrays;

public class StandardCard {

	private long id;

	private String name;

	private String text;

	private String additionalText;

	private CardType[] cardType;

	private Mana[] manaCost;

	private CardSet cardSet;

	private Rarity rarity;

	private Card[] associatedCards;

	private int toughness;

	private int power;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAdditionalText() {
		return additionalText;
	}

	public void setAdditionalText(String additionalText) {
		this.additionalText = additionalText;
	}

	public CardType[] getCardType() {
		return cardType;
	}

	public void setCardType(CardType[] cardType) {
		this.cardType = cardType;
	}

	public Mana[] getManaCost() {
		return manaCost;
	}

	public void setManaCost(Mana[] manaCost) {
		this.manaCost = manaCost;
	}

	public CardSet getCardSet() {
		return cardSet;
	}

	public void setCardSet(CardSet cardSet) {
		this.cardSet = cardSet;
	}

	public Card[] getAssociatedCards() {
		return associatedCards;
	}

	public void setAssociatedCards(Card[] associatedCards) {
		this.associatedCards = associatedCards;
	}

	public int getToughness() {
		return toughness;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Rarity getRarity() {
		return rarity;
	}

	public void setRarity(Rarity rarity) {
		this.rarity = rarity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "StandardCard [id=" + id + ", name=" + name + ", text=" + text + ", additionalText=" + additionalText
				+ ", cardType=" + Arrays.toString(cardType) + ", manaCost=" + Arrays.toString(manaCost) + ", cardSet="
				+ cardSet + ", rarity=" + rarity + ", associatedCards=" + Arrays.toString(associatedCards)
				+ ", toughness=" + toughness + ", power=" + power + "]";
	}

}

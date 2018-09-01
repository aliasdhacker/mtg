package com.carr.MTG.domain;

public interface Card {

	public String getName();
	
	public String getText();
	
	public String getAdditionalText();
	
	public CardType[] getCardType();
	
	public Mana[] getManaCost();
	
	public CardSet getCardSet();
	
	public Rarity getRarity();
	
	public Card[] getAssociatedCards();
	
	public int getToughness();
	
	public int getPower();
	
}

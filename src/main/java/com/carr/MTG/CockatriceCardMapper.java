package com.carr.MTG;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.carr.MTG.domain.CardSet;
import com.carr.MTG.domain.CardType;
import com.carr.MTG.domain.Mana;
import com.carr.MTG.domain.Rarity;
import com.carr.MTG.domain.StandardCard;

public class CockatriceCardMapper implements RowMapper<StandardCard> {

	@Override
	public StandardCard mapRow(ResultSet rs, int arg1) throws SQLException {
		StandardCard card = new StandardCard();

		long id = rs.getLong(0);
		String additionalText = rs.getString("additional_text");
		CardSet cardSet = CardSet.valueOf(rs.getString("card_set"));
		Rarity rarity = Rarity.valueOf(rs.getString("rarity"));

		card.setId(id);
		card.setAdditionalText(additionalText);
		card.setCardSet(cardSet);
		card.setCardType(getCardTypes(rs.getString("card_type")));
		card.setManaCost(getManaCost(rs.getString("mana_cost")));
		card.setName(rs.getString("name"));
		card.setPower(rs.getInt("power"));
		card.setRarity(rarity);
		card.setText(rs.getString("text"));
		card.setToughness(rs.getInt("toughness"));

		return card;
	}

	private Mana[] getManaCost(String manaCostList) {
		String[] manaCostSplit = manaCostList.split(",");
		Mana[] manaTypes = new Mana[manaCostSplit.length];

		for (int i = 0; i < manaTypes.length; i++) {
			Mana mana = Mana.valueOf(manaCostSplit[i]);
			manaTypes[i] = mana;
		}

		return manaTypes;
	}

	private CardType[] getCardTypes(String cardTypeList) {
		String[] cardTypeSplit = cardTypeList.split(",");
		CardType[] cardTypes = new CardType[cardTypeSplit.length];

		for (int i = 0; i < cardTypes.length; i++) {
			CardType cardType = CardType.valueOf(cardTypeSplit[i]);
			cardTypes[i] = cardType;
		}

		return cardTypes;
	}

}

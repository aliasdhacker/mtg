package com.carr.MTG.domain;

public class CockatriceCard {

	private long id;
	
	private String color;
	
	private String manaCost;
	
	private String cmc;
	
	private String type;
	
	private String tableRow;
	
	private String text;
	
	private String pt;
	
	private String cipt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManaCost() {
		return manaCost;
	}

	public void setManaCost(String manaCost) {
		this.manaCost = manaCost;
	}

	public String getCmc() {
		return cmc;
	}

	public void setCmc(String cmc) {
		this.cmc = cmc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTableRow() {
		return tableRow;
	}

	public void setTableRow(String tableRow) {
		this.tableRow = tableRow;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPt() {
		return pt;
	}

	public void setPt(String pt) {
		this.pt = pt;
	}

	public String getCipt() {
		return cipt;
	}

	public void setCipt(String cipt) {
		this.cipt = cipt;
	}
}

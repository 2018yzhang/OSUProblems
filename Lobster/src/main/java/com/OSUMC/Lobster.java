package com.OSUMC;

public class Lobster {
	String name = "";
	String category = "";
	int id = 0;
	public Lobster() {
		
	}
	public Lobster(String name, String category, int id) {
		this.name = name;
		this.category = category;
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public String getCategory() {
		return this.category;
	}
	public int getID() {
		return this.id;
	}

}

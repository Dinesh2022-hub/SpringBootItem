package com.ty.springBoot_Item.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Item {
	
	@Id
	private int id;
	private String name;
	private long cost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	

}

package com.example.bootspring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private String description;

	private Integer price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTicketName() {
		return name;
	}

	public void setTicketName(String name) {
		this.name = name;
	}

	public String getTicketDescription() {
		return description;
	}

	public void setTicketDescription(String desc) {
		this.description = desc;
	}

	public Integer getPrice(){
		return price;
	}

	public void setprice(Integer price){
		this.price=price;
	}
}

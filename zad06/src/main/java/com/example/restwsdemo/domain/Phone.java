package com.example.restwsdemo.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Phone {
	
	private String producer;
	private double price;
	
	public Phone() {
		super();
	}
	
	public Phone(String producer, double price) {
		super();
		this.producer = producer;
		this.setPrice(price);
	}
	
	public String getProducer() {
		return producer;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

package com.example.servletdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletdemo.domain.Phone;

public class StorageService {
	
	private List<Phone> db = new ArrayList<Phone>();
	private List<Phone> shoppingCart = new ArrayList<Phone>();
	
	public void addToDatabase(Phone phone) {
		Phone newPhone = new Phone(phone.getId(), phone.getProducer(), phone.getProductionDate(), phone.getPrice(), phone.isReserved());
		db.add(newPhone);
	}
	
	public void addToShoppingCart(Phone phone) {
		Phone newPhone = new Phone(phone.getId(), phone.getProducer(), phone.getProductionDate(), phone.getPrice(), phone.isReserved());
		shoppingCart.add(newPhone);
	}
	
	public List<Phone> getAllPhones() {
		return db;
	}
	
	public List<Phone> getShoppingCart() {
		return shoppingCart;
	}

}


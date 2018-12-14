package com.example.restwsdemo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.Singleton;

import com.example.restwsdemo.domain.Phone;

@Singleton
public class PhoneManager {
	
	private List<Phone> db = Collections.synchronizedList(new ArrayList<>());

	public void addPhone(Phone phone) {
		db.add(phone);
	}

	public void deletePhone(Phone phone){
		db.remove(phone);
 	}
	
	public Phone getPhone(Integer id) {
		return db.get(id);
	}
	
	public void updatePhone(Integer id, String producer, double price) {
		Phone b = db.get(id);
		b.setPrice(price);
		b.setProducer(producer);
	}
	
	public List<Phone> getAllPhones(){
		return db;
	}
	
	public void deleteAllPhones(){
		db.clear();
	}

}

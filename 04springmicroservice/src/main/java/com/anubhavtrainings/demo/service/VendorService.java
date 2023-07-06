package com.anubhavtrainings.demo.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anubhavtrainings.demo.entities.Vendor;

@Component
public class VendorService {
	
	//this is like a internal table which contains multiple records
	HashMap<String, Vendor> vendors = new HashMap<String, Vendor>();
	
	@Autowired
	Vendor ven1;
	@Autowired
	Vendor ven2;
	@Autowired
	Vendor ven3;
	
	private void fillVendors() {
		//append wa to itab
		vendors.put("1", ven1);
		vendors.put("2", ven2);
		vendors.put("3", ven3);
	}
	
	public void VendorService() {
		fillVendors();
	}
	
	public HashMap<String, Vendor> getAllVendors(){
		fillVendors();
		return vendors;
	}
	public Vendor getVendorByKey(String vendorId) {
		//Read table itab into wa with key ve=id
		fillVendors();
		return (Vendor)vendors.get(vendorId);
	}
	public Vendor createVendor(Vendor vendor) {
		fillVendors();
		vendors.put("4", vendor);
		return vendor;
	}
	public Vendor updateVendor(Vendor vendor) {
		fillVendors();
		return vendor;
	}
	public void deleteVendor(String vendorId) {
		fillVendors();
		vendors.remove(vendorId);
	}
	
}

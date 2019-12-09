package com.gstcalculator.gstcalculator;

import java.util.ArrayList;
import java.util.List;

public class ProductTypeWS {

			
	private Integer id;
	private String type;
	
	private List<Products> products = new ArrayList<>();
	
	private Gst gst;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Gst getGst() {
		return gst;
	}

	public void setGst(Gst gst) {
		this.gst = gst;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
}

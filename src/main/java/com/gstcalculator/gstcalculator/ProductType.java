package com.gstcalculator.gstcalculator;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity						//create table and denoted as model class
public class ProductType {
	@Id						//primary key
	@GeneratedValue			//Auto generate
	private Integer id;
	private String type;
	@OneToMany(cascade = CascadeType.ALL)		//one Product Type has many products 
	private List<Products> products = new ArrayList<>();
	@OneToOne(cascade = CascadeType.ALL)		//one product has one GST
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

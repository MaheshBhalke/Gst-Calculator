
package com.gstcalculator.gstcalculator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity				//create table and denoted as model class
public class Products {
	@Id				//primary key
	@GeneratedValue	//Auto generate
	private int id;
	String name;
	@Transient     //column will not create
	private double price;
	
	
	public Products() {
		
	}
	public Products(String name) {
		this.name = name;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

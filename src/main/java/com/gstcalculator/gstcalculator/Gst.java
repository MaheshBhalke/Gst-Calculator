package com.gstcalculator.gstcalculator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity						//create table and denoted as model class
public class Gst {
	@Id						//primary key
	@GeneratedValue			//Auto generate
	private int id;
	private double cgstRate;
	private double sgstRate;
	
	public Gst() {
		
	}
	public Gst(double cgstRate, double sgstRate) {
		super();
		this.cgstRate = cgstRate;
		this.sgstRate = sgstRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCgstRate() {
		return cgstRate;
	}
	public void setCgstRate(double cgstRate) {
		this.cgstRate = cgstRate;
	}
	public double getSgstRate() {
		return sgstRate;
	}
	public void setSgstRate(double sgstRate) {
		this.sgstRate = sgstRate;
	}
	
	

	

}

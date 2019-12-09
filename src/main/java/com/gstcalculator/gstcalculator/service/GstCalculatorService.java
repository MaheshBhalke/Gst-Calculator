package com.gstcalculator.gstcalculator.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gstcalculator.gstcalculator.ProductType;
import com.gstcalculator.gstcalculator.ProductTypeWS;
import com.gstcalculator.gstcalculator.Products;
import com.gstcalculator.gstcalculator.config.GstConfiguration;
import com.gstcalculator.gstcalculator.repositoy.ProductTypeRepositoy;

@Service
public class GstCalculatorService {

	@Autowired
	private ProductTypeRepositoy repositoy;
	@Autowired
	private GstConfiguration configuration;
	

	public void addData(ProductType productType) {
		
		repositoy.save(productType);
	}
	/*
	 * public List<ProductType> addDataRest(){
	 * 
	 * }
	 */

	public List<ProductType> getCategories() {
		return repositoy.findAll();
	}

	public List<Products> findByType(Integer id) {
		List<Products> products = null;
		Optional<ProductType> findById = repositoy.findById(id); // (optional) A container object which may or may not
																	// contain a non-null value.
		if (findById.isPresent()) { // If a value is present, isPresent() will return true and get() will return the
									// value.
			products = findById.get().getProducts();

		}
		return Objects.requireNonNull(products, "No Data Found In DB For the Product Type :" + id);
	}

	public Map<Double, Double> calculateGst(int id, double price) {
		Optional<ProductType> findById = repositoy.findById(id);
		Map<Double, Double> gstMap = null;

		String type = null;
		if (findById.isPresent()) {
			ProductType productType = findById.get();
			type = productType.getType();
			double sgstRate = productType.getGst().getSgstRate();
			double cgstRate = productType.getGst().getCgstRate();
			double cgst = cgstRate * price / 100;
			double sgst = sgstRate * price / 100;

			// System.out.println("cgst"+ cgst + "sgst" + sgst);

			gstMap = new HashMap<>();
			gstMap.put(cgst, sgst);
		}

		return gstMap;

		/*
		 * return Objects.requireNonNull(gstMap, "Not Found GST Rate for Type :" +
		 * type);
		 */
	}

	public List<Products> addProducts(String name, double price) {

		return null;
	}
}

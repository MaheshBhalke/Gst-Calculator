
package com.gstcalculator.gstcalculator.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gstcalculator.gstcalculator.ProductType;
import com.gstcalculator.gstcalculator.Products;
import com.gstcalculator.gstcalculator.repositoy.ProductTypeRepositoy;
import com.gstcalculator.gstcalculator.service.GstCalculatorService;

@RestController
@RequestMapping("/api")
public class GstRestController {

	@Autowired
	GstCalculatorService service;
	
	@Autowired
	private ProductTypeRepositoy repositoy;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";

	}
	
	@PostMapping("/addtype")
	public ProductType addProductType(ProductType productType) {
		repositoy.save(productType);
		return productType;
		
	}
	
	  @GetMapping("/typeadded")
	  public List<ProductType> addProductType(){ return
	  repositoy.findAll();
	  
	  }

	@GetMapping("/types")
	public List<ProductType> getProducttypes() {
		return service.getCategories();

	}

	@GetMapping("/products/{id}")
	public List<Products> products(@PathVariable int id) {
		return service.findByType(id);

	}

	@PostMapping("/products")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addProducts() {
//		service.addData();
	}

	@GetMapping("/gst/{typeId}/{price}")
	public Map<Double, Double> calculateGst(@PathVariable int typeId, @PathVariable double price) {
		return service.calculateGst(typeId, price);
	}

}

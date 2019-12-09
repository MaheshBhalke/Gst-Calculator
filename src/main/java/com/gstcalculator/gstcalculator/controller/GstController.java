
package com.gstcalculator.gstcalculator.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.gstcalculator.gstcalculator.ProductType;
import com.gstcalculator.gstcalculator.ProductTypeWS;
import com.gstcalculator.gstcalculator.Products;
import com.gstcalculator.gstcalculator.service.GstCalculatorService;

@Controller
public class GstController {

	@Autowired
	GstCalculatorService service;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/types")
	public String getProducttypes(Model model) {
		
		List<ProductType> categories = service.getCategories();
		model.addAttribute("categories", categories);
		return "calculator";

	}

	@GetMapping("/products/{id}")
	public String products(@PathVariable int id, Model model) {
		List<Products> products = service.findByType(1);
		model.addAttribute("products", products);
		return "products";

	}

	@GetMapping("/gst/{typeId}/{price}")
	public Map<Double, Double> calculateGst(@PathVariable int typeId, @PathVariable double price) {
		return service.calculateGst(typeId, price);
	}

	@GetMapping("/admin")
	public String hello(Model model) {
		model.addAttribute("productType", new ProductType());
		return "admin";

	}

	/*
	 * @GetMapping("/productsType") public String addProductsType(Model model) {
	 * model.addAttribute("productType", new ProductType()); return "admin"; }
	 */

	@PostMapping("/productsType")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String addProductsType(@ModelAttribute ProductType productType) {
		System.out.println("Product Type = " + productType.getType());
		System.out.println("Product GST="+productType.getGst().getCgstRate());
		System.out.println("Product GST="+productType.getGst().getSgstRate());
		service.addData(productType);
		return "products";
	}

	/*
	 * @GetMapping("/test")
	 * 
	 * @ResponseStatus(code = HttpStatus.CREATED) public String test(Model model) {
	 * model.addAttribute("productTypeWS", new ProductTypeWS()); return "test"; }
	 * 
	 * @PostMapping("/test")
	 * 
	 * @ResponseStatus(code = HttpStatus.CREATED) public String
	 * addTest(@ModelAttribute ProductTypeWS productTypeWS) {
	 * System.out.println("Product Type = " + productTypeWS.getType());
	 * System.out.println("Product GST="+productTypeWS.getGst().getCgstRate());
	 * System.out.println("Product GST="+productTypeWS.getGst().getSgstRate());
	 * return "products"; }
	 */
	/*
	 * @PostMapping("/greeting") public String greetingSubmit(@ModelAttribute
	 * Greeting greeting) { return "result"; }
	 */

}

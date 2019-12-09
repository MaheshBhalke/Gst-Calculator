package com.gstcalculator.gstcalculator.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gstcalculator.gstcalculator.ProductType;

@Repository /* is used to indicate that the class provides the mechanism for storage,
			   retrieval, search, update and delete operation on objects.*/

		//DAO class
public interface ProductTypeRepositoy extends JpaRepository<ProductType, Integer> {

	
}

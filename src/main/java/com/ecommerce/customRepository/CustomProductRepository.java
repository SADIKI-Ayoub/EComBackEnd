package com.ecommerce.customRepository;

import java.util.List;

public interface CustomProductRepository {
	
	List<Object> findCustomProductByOrderId (String orderId);

}

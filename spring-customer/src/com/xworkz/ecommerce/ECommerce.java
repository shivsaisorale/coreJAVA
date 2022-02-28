package com.xworkz.ecommerce;

import org.springframework.stereotype.Component;

@Component
public interface ECommerce {
	void orderitem(String item);

	void cancelItem(String item);
}

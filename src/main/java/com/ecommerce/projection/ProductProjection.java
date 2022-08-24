package com.ecommerce.projection;

import org.springframework.data.rest.core.config.Projection;

import com.ecommerce.entities.Category;
import com.ecommerce.entities.Product;

@Projection(name="p1",types= {Product.class})
public interface ProductProjection {
	public String getId();
	public String getTitle();
	public Category getCategory();
	public String getDescription();
	public float getPrice();
	public int getQuantity();
	public String getImage();
	public String getImages();
	public String getShortDesc();
}

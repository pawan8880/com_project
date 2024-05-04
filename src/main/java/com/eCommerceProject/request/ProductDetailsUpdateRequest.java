package com.eCommerceProject.request;

import lombok.Data;

@Data
public class ProductDetailsUpdateRequest {

    private int productId;

    private String productDetails;

	public int getProductId() {
		// TODO Auto-generated method stub
		return getProductId();
	}

	public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
}

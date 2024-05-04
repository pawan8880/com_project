package com.eCommerceProject.request;

import lombok.Data;

@Data
public class CampaignCreateRequest {

    int productId;

    int discountAmount;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	

}

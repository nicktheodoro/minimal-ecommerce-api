package org.serratec.ecommerce.enums;

public enum ESaleOrderStatus {

	CANCELLED(0, "Canceled sales order!"), 
	COMPLETED(1, "Completed sales order."), 
	PROCESSING(2, "Processing the sales order...");
	
	private final Integer status;
	private final String description;
	
	ESaleOrderStatus(int status, String description) {
		this.status = status;
		this.description = description;
	}

	public Integer getStatus() {
		return status;
	}

	public String getDescription() {
		return description;
	}
}

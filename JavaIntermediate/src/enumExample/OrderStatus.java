package enumExample;

public enum OrderStatus {
	PENDING("Your order is pending"),
	COMPLETED("Your order is complete"),
	REJECTED("Your order has been rejected"),
	DELIVERED("Your order has been devlivered");
	
	String description;
	
	private OrderStatus(String status) {
		description = status;
	}
	
	public String getStatus() {
		return description;
	}

}

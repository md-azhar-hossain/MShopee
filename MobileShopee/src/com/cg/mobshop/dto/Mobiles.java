package com.cg.mobshop.dto;

public class Mobiles {

	private String mobileId;
	private String name;
	private String price;
	private String quantity;
	public Mobiles(int mobileId, String name, int quantity, double price) {
		super();
		this.mobileId = String.valueOf(mobileId);
		this.name = name;
		this.price = String.valueOf(price);
		this.quantity = String.valueOf(quantity);
	}
	public String getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId =String.valueOf( mobileId);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = String.valueOf(price);
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity =String.valueOf(quantity);
	}
	@Override
	public String toString() {
		return "Mobiles [mobileId=" + mobileId + ", name=" + name + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	
	
	
}

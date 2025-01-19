package oops.system_design.payment_gateway;

public class Cart {
	PurchaseTypeEnum cartType;
	Double cartValue;
	public PurchaseTypeEnum getCartType() {
		return cartType;
	}
	public void setCartType(PurchaseTypeEnum cartType) {
		this.cartType = cartType;
	}
	public Double getCartValue() {
		return cartValue;
	}
	public void setCartValue(Double cartValue) {
		this.cartValue = cartValue;
	}
	
	
}

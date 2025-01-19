package oops.practice.supermarket;

public class Item {
	private String name;
	private double pricePerUnit;
//	private double discount;
	private DiscountStrategy discountStrategy;
	
	public Item(String name, double pricePerUnit, DiscountStrategy discountStrategy) {
		this.name = name;
		this.pricePerUnit = pricePerUnit;
//		this.discount = discount;
		this.discountStrategy = discountStrategy;
	}

	public String getName() {
		return name;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

//	public double getDiscount() {
//		return discount;
//	}
	
	public DiscountStrategy getDiscountStrategy() {
		return discountStrategy;
	}
	
	public double calculatePrice(double quantity) {
//		return pricePerUnit * quantity *(1- discount/100);
		return discountStrategy.calculateDiscountedPrice(pricePerUnit, quantity);
	}
	
}

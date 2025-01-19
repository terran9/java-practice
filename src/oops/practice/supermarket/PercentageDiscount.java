package oops.practice.supermarket;

public class PercentageDiscount implements DiscountStrategy{
	
	private double discountPercentage;
	
	public PercentageDiscount(double percentage) {
		this.discountPercentage= percentage;
	}
	
	
	public double getDiscountPercentage() {
		return discountPercentage;
	}


	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}


	@Override
	public double calculateDiscountedPrice(double pricePerUnit, double quantity) {
		
		return pricePerUnit* quantity*(1-discountPercentage/100);
	}

}

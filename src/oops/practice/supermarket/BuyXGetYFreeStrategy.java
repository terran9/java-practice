package oops.practice.supermarket;

public class BuyXGetYFreeStrategy implements DiscountStrategy{
	
	private int x;
	private int y;
	
	
	public BuyXGetYFreeStrategy(int x, int y) {
		this.x= x;
		this.y = y;
	}
	
	
	@Override
	public double calculateDiscountedPrice(double pricePerUnit, double quantity) {
		 int freeItems = (int) (quantity / (x + y)) * y;

		return pricePerUnit* (quantity-freeItems);
	}

}

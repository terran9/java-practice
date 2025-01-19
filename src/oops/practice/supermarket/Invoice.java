package oops.practice.supermarket;

import java.util.HashMap;
import java.util.Map;

public class Invoice {
	private String customerName;
	private Map<Item, Double> purchasedItems; // contains item and quantity
	private double totalCost;
	private double totalSaved;
	
	public Invoice(String name) {
		this.customerName = name;
		this.purchasedItems = new HashMap<>();
		this.totalCost =0;
		this.totalSaved = 0;
	}
	
	public void addItem(Item item, double quantity, double maxDiscount) {
		
		double price = item.getPricePerUnit() * quantity;
//		double discountedPrice = price * (1-quantity/100);
		double discountedPrice = item.calculatePrice(quantity);
		double savings = price -discountedPrice;
		totalCost = totalCost + discountedPrice;
		totalSaved = totalSaved + savings;
		purchasedItems.put(item, purchasedItems.getOrDefault(item, 0.0) + quantity);
		
	}
	
	public void printInvoice() {
		System.out.println("Customer name : "+ customerName);
		for(Map.Entry<Item, Double> entry : this.purchasedItems.entrySet()) {
			Item item = entry.getKey();
					
			double quantity = entry.getValue();
			double cost = item.calculatePrice(quantity);
			System.out.println(item.getName()+ "\t" + quantity+ "\t" + cost);
		}
		System.out.println("Total Cost : " + this.totalCost);
		System.out.println("Total saved : " + this.totalSaved);
	}
}

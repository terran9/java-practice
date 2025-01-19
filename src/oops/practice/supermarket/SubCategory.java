package oops.practice.supermarket;

import java.util.ArrayList;
import java.util.List;

public class SubCategory {
	private String name;
	private double discount;
	private List<Item> items;
	
	
	public SubCategory(String name, double discount) {//can exist without items in it
		this.name = name;
		this.discount = discount;
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}

	public String getName() {
		return name;
	}

	public double getDiscount() {
		return discount;
	}

	public List<Item> getItems() {
		return items;
	}
	
	
	
}

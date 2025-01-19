package oops.practice.supermarket;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private String name;
	private List<SubCategory> subCategories;
	private double discount;
	
	public Category(String name, double discount) {
		this.name = name;
		this.discount = discount;
		this.subCategories = new ArrayList<>();
	}
	
	public void addSubCategory(SubCategory subCategory) {
		this.subCategories.add(subCategory);
	}

	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public double getDiscount() {
		return discount;
	}
	
}

package oops.practice.supermarket;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SuperMarketBilling {
	
	public static void main(String[] args) {
		
		Category produce = new Category("Produce", 10);
        SubCategory fruits = new SubCategory("Fruits", 18);
        SubCategory veg = new SubCategory("Veg", 5);
        fruits.addItem(new Item("Apple", 50, new BuyXGetYFreeStrategy(3, 1)));
        fruits.addItem(new Item("Orange", 80, new PercentageDiscount(20)));
        veg.addItem(new Item("Potato", 30, new BuyXGetYFreeStrategy(5, 2)));
        veg.addItem(new Item("Tomato", 70, new PercentageDiscount(10)));
        produce.addSubCategory(fruits);
        produce.addSubCategory(veg);

        Category dairy = new Category("Dairy", 15);
        SubCategory milk = new SubCategory("Milk", 20);
        SubCategory cheese = new SubCategory("Cheese", 20);
        milk.addItem(new Item("Cow Milk", 50, new BuyXGetYFreeStrategy(3, 1)));
        cheese.addItem(new Item("Gouda", 80, new PercentageDiscount(10)));
        dairy.addSubCategory(milk);
        dairy.addSubCategory(cheese);
        
        Invoice invoice = new Invoice("Venkata Nagendra");

        // Input purchases
        Map<String, Double> purchases = new LinkedHashMap<>();
        purchases.put("Apple", 6.0);
        purchases.put("Orange", 2.0);
        purchases.put("Potato", 14.0);
        purchases.put("Tomato", 3.0);
        purchases.put("Cow Milk", 8.0);
        purchases.put("Gouda", 2.0);
        
        List<Category> categories = Arrays.asList(produce, dairy);
        for (Map.Entry<String, Double> purchase : purchases.entrySet()) {
            String itemName = purchase.getKey();
            double quantity = purchase.getValue();

            for (Category category : categories) {
                for (SubCategory subCategory : category.getSubCategories()) {
                    for (Item item : subCategory.getItems()) {
                        if (item.getName().equalsIgnoreCase(itemName)) {
                            double highestDiscount = Math.max(category.getDiscount(),
                                    Math.max(subCategory.getDiscount(), item.getDiscountStrategy() instanceof PercentageDiscount ? ((PercentageDiscount) item.getDiscountStrategy()).getDiscountPercentage() : 0.0));
                            if(item.getDiscountStrategy() instanceof PercentageDiscount) {
                            ((PercentageDiscount) item.getDiscountStrategy()).setDiscountPercentage(highestDiscount);
                            }
                            invoice.addItem(item, quantity, highestDiscount);
                        }
                    }
                }
            }
        }

        // Print the invoice
        invoice.printInvoice();
		
	}
}

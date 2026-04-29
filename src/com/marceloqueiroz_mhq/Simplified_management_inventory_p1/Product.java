//1.Model: Product(Encapsulation and constructors)

/*Here encapsulation (private attributes and getters/setters)
 *and constructors are used to ensure data integrity*/

package com.marceloqueiroz_mhq.Simplified_management_inventory_p1;

public class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {return name;}
	public double getPrice() {return price;}
	
}

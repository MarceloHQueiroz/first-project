//2.Repository:StockRepository (Singleton and ArryList)

/*The singleton pattern ensures that there is only 
 *one instance of the inventory throughout the program*/

package com.marceloqueiroz_mhq.Simplified_management_inventory_p1;

import java.util.ArrayList;
import java.util.List;

public class StockRepository {
	private static StockRepository instancia;
	
	private List<Product> products;
	
	private StockRepository() {
		products = new ArrayList<>();
	}
	
	public static StockRepository getInstancia() {
		if(instancia == null) {
			instancia = new StockRepository();
		}
		return instancia;
	}
	
	public void add(Product p) {products.add(p);}
	
	public List<Product> listAll(){return products;}	
}	

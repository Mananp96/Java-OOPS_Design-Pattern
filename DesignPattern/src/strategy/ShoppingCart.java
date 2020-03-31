package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Context class
 * @author Manan
 */
public class ShoppingCart {
	List<Item> itemList;
	
	public ShoppingCart() {
		this.itemList = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.itemList.add(item);
	}
	
	public void removeItem(Item item) {
		this.itemList.remove(item);
	}
	
	public int countTotal() {
		int sum = 0;
		for(Item item : itemList) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(Strategy strategy) {
		int totalAmount = countTotal();
		strategy.pay(totalAmount);
	}
}

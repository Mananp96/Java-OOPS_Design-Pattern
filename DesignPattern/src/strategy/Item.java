package strategy;

public class Item {
	private String itemCode;
	private int price;
	
	public Item(String newitemCode,int value){
		this.itemCode = newitemCode;
		this.price = value;
	}
	
	public String getItemCode() {
		return itemCode;
	}
     
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

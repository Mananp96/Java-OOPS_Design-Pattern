package builder;

public class Pizza {
	private int size;
	private boolean cheese;
	private boolean pepperoni;
	private boolean bacon;
	
	Pizza(int size){
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isCheese() {
		return cheese;
	}
	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}
	public boolean isPepperoni() {
		return pepperoni;
	}
	public void setPepperoni(boolean pepperoni) {
		this.pepperoni = pepperoni;
	}
	public boolean isBacon() {
		return bacon;
	}
	public void setBacon(boolean bacon) {
		this.bacon = bacon;
	}
	
	public String getCheese() {
		if(cheese) {
			return "Yes";
		}else {
			return "No";
		}
	}
	public String getPepperoni() {
		if(pepperoni) {
			return "Yes";
		}else {
			return "No";
		}
	}
	public String getBacon() {
		if(bacon) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
	
	public String toString() {
		return "Size: "+this.size+"\n"+
				"Cheese: "+this.getCheese()+"\n"+
				"Pepperoni: "+this.getPepperoni()+"\n"+
				"Bacon: "+this.getBacon()+"\n\n";
	}
	
}

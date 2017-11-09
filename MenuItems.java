public class MenuItem{
	
	private String name;
	private float price;
	private int quantity;
	
	public MenuItem(String inName, double inPrice, int inQuantity){

			this.name = inName;
			this.price = inPrice;
			this.quantity = inQuantity;

	}

	public String getName(){return name};
	public float getPrice(){return price};
	}
}
public class Side extends MenuItem{
	
	private int size;

	public Side(int size, String choice){

		this.name = choice;
		this.size = size;
		this.price = this.referencePrice(size,choice);
	}

	public float referencePrice(String choice){

		switch (choice){
			case "Corn":
				return SIDE_CORN;
				break;

			case "6 Rolls"
				return SIDE_6R;
				break;

			case "12 Rolls":
				return SIDE_12R;
				break;

			case "Mozzarella Sticks":
				return SIDE_MOZZ;
				break;

			case "Breaded Mushrooms":
				return SIDE_BM;
				break;

			case "Jalapeno Poppers":
				return SIDE_POPPERS;
				break;

			case "Corn Nuggets":
				return SIDE_CN;
				break;

			case "Onion Rings":
				return SIDE_OR;
				break;

			case "Chicken Tenders":
				return SIDE_CT;
				break;
		}
	}

	public float referencePrice(int size, String choice){

		switch (choice){

			case "Coleslaw":
				if(size == 8)
					return SIDE_SLAW_SMALL_PRICE;
				if(size == 16)
					return SIDE_SLAW_LARGE_PRICE;
				break;

			case "Potato Salad":
				if(size == 8)
					return SIDE_POT_SMALL_PRICE;
				if(size == 16)
					return SIDE_POT_LARGE_PRICE;
				break;
		
			case "Macaroni Salad":
				if(size == 8)
					return SIDE_MAC_SMALL_PRICE;
				if(size == 16)
					return SIDE_MAC_LARGE_PRICE;
				break;

			case "Mashed Potato":
				if(size == 8)
					return SIDE_MASH_SMALL_PRICE;
				if(size == 16)
					return SIDE_MASH_LARGE_PRICE;
				break;

			case "Macaroni and Cheese":
				if(size == 8)
					return SIDE_MACANDCHEESE_SMALL_PRICE;
				if(size == 16)
					return SIDE_MACANDCHEESE_LARGE_PRICE;
				break;

			case "Yellow Rice":
				if(size == 8)
					return SIDE_RICE_SMALL_PRICE;
				if(size == 16)
					return SIDE_RICE_LARGE_PRICE;
				break;	
		}

	}

}
public class Displayer{

	String path;
	
	public Displayer(){

		this.path = "title,";

	}

		public static void titleDisplay(){

		System.out.println("\nChicken Delight Menu Order\n
			\n
			1 - Family Specials \n
			2 - Daily Specials \n
			3 - Lunch Specials \n
			4 - Sides and Desserts \n
			5 - Chicken \n
			6 - Dinners and Snacks \n
			7 - Shrimp \n
			8 - Ribs \n
			\n
			Enter sub-menu choice:");
	}

	public static void familySpecialDisplay(){

		System.out.println("\nFamily Specials: \n
			\n
			1 - 8 Pieces Chicken \n
			2 - 12 Pieces Chicken \n
			3 - 16 Pieces Chicken \n
			4 - Small Bucket of Ribs \n
			5 - Medium Bucket of Shrimp \n
			6 - Chicken & Shrimp \n
			7 - Chicken & Ribs \n
			\n
			Enter Family Special number:");
	}

	public static void dailySpecialDisplay(){

		System.out.println("\nDaily Specials: \n
			1 - 12 Pieces (Chicken Only) \n
			2 - 6 Pieces & Large Side \n
			3 - 10 Pieces & Large Side \n
			4 - 12 Pieces & Large Side \n
			5 - 30 Buffalo Wings \n
			6 - 20 Pieces & 2 Large Sides \n
			\n
			Enter Daily Special number:");
	}

	public static void lunchSpecialDisplay(){
		
		System.out.println("\nLunch Specials: \n
			\n
			1 - 3 Chicken Tenders \n
			2 - 5 Chicken Tenders \n
			3 - Chicken Sandwich \n
			4 - Three Wings and a roll \n
			5 - 2 Piece \n
			6 - 10 Buffalo Wings \n
			7 - Fish Sandwich \n
			8 - Half Pound of Ribs \n
			\n
			Enter Special Number:");
	}

	public static void sidesDisplay(){

		System.out.println("\nSide Orders: \n
			1 - Portion of Fries \n
			2 - Small Bucket of Fries \n
			3 - Medium Bucket of Fries \n
			4 - Mozzarella Stick \n
			5 - Breaded Mushrooms \n
			6 - Jalapeno Poppers \n
			7 - Corn Nuggets \n
			8 - Onion Rings \n
			9 - Chicken Tenders \n
			10 - 10 Buffalo Wings \n
			11 - 20 Buffalo Wings \n
			12 - 30 Buffalo Wings \n
			13 - Mashed Potatoes \n
			14 - Macaroni & Cheese \n
			15 - Corn on the Cob \n
			16 - Yellow Rice \n
			17 - Rolls \n
			18 - Coleslaw \n
			19 - Potato Salad \n
			20 - Macaroni Salad \n
			21 - Cheesecake \n
			22 - Oreo Mousse Cake \n
			\n
			Enter Side Number:");
	}

	public static void chickenDisplay(){

		System.out.println("\nEnter Number of Pieces: \n
			\n
			1 - 4 Piece \n
			2 - 6 Piece \n
			3 - 8 Piece \n
			4 - 12 Piece \n
			5 - 16 Piece \n
			6 - 20 Piece \n
			7 - 24 Piece \n
			8 - 28 Piece \n
			9 - 32 Piece \n
			10 - 36 Piece \n
			11 - 100 Piece \n
			\n
			12 - Breast \n
			13 - Thigh \n
			14 - Leg \n
			15 - Wing \n
			\n
			Enter Number of Pieces:");
	}

	public static void dinnersSnacksAndFishDisplay(){

		System.out.println("\nEnter Snack or Dinner: \n
			\n
			1 - Chicken Dinner \n
			2 - Rib Dinner \n
			3 - Shrimp Dinner \n 
			4 - Clam Dinner \n
			5 - Combo Dinner \n
			6 - Chicken Snack \n
			7 - Rib Snack \n
			8 - Shrimp Snack \n
			9 - 3 Fish and Chips \n
			10 - 6 Fish and Chips \n
			11 - 9 Fish and Chips \n
			12 - 12 Fish and Chips \n
			\n
			Enter Choice: ");
	}

	public static void shrimpDisplay(){

		System.out.println("\nEnter Number of Shrimp: \n
			\n
			1 - 7 Shrimp \n
			2 - 14 Shrimp \n
			3 - 21 Shrimp \n
			4 - 28 Shrimp \n
			5 - 35 Shrimp \n
			6 - 42 Shrimp \n
			\n
			Enter Number of Shrimp: ");

	}

	public static void ribDisplay(){

		System.out.println("\nEnter Amount of Ribs: \n
			\n
			1 - 1/2 Rack \n
			2 - Single Order \n
			3 - Small Bucket \n
			4 - Medium Bucket \n
			5 - Large Bucket \n
			6 - Extra Large Bucket \n
			\n
			Enter Number of Ribs: ");
	}

	public static void displayChoice(int num){

		switch(num){

			case 1:
			familySpecialDisplay();
			break;

			case 2:
			dailySpecialDisplay();
			break;

			case 3:
			lunchSpecialDisplay();
			break;

			case 4:
			sidesDisplay();
			break;

			case 5:
			chickenDisplay();
			break;

			case 6:
			dinnersAndSnacksDisplay();
			break;

			case 7:
			shrimpDisplay();
			break;

			case 8:
			ribDisplay();
			break;
		}
	}
	}
}
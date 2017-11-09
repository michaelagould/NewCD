public class FamilySpecial extends MenuItem{
	
	private String largeSide1;
	private String largeSide2;
	private String rollsOrSmall;

	public String getLargeSide1(){return largeSide1};
	public String getLargeSide2(){return largeSide2};
	public String getRollsOrSmall(){return rollsOrSmall};

	public FamilySpecial(int num, String sideChoice){

		this.setNameAndPrice(num);
		this.largeSide1 = "SmFF";
		this.largeSide2 = sideChoice;
		this.rollsOrSmall = "6R";
	}

	public void insteadOfFries(String sideChoice){
		
		this.largeSide1 = sideChoice;
	}

	public void insteadOfRolls(String sideChoice){

		this.rollsOrSmall = sideChoice;
	}

	public void setNameAndPrice(int num){
		
		switch (num){
			
			case 1:
			this.name = "Family Special #1 - 8 Pieces";
			this.price = FS_NUMBER1_PRICE;
			break;

			case 2:
			this.name = "Family Special #2 - 12 Pieces";
			this.price = FS_NUMBER2_PRICE;
			break;

			case 3:
			this.name = "Family Special #3 - 16 Pieces";
			this.price = FS_NUMBER3_PRICE;

			case 4:
			this.name = "Family Special #4 - Small Bucket Ribs";
			this.price = FS_NUMBER4_PRICE;

			case 5:
			this.name = "Family Special #5 - Medium Bucket Ribs";
			this.price = FS_NUMBER5_PRICE;

			case 6:
			this.name = "Family Special #6 - 8 Pieces & 17 Shrimp";
			this.price = FS_NUMBER6_PRICE;

			case 7:
			this.name = "Family Special #7 - 8 Pieces & Small Bucket Ribs";
			this.price = FS_NUMBER7_PRICE;
		}
	}
}
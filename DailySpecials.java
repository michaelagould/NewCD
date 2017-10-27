public class DailySpecial extends MenuItem{

	private String largeSide1 = "";
	private String largeSide2 = "";
	private String rolls = "";

	public DailySpecial(int numOfPieces){

		if(numOfPieces == 30){
			this.name = "30 Buffalo Wing Special";
			this.price = DS_30BUFF_PRICE;
		}
		if(numOfPieces == 12){
			this.name = "12 Piece Daily Special";
			this.price = DS_12PIECE_PRICE;
		}
	}

	public DailySpecial(int numOfPieces, String sideChoice){

		switch (numOfPieces){

			case 6:
			this.name = "6 Piece Daily Special";
			this.largeSide1 = sideChoice;
			this.price = DS_6PIECE_PRICE;
			this.rolls = "2R";
			break;

			case 10:
			this.name = "10 Piece Daily Special";
			this.largeSide1 = sideChoice;
			this.price = DS_10PIECE_PRICE;
			this.rolls = "6R";
			break;

			case 12:
			this.name = "12 Piece Daily Special";
			this.largeSide1 = sideChoice;
			this.price = DS_12PIECE_PRICE;
			this.rolls = "6R";
			break;
		}
	}

	public DailySpecial(int numOfPieces, String sideChoice1, String sideChoice2){

		this.name = "20 Piece Daily Special";
		this.largeSide1 = sideChoice1;
		this.largeSide2 = sideChoice2;
		this.rolls = "12R";
	}
}
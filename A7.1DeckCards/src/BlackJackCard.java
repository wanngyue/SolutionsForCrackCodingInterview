
public class BlackJackCard extends Card {

	public BlackJackCard(int v, Suit s) {
		super(v, s);
	}

	@Override
	public int getValue() {
		if(value > 10){
			return 10;
		}else if(value == 1){
			return 11;
		}
		return value;
	}

}


public class Card {
	int value;
	Suit suit;
	
	public Card(int v, Suit s){
		this.value = v;
		this.suit = s;
	}
	
	public int getValue(){
		return value;
	}
	public Suit getSuit(){
		return suit;
	}
}

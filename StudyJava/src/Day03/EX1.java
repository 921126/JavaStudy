package Day03;

public class EX1 {

	public static void main(String[] args) {

		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
			
	}
}

class SutdaDeck{
	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck(){
		
		for(int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean kCk = false;
			
			if( i < 10) {
				if(num == 1 || num == 3 || num == 8) {
					kCk = true;
				}
			}
			
			cards[i] = new SutdaCard(num, kCk);
		}
	}
	
	void shuffle () {
		
		int rand = (int)(Math.random()*cards.length);
		for(int i =0; i < cards.length; i++) {
			SutdaCard tmp = cards[i];
			cards[i] = cards[rand];
			cards[rand] = tmp;
		}
		
	}
	
	SutdaCard pick (int index) {
		
		return cards[index];
	}
	
	SutdaCard pick () {
		int index = 0;
		index = (int)(Math.random()*20)+1;
		return cards[index];
	}
}

class SutdaCard{
	
	int num;
	boolean isKwang;
	
	//생성자
	SutdaCard(){
		this(1,true);
	}

	public SutdaCard(int num, boolean isKwang) {
		
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
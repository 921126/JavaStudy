package Day02;

public class EX1 {

	public static void main(String[] args) {
	
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}
}

class SutdaCard{
	
	int num;
	boolean isKawng;

	public SutdaCard() {
		
		this.num = 1;
		this.isKawng = true;
		
	}
	
	public SutdaCard(int n , boolean a) {
	
		this.num = n;
		this.isKawng = a;
		
	}
	
	public String info() {
		
		String str = Integer.toString(num);
		if(this.isKawng == false) {
			return str;
		}else {
			String str2 = str + "K";
			return str2;
		}
	}
	
}

package Day03;

public class EX2 {
	
	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		System.out.println(t.toString());
	}
}

class Product {
	
	int price;
	int bonusPoint;
	
	//생성자
	Product() {
		
	}
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	
	//생성자
	Tv() {
		
	}
	
	public String toString() {
		return "Tv";
	}
}
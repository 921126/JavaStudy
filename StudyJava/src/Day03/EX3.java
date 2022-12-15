package Day03;

public class EX3 {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println("x=" + c.getX());
		
	}

}

class Parent{
	int x = 100;
	
	Parent (){
		this(200);
		System.out.println("상위 클래스 기본생성자 출력");
	}
	
	Parent(int x){
		this.x = x;
		System.out.println("상위 클래스 매개변수 생성자 출력");
	}
	
	int getX() {
		return x;
	}
}

class Child extends Parent{
	
	int x = 3000;
	
	Child () {
		this(1000);
		System.out.println("하위 클래스 기본생성자 출력");
	}
	
	Child(int x){
		this.x = x;
		System.out.println("하위 클래스 매개변수 생성자 출력");
	}
}

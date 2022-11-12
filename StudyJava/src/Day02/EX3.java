package Day02;

public class EX3 {
	
	public static void main(String[] args) {
	
		System.out.println(getDistance(1, 1, 2, 2));
		
		MyPoint mp = new MyPoint(1, 1);
		System.out.println(mp.getDistance(2, 2));
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		
		double dis = Math.sqrt(((x1 -x) * (x1 -x)) + ((y1-y) * (y1-y))); 
		
		return dis;
	}
}

class MyPoint{
	
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x1, int y1){
		
		double dis = Math.sqrt(((x1 -x) * (x1 -x)) + ((y1-y) * (y1-y))); 
		
		return dis;
	}
}

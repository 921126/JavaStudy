package Day02;

public class EX2 {

	public static void main(String[] args) {
		
		Student st = new Student("홍길동", 1, 1, 100, 100, 36);
		System.out.println("이름:" + st.name);
		System.out.println("총점:" + st.getTotal());
		System.out.println("평균:" + st.getAverage());
		System.out.println(st.info());
	}
}

class Student{
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student() {
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		
		int total = 0;
		total = kor+ eng+ math;
		return total;
	}
	
	public float getAverage() {
		
		float aver = 0;
		aver = (float)getTotal() /3;
		String str = String.format("%.1f", aver);
		float result = Float.parseFloat(str);
		return result;
	}

	public String info() {
		int total = getTotal();
		float aver = getAverage();
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + total + "," + aver;
	}
	
}

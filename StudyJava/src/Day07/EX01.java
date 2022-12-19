package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EX01 {

	//11-7번 8번
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("이자바",2,1,70,90,70)); 
		list.add(new Student("안자바",2,2,60,100,80)); 
		list.add(new Student("홍길동",1,3,100,100,100)); 
		list.add(new Student("남궁성",1,1,90,70,80)); 
		list.add(new Student("김자바",1,2,80,80,90)); 
		
		//Collections.sort(list, new BanNoAscending());
		calculateSR(list);
		
		
		Iterator<Student> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
	
public static void calculateSR(List list) {
		
		Collections.sort(list);
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i =0; i<length; i++) {
			
			Student s = (Student)list.get(i); //학생으로 받을꺼니 형변환하기
			
			if(s.total == prevTotal) { //만약에 총점이 -1이라면 
				s.schoolRank = prevRank;
			}else {
				s.schoolRank = i+1;
			}
			
			prevRank = s.schoolRank;
			prevTotal = s.total;
		}
		
	}
	
}

class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	//11-8 추가변수
	int total;
	int schoolRank;
	
	public Student() {
		// TODO Auto-generated constructor stub
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
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}

	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			
			return s.total - this.total; //총점기준 내림차순 매개변수 - 실제변수하면 내림차순
		}else {
			return -1;
		}
		
	}
	
	@Override
	public String toString() {
		return name +", "+ ban+", "+no+", "+kor+", "+eng+", "+math+", "+getTotal()+", "+getAverage();
	}
	
}

class BanNoAscending implements Comparator{
	
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Student && o2 instanceof Student) {
			Student c1 = (Student)o1;
			Student c2 = (Student)o2;
			
			int result = c1.ban - c2.ban; //정방향
			
			if(result == 0) { //서로 반이 같으면 번호 비교하기
				return c1.no - c2.no;
			}
			return result;
		}
			return -1;
	}
}

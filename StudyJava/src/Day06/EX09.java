package Day06;

import java.util.*;

public class EX09 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		
		HashSet set = new HashSet(list); //중복 용납안되서 2,6,3,7
		TreeSet tset = new TreeSet(set); //오름차순 자동정렬 2,3,6,7
		Stack stack = new Stack(); //스택은 나중에 저장한 녀석이 먼저 나옴 7 6 3 2
		stack.addAll(tset); 
		
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
		
	}

}

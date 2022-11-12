package Day02;

public class Programmers_Quiz01 {

	public static void main(String[] args) {

		int[] arr = {2,4,8};

		Solution sl = new Solution();
		System.out.println(sl.Solution(arr));

	}
}

class Solution{
	public int Solution(int[] common) {

		int answer = 0;
		int tmp = 0;
		boolean ap = false;
		//1. 등차수열인지 판별하기
		if(common[0] - common[1] == common[1] - common[2]) {
			ap = true;
			tmp = common[1] - common[0];

		//2. 등비수열인지 판별하기
		}else if(common[2] / common[1] == common[1] / common[0]) {
			ap = false;
			tmp = common[1] / common[0];

		}
		System.out.println(tmp);

		//2. 등차수열일 때 값 리턴
		if(ap == true) {
			answer = common[common.length-1] + tmp;
		}else {
			answer = common[common.length-1] * tmp;
		}

		return answer;

	}

}

package puzzle.future;

public class Solution {
	static int minNum(int A, int K, int P) {
		if((A<1 || A>100) || (K<1 || K >100) || (P<0|| P>100)) return -1;
		if(K<=A) return -1;
		
		return 1+P/(K-A);
	}
	public static void main(String[] args) {
		System.out.println(minNum(3,5,1)==1);
		System.out.println(minNum(4,5,1)==2);
		System.out.println(minNum(4,4,1)==-1);
		System.out.println(minNum(4,5,0)==1);
	}

}

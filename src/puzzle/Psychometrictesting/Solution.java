package puzzle.Psychometrictesting;

import java.util.Arrays;

public class Solution {

	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		int groupSize=lowerLimits.length;
		int[] result=new int[groupSize];
		for(int i=0;i<scores.length;i++) {
			int score=scores[i];
			for(int j=0;j<groupSize;j++) {
				if(score>=lowerLimits[j] && score<=upperLimits[j] ) {
					result[j]+=1;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(jobOffers(new int[] {4,8,7},new int[] {2,4},new int[] {8,4})));
		System.out.println(Arrays.toString(jobOffers(new int[] {1,3,5,6,8},new int[] {2},new int[] {6})));
	}

}

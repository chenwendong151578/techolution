package puzzle.balanceornot;

import java.util.Arrays;

public class solution {
	static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
		int[] result=new int[expressions.length];
		for(int i=0;i<expressions.length;i++) {
			int leftCount=0;
			int rightCount=0;
			String expression=expressions[i];
			for(int j=0;j<expression.length();j++) {
				if(expression.charAt(j)=='<') {
					leftCount++;
				}else if(expression.charAt(j)=='>') {
					if(leftCount>0) leftCount--;
					else rightCount++;
				}
			}
			if(leftCount>0) {
				result[i]=0;
			}else {
				if(rightCount<=maxReplacements[i]) result[i]=1;
				else result[i]=0;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(balancedOrNot(new String[] {"<>>>", "<>>>>"},new int[] {2,2})));
		System.out.println(Arrays.toString(balancedOrNot(new String[] {"<>", "<>><"},new int[] {1,0})));
	}

}

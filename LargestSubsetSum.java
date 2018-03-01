
import java.util.Arrays;

public class LargestSubsetSum{
	static long[] maxSubsetSum(int[] k) {
		if(k==null || k.length==0) return null;
		long[] result=new long[k.length];
		for(int i=0;i<k.length;i++) {
			int val=k[i];
			int sum=val==1?1:1+val;
			for(int j=2;j<=val/2+1;j++) {
				for(int z=2;z<=val/2;z++) {
					if(j*z==val) {
						sum+=j;
						break;
					}
				}
			}
			result[i]=sum;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxSubsetSum(new int[] {1,2,4,15,16})));
	}

}

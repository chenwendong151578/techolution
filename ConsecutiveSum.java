
public class ConsecutiveSum {
	static int consecutive(long num) {
		if(num<=2) return 0;
		int count=0;
		int sum=1;
		int init=2;
		int max=(int) ((num/2)+1);
		while(init<=max) {
			for(int i=init;i<=max;i++) {
			 sum+=i;
			 if(sum==num) {
				 count++;
				 break;
			 }else if(sum>num) {
				 break;
			 }
			}
			init++;
			sum=0;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(consecutive(15));
		System.out.println(consecutive(2));
	}

}

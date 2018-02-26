package puzzle.buyshowticket;

public class Solution {

	public static long waitingTime(int[] tickets, int p) {
		long second=0;
		while(true) {
			for(int i=0;i<tickets.length;i++) {
				if(tickets[i]==0) continue;
				second++;
				tickets[i]--;
				if(tickets[i]==0 && (i==p)) return second;
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println(waitingTime(new int[] {5,5,2,3},3)==11);
		System.out.println(waitingTime(new int[] {1,1,1,1},0)==1);
		System.out.println(waitingTime(new int[] {2,6,3,4,5},2)==12);
	}

}

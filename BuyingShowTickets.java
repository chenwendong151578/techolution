
public class BuyingShowTickets {

	public static long waitingTime(int[] tickets, int p) {
		if(tickets==null || tickets.length==0) return 0;
		if(!(p>=0 && p<tickets.length)) return 0;
		long second=0;
		if(tickets[p]==1) second=p+1;
		else {
			int val=tickets[p];
			second=tickets.length*val;
			for(int i=0;i<tickets.length;i++) {
				if(i!=p) {
					if(tickets[i]<val) second-=val-tickets[i];
				}
			}
			second-=(tickets.length-p-1);
		}
		return second;
		
	}
	public static void main(String[] args) {
		System.out.println(waitingTime(new int[] {5,5,2,3},3));
		System.out.println(waitingTime(new int[] {1,1,1,1},0));
		System.out.println(waitingTime(new int[] {2,6,3,4,5},2));
	}

}

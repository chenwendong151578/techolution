
public class FindTheWinner {
	static String winner(int[] andrea, int[] maria, String s) {
		int length=andrea.length;
		int init=s.equals("Even")?0:1;
		int andreaPoint=0,mariaPoint=0;
		for(int i=init;i<length;i+=2) {
			andreaPoint+=andrea[i]-maria[i];
			mariaPoint+=maria[i]-andrea[i];
		}
		if(andreaPoint>mariaPoint) return "Andrea";
		else if(andreaPoint<mariaPoint) return "Maria";
		else return "Tie";
		
	}
	public static void main(String[] args) {
		System.out.println(winner(new int[] {1,2,3},new int[] {2,1,3},"Even"));
		System.out.println(winner(new int[] {1,2,3},new int[] {2,1,3},"Odd"));
	}

}

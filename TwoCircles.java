
import java.util.Arrays;

public class TwoCircles {
	
	static String[] circles(String[] info) {
		String[] result=new String[info.length];
		for(int i=0;i<info.length;i++) {
			int[] circleData=Arrays.stream(info[i].split(" ")).mapToInt(Integer::parseInt).toArray();
			int distance=0;
			if(circleData[0]==0 ) {
				if(circleData[3]==0) {
					 distance=Math.abs(circleData[1]-circleData[4]);
				}else {
					 distance=(int)Math.sqrt(Math.pow(circleData[1],2)+Math.pow(circleData[3],2));
				}
			}else {
				if(circleData[4]==0) {
					 distance=Math.abs(circleData[0]-circleData[3]);
				}else {
					 distance=(int)Math.sqrt(Math.pow(circleData[0],2)+Math.pow(circleData[4],2));				
					
				}				
			}
			if(distance==0) result[i]="Concentric";
			else if(distance>circleData[2]+circleData[5]) result[i]="Disjoint‐Outside";
			else if(distance==circleData[2]+circleData[5] || distance==Math.abs(circleData[2]-circleData[5]) ) result[i]="Touching";
			else if(distance<(circleData[2]+circleData[5]) && distance>Math.abs(circleData[2]-circleData[5]) ) result[i]="Intersecting";
			else if(distance<Math.abs(circleData[2]-circleData[5]) ) result[i]="Disjoint‐Inside";		
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(circles(new String[] {"12 0 21 14 0 23","0 45 8 0 94 9","35 0 13 10 0 38","0 26 8 0 9 25"})));
		System.out.println(Arrays.toString(circles(new String[] {"0 5 9 0 9 7","0 15 11 0 20 16","26 0 10 39 0 23","37 0 5 30 0 11","41 0 0 28 0 13"})));		 
	}

}

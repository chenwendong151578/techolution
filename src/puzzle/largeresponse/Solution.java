package puzzle.largeresponse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Solution {

	public static void response(String inputFile) {
		String outFile="bytes_"+inputFile;
		int count=0;
		long sum=0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(Solution.class.getResource(inputFile).getPath())))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       long bVal=Long.parseLong(line.substring(line.lastIndexOf(" ")+1));
		       if(bVal>5000) {
		    	   		count++;
		    	   		sum+=bVal;
		       }
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
		try ( BufferedWriter bw=new BufferedWriter(new FileWriter(outFile)) ){
			bw.write(String.valueOf(count)+"\r");
			bw.write(String.valueOf(sum)+"\r");
		    
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	public static void main(String[] args) {
		response("hosts_access_log_00.txt");
	}

}

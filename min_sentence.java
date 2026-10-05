package leetcode;
import java.util.*;

public class min_sentence {
	  public static int mostWordsFound(String[] sen) {
	        ArrayList<Integer> arr=new ArrayList<>();
	        for(int i=0;i<sen.length;i++) {
	        	int sum=0;
	        	for(int j=0;j<sen[i].length();j++) {
	        		
	        		if(sen[i].charAt(j)==' '||j==sen[i].length()-1) {
	        			
	        			sum+=1;
	        		}
	        		
	        	}
	        	arr.add(sum);
	        }
	        int max=Collections.max(arr);
	        return max;
	    }

	public static void main(String[] args) {
		String [] sentences = {"please wait", "continue to fight", "continue to win"};
		System.out.println(mostWordsFound(sentences));
	}

}

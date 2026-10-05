package leetcode;
import java.util.*;

public class richest_customer {
	 public static int maximumWealth(int[][] accounts) {
	        ArrayList<Integer> arr=new ArrayList<>();
	        for(int i=0;i<accounts.length;i++){
	            int sum=0;
	            for(int j=0;j<accounts[i].length;j++){
	                 sum+=accounts[i][j];
	            }
	            arr.add(sum);
	        }
	         return Collections.max(arr);
	    }
	 
	 public static void main(String[]args) {
		 int[][] accounts = {{1,2,3},{3,2,5}};
		  System.out.println(maximumWealth(accounts) );
	 }
}

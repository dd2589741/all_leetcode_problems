package leetcode;
import java.util.*;

public class slement_digit {
	  public static int differenceOfSum(int[] nums) {
		  ArrayList<Integer>arr=new ArrayList<>();
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]>=10) {
	        		int num=nums[i];
	        		while(num>0) {
	        		   int rem=num%10;        		  
	        		   num=num/10;
	        		  
	        		   arr.add(rem);
	        		}
	        		
	        	}
	        	else {
	        		arr.add(nums[i]);
	        	}
	        }
	        int sum=0;
	        for(int i=0;i<arr.size();i++) {
	        	sum+=arr.get(i);
	        }
	        int sum2=0;
	        for(int i=0;i<nums.length;i++) {
	        	sum2+=nums[i];
	        }
	        
	        
	        return sum2-sum;
	    }

	public static void main(String[] args) {
		int[] nums = {3,6,15,14,17,12,9,9,15,3,13,5,18,13,18,17,5,14,7,20};
        System.out.println(differenceOfSum(nums));
	}

}

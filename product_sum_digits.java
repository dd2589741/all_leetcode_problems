package leetcode;
import java.util.*;
public class product_sum_digits {
	 public static int subtractProductAndSum(int n) {
		 ArrayList<Integer> arr=new ArrayList<>();
		 int sum=0;
		    if(n<10) {
		    	return 0;
		    }
	        while(n>0) {
	        	int rem=n%10;
	        	n=n/10;
	        	arr.add(rem);
	        }
	        int mul=1;
	        for(int i=0;i<arr.size();i++) {
	        	mul*=arr.get(i);
	        }
	        for(int i=0;i<arr.size();i++) {
	        	sum+=arr.get(i);
	        }
	      
	        return mul-sum;
	    }

	public static void main(String[] args) {
		int n = 234;
		System.out.println(subtractProductAndSum(n) );

	}

}

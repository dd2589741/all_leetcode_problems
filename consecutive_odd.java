package leetcode;

public class consecutive_odd {
	 public static boolean threeConsecutiveOdds(int[] arr) {
	        int count=0;
	        for(int i=0;i<arr.length;i++) {
	        	
	        	if(arr[i]%2!=0) {
	        		count++;
	        	}else {
	        		count=0;
	        	}
	        	if(count==3) {
	        		return true;
	        	}
	        }
	        System.out.println(count);
	        return false;
	    }

	public static void main(String[] args) {
          int[] arr = {2,1,5,7,9};
          System.out.println(threeConsecutiveOdds( arr) );
	}

}

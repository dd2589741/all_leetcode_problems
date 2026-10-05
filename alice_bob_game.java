package leetcode;
import java.util.*;

public class alice_bob_game {
    public static boolean canAliceWin(int[] nums) {
    	 ArrayList<Integer>arr=new ArrayList<>();
         for(int i=0;i<nums.length;i++){
             arr.add(nums[i]);
         }
         Collections.sort(arr);
         int sum=0;
         int larger=0;
         for(int i=0;i<arr.size();i++){
             if(arr.get(i)<10){
                  sum+=arr.get(i);
             }else {
            	 larger+=arr.get(i);
             }
         }
         if(sum>larger||sum<larger) {
        	 return true;
         }else {
        	 return false;
         }
         
    }
    
    public static void main(String[]args) {
    	int[]nums = {1,2,3,4,10};
    	System.out.println(canAliceWin( nums));
    }

}

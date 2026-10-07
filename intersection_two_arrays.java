import java.util.*;

public class intersection_two_arrays{
     public static int[] intersect(int[] nums1, int[] nums2) {
            ArrayList<Integer> arr=new ArrayList<>();
       for(int i=0;i<nums1.length;i++) {
    	   for(int j=0;j<nums2.length;j++) {
    		  
    		   if(nums1[i]==nums2[j]) {
    			   arr.add(nums2[j]);
    			   nums2[j]=-1;
    			   break;
    		   }
    	   }  	  
       }
       int[]arr1=new int[arr.size()];
       for(int i=0;i<arr.size();i++) {
    	   arr1[i]=arr.get(i);
       }
      
       return arr1;

        
    }
    public static void main(String[]args){
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersect( nums1, nums2)));
    }
}
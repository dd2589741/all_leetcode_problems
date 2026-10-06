import java.util.*;

public class intersection_two_arrays{
     public static int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> arr=new ArrayList<>();
        int []arr1=new int[arr.size()+1];
        int same=0;
        if(nums1.length==1&&nums2.length==1&&nums1[nums1.length-1]==nums2[nums2.length-1]) {
        	arr.add(nums1[nums1.length-1]);
//        	System.out.println(arr.size());
        	 for(int i=0;i<arr.size();i++){
                 arr1[i]=arr.get(i);
             }           
        	 return arr1;

        }
        	
        	
        for(int i=0;i<nums1.length;i++){
           
            
            for(int j=0;j<nums2.length;j++){
                
                if(i!=j&&nums1[i]==nums2[j]&&nums1[i]!=same){
                      same=nums2[j];
                      break;
                }else{
                    same=0;
                }
            }
            
            
            if(same>0){
               arr.add(same);
            }
            
        }
         for(int i=0;i<arr.size();i++){
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
package leetcode;
import java.util.*;
public class merge_array {
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 ArrayList<Integer> arr=new ArrayList<>();
	        int arr_length=m+n;
	        int count=0;
	        for(int i=0;i<nums1.length;i++) {
	        	if(nums1[i]==0&&count<nums2.length) {
	        		nums1[i]=nums2[count];
	        		count++;
	        	
	        	}
	        }
	        for(int i=0;i<arr_length;i++) {
	        	arr.add(nums1[i]);
	        }
	        Collections.sort(arr);
	        for(int i=0;i<arr.size();i++) {
	        	nums1[i]=arr.get(i);
	        }
	       
	    }

	public static void main(String[] args) {
		int[] nums1= {1,2,3,0,0,0};
		int m=3;
		int[] nums2= {2,5,6};
		int n=3;
		merge(nums1,m,nums2,n);
	}

}

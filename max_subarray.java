package leetcode;
import java.util.*;

public class max_subarray {
	  public static int maxSubArray(int[] nums) {
		  return divide(nums, 0, nums.length - 1);
	    }

	    public static int divide(int[] nums, int left, int right) {

	        // Base case
	        if (left == right) {
	            return nums[left];
	        }

	        // Divide
	        int mid = left + (right - left) / 2;

	        // Conquer: find maximum sum in left and right halves
	        int leftMax = divide(nums, left, mid);
	        int rightMax = divide(nums, mid + 1, right);

	        // Find maximum subarray sum crossing the middle
	        int leftSum = Integer.MIN_VALUE;
	        int sum = 0;

	        for (int i = mid; i >= left; i--) {
	            sum += nums[i];
	            leftSum = Math.max(leftSum, sum);
	        }

	        int rightSum = Integer.MIN_VALUE;
	        sum = 0;

	        for (int i = mid + 1; i <= right; i++) {
	            sum += nums[i];
	            rightSum = Math.max(rightSum, sum);
	        }

	        int crossMax = leftSum + rightSum;

	        // Return the best of the three possibilities
	        return Math.max(Math.max(leftMax, rightMax), crossMax);
	    }
		 
		 
	  
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

}

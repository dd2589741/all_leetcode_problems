package leetcode;
import java.util.*;
public class min_num_game {
	static int[] numberGame(int []nums) {
		   
        int[] arr = new int[nums.length];
        int index = 0;

        for (int round = 0; round < nums.length / 2; round++) {

            // Find Alice's minimum
            int min1Index = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[min1Index]) {
                    min1Index = i;
                }
            }

            int alice = nums[min1Index];

            // Remove Alice's element
            nums[min1Index] = Integer.MAX_VALUE;

            // Find Bob's minimum
            int min2Index = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[min2Index]) {
                    min2Index = i;
                }
            }

            int bob = nums[min2Index];

            // Bob goes first into arr
            arr[index++] = bob;

            // Alice goes second
            arr[index++] = alice;

            // Remove Bob's element
            nums[min2Index] = Integer.MAX_VALUE;
        }

        return arr;
   
}
	    

	public static void main(String[] args) {
                int []nums = {5,4,2,3};
                System.out.println(Arrays.toString(numberGame(nums)));
                
	}

}

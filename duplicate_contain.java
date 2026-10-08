import java.util.*;

public class duplicate_contain{
	
		public static boolean containsDuplicate(int[] nums) {
			ArrayList<Integer> arr=new ArrayList<>();
			for(int i=0;i<nums.length;i++) {
				arr.add(nums[i]);
			}
			Collections.sort(a`rr);
			int capture=arr.get(0);
			int i=1;
			while(i<arr.size()) {
				if(capture!=arr.get(i)) {
					capture=arr.get(i);
				}
				else {
					return true;
				}
				i++;
			}
			return false;
		}
			
		    

	public static void main(String[] args) {
		 int[]  nums ={1,3,2,1};
		 System.out.println(containsDuplicate(nums));

	}

}
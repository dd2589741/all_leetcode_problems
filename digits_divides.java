package leetcode;
import java.util.*;
public class digits_divides {
        public static int countDigits(int number) {
            ArrayList<Integer> arr=new ArrayList<>();
            int count=0;
            int num=number;
            int rem=0;
            while(1<=num) {
            	rem=num%10;
            	arr.add(rem);
            	num=num/10;
            }
            for(int i=0;i<arr.size();i++) {
            	if(number%arr.get(i)==0) {
            		count++;
            	}
            }
            
            return count;
        }

	public static void main(String[] args) {
		int num= 1248;
		System.out.println( countDigits( num));
          
	}

}

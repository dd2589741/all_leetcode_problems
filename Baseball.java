package leetcode;
import java.util.*;

public class Baseball {
	public static int calPoints(String[] ops) {
		ArrayList<String> arr=new ArrayList<>();
		int size=ops.length;
		for(int i=0;i<size;i++) {
			System.out.println(arr);
			if(ops[i].equals("C")) {
				arr.remove(arr.size()-1);
				
			}
			else if(ops[i].equals("D")) {
				System.out.println(arr.get(arr.size()-1));
				
				int a=Integer.parseInt(arr.get(arr.size()-1));
				int b=2*a;
				String str=String.valueOf(b);
				arr.add(str);
			}
			else if(ops[i].equals("+")) {
				int sum=0;
				for(int j=arr.size()-2;j<arr.size();j++) {
					int a=Integer.parseInt(arr.get(j));
					sum+=a;
				}
				String str=String.valueOf(sum);
				arr.add(str);
			}
			else {
				arr.add(ops[i]);
			}
		}
		System.out.println(arr);
		int sum=0;
		for(int j=0;j<arr.size();j++) {
			int a=Integer.parseInt(arr.get(j));
			sum+=a;
		}
		return sum;
	}
	
     public static void main(String[] args) {
    	 String [] ops = {"-60","D","-36","30","13","C","C","-33","53","79"};
    	 System.out.println(calPoints(ops));
    	 
     }
}

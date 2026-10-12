
import java.util.*;
public class reverse_string {
	 public static void reverseString(char[] s) {
	        // ArrayList<String> arr=new ArrayList<>();
	        char [] arr=new char[s.length];
            int index=0;
	        for(int i=s.length-1;i>=0;i--){
	           arr[index]=s[i];
	           index++;
	        }
             
	        for(int i=0;i<arr.length;i++) {
	        	s[i]=arr[i];
	        }
	        System.out.println(Arrays.toString(s));
	        
	    }
	public static void main(String[] args) {
		char []  s = {'h','e','l','l','o'};
		reverseString(s);
	}

}

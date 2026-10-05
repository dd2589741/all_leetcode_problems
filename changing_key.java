package leetcode;
import java.util.*;
public  class changing_key {

	public static int countKeyChanges(String s) {
		ArrayList<Character>arr=new ArrayList<>();
		int count_j=0;
		for(char k='a';k<='z';k++){
			arr.add(k);
		}
		
		for(int i=0;i<s.length();i++){
			char change=s.charAt(i);
			for(int j=i+97;j<s.length()+97;j++) {
				char b=(char) j;
				if((s.charAt(i)!=Character.toUpperCase(b)||s.charAt(i)!=b)) {
					count_j+=1;
			}
			}
		}        
        return count_j;
    }

	public static void main(String[] args) {
		String s =  "aAbBcC";
		System.out.println(countKeyChanges( s));

	}

}

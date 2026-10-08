import java.util.*;

public class anagram {
	 public static boolean isAnagram(String s, String t) {
		 ArrayList<Character> arr=new ArrayList<>();
		 ArrayList<Character> arr1=new ArrayList<>();
		 for(int i=0;i<s.length();i++) {
			 arr.add(s.charAt(i));
		 }
		 for(int i=0;i<t.length();i++) {
			 arr1.add(t.charAt(i));
		 }
		 Collections.sort(arr);
		 Collections.sort(arr1);
		 if(arr.size()!=arr1.size()) {
			 return false;
		 }

		 int count=0;
		 for(int i=0;i<t.length();i++) {
			 if(arr.get(i)==arr1.get(i)) {
				 count++;
			 }else {
				return false;
			 }
		 }
		 
		 return true;

	    }

	public static void main(String[] args) {
		String  s = "a";
		String t = "ab";
		System.out.println(isAnagram( s, t) );

	}

}

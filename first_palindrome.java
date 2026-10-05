package leetcode;

public class first_palindrome {
	 public static String firstPalindrome(String[] words) {
		 
		 for(int i=0;i<words.length;i++) {
			 String i_index=words[i];
			 String valid="";
			 for(int j=words[i].length()-1;j>=0;j--) {
				 valid+=words[i].charAt(j);
			 }
			 if(i_index.equals(valid)) {
				 return i_index;
			 }
		 }
		 
		 return "";
		 }
	public static void main(String[] args) {
		String[] words = {"def","ghi"};
		System.out.println(firstPalindrome(words));
	}

}

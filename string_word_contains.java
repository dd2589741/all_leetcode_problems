package leetcode;
import java.util.*;

public class string_word_contains {
	 public static List<Integer> findWordsContaining(String[] words, char x) {
	        ArrayList<Integer>arr=new ArrayList<>();
	        for(int i=0;i<words.length;i++){
	            for(int j=0;j<words[i].length();j++){
	                if(words[i].charAt(j)==x){
	                   arr.add(i); 
	                   break;
	                }
	            }
	           
	        }
	        return arr;
	    }

	public static void main(String[] args) {
		String []words = {"abc","bcd","aaaa","cbc"};
		char x = 'a';
		System.out.println( findWordsContaining(words,  x));

	}

}

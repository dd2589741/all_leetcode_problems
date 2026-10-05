package leetcode;
///accepted program
public class sentencecheck {
	public static boolean checkIfPangram(String s) {


		if(s.length()<26) {
			return false;
		}
		char[] arr= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i=0;i<arr.length;i++) {
			boolean alphabet=false;
			for(int j=0;j<s.length();j++) {

		     	if(arr[i]==s.charAt(j)) {
			        alphabet=true;
			        break;
			   }
			}
			System.out.println(arr[i]);if(alphabet==false) {
				return false;
				}
			
			
		}
		return true;
		
		}
     public static void main(String[] args) {
    	 String sentence ="thequickbrownfoxjumpsoverthelazydog";
    	 System.out.println(checkIfPangram(sentence));
     }
}

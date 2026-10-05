package leetcode;

public class Robot_game {
	 public static boolean judgeCircle(String moves) {
		 int initial1=0;
		 int initial2=0;
	        int x=0;
	        int y=0;
	        for(int i=0;i<moves.length();i++) {
	        	if(moves.charAt(i)=='U') {
	        		y++;
	        	}else if(moves.charAt(i)=='D') {
	        		y--;
	        	}else if(moves.charAt(i)=='R') {
	        		x++;
	        	}else {
	        		x--;
	        	}
	        }
	        if(x==initial1&&y==initial2) {
	        	return true;
	        }
	        return false;
	    }
	 
	 public static void main(String []args) {
		 String moves = "LLRR";
		 System.out.println(judgeCircle(moves));
		 
	 }
}

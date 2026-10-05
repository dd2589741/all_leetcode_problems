package leetcode;

import java.util.*;
public class testing_platform {
	static int[] min_game(int []arr) {
          int divide_arr=arr.length/2;
          ArrayList<Integer>arr1=new ArrayList<>();
          ArrayList<Integer>arr2=new ArrayList<>();
          for(int i=0;i<arr.length;i++) {
        	  arr1.add(arr[i]);
          }
          Collections.sort(arr1);
         
          if(arr1.size()==2) {
        	  Collections.reverse(arr1);
        	  for(int i=0;i<arr1.size();i++) {
            	  arr[i]=arr1.get(i);
              }
        	  return arr;
          }
          for(int j=divide_arr;j<arr1.size();j++) {
        	  arr2.add(arr1.get(j));

          }
          while(arr1.size()>divide_arr) {
        	  arr1.remove(arr1.get(arr1.size()-1));
          }
          Collections.reverse(arr1);
          Collections.reverse(arr2);
          arr1.addAll(arr2);
          for(int i=0;i<arr1.size();i++) {
        	  arr[i]=arr1.get(i);
          }
          System.out.println(arr1);
          System.out.println(arr2);
          return arr;
	}
	
    public static void main(String [] args) {
    	int []arr= {2,7,9,6,4,6};
    	System.out.println(Arrays.toString(min_game(arr)));
    	
    }
}

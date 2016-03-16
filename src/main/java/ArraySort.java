package main.java;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] n = {2,3,4,6,11,12};
      int comp = n[0]; 
      for(int i=1; i<n.length; i++) {
    	  if(n[i] < comp) {
    		  System.out.println("not sorted");
    		  return;  
    	  }
    	  else {
    		  comp = n[i];
    	  }
      }
       System.out.println("array is sorted");
	}

}

package com.coding.algoexpert.io;

public class IsMonotonicArray {
	
	  public static boolean isMonotonic(int[] array) {
		  boolean isNonIncreasing = true;
		  boolean isNonDecreasing = true;
		  
		  for(int i = 1; i < array.length; i++) {
			  if(array[i] < array[i-1]) {
				  isNonDecreasing = false;
			  }
			  if(array[i] > array[i-1]) {
				  isNonIncreasing = false; 
			  }
		  }
		    return isNonIncreasing || isNonDecreasing ;
		  }
	  
	  public static void main(String[] args) {
		int[] arr = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
		System.out.println("is array monotonic: "+ isMonotonic(arr));
	}

}

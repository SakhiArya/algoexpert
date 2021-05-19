package com.coding.algoexpert.io;

public class Solution1 {

	
	public int soln(int[] A) {
		
		 if (A.length == 0 || A.length ==1) {
	            return A.length;
	        }

	        int startingIndex = 0;
	        int endingIndex = 0;
	        int[] locationVisitedCounter = new int[A.length];
	        locationVisitedCounter[A[0] - 1] = 1;

	        for (int i=1; i<A.length; i++)
	        {
	            int locationIndex = A[i] - 1;

	            locationVisitedCounter[locationIndex]++;

	            if (A[i] == A[i - 1])
	            {
	                continue;
	            }

	            endingIndex=i;

	            while (locationVisitedCounter[A[startingIndex] - 1] > 1)
	            {
	                locationVisitedCounter[A[startingIndex] - 1]--;
	                startingIndex++;
	            }

	        }

	        return endingIndex - startingIndex ;
	}
}

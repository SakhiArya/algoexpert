package com.coding.algoexpert.io;

import java.util.Arrays;

/*1) Sort both the arrays 
2) put pointers at the beginning of both the array
3) Evaluate absolute difference of both the numbers
4) if eqal to zero thats the smallest differnce elemenets of these two array 
5) else increment the pointer of the array which is smaller 
6) continue until you get a pair with a difference of zero or either of the array is exhausted.*/

public class SmallestDifference {
	
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int indexOne = 0;
		int indexTwo = 0;
		int smallestDifference = Integer.MAX_VALUE;
		int currentDifference = Integer.MAX_VALUE;
		int[] smallesDiffArr = new int[2];
		
		while(indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
			int numOne = arrayOne[indexOne];
			int numTwo = arrayTwo[indexTwo];
			if (numOne < numTwo) {
				currentDifference = numTwo - numOne;
				indexOne ++;
			}else if(numTwo < numOne) {
				currentDifference = numOne - numTwo;
				indexTwo++;
			}else {
				return new int[] {numOne, numTwo};
			}
			if(smallestDifference  > currentDifference) {
				smallestDifference = currentDifference;
				smallesDiffArr = new int[] {numOne, numTwo};
			}
		}
		return smallesDiffArr;
	}

}

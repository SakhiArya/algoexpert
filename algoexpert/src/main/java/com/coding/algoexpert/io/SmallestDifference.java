package com.coding.algoexpert.io;

import java.util.Arrays;

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

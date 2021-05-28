package com.coding.algoexpert.io;

//two pointer approach,
/* Compare the absolute values of these smallest and largest values,
place the square at the end of the output array filling it from right to left */

public class SortedSqauredArray {

	int[] sortedSquaredArray(int arr[]) {
		
		int smallestElementIndex = 0;
		int largestElementIndex = arr.length-1;
		int[] squaredArr = new int[arr.length];
		
		for(int j= squaredArr.length -1; j >= 0; j--) {
			
			int smallestElement = arr[smallestElementIndex] ;
			int largestElement = arr[largestElementIndex];
			int squaredValue;
			if(Math.abs(smallestElement) > Math.abs(largestElement)) {
				squaredValue =  smallestElement * smallestElement;
				smallestElementIndex++;
			}else {
				 squaredValue = largestElement * largestElement ;
				 largestElementIndex --;	
			}
			squaredArr[j] = squaredValue;
		}
		return squaredArr;
	}
}

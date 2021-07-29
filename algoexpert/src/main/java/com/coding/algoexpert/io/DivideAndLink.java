package com.coding.algoexpert.io;

public class DivideAndLink {

	public int solution(int[] A) {
		int minValue = Integer.MAX_VALUE;
		int size = A.length;
	
		// Min Len
		if(size<5){
			return -1;
		}
		for(int i = 1 ; i < size-3 ; i++){
			for(int j = i+2 ; j < size-1 ;j++){
				int currMin = A[i]+A[j];
				if(minValue > currMin){
					minValue = currMin;
				}
			}
		}
			return minValue;
		}


}

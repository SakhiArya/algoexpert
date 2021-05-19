package com.coding.algoexpert.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ThreeSumNumber {
	
	
	public static List<Integer[]> threeNumberSum(int[] arr, int targetSum){
		
		Arrays.sort(arr);
		List<Integer[]> result = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			int current = arr[i], left = 0, right = arr.length-1;
			while(left < right) {
				long sum = current + arr[left] + arr[right];
				if(sum == targetSum) {
					Integer[] validTriplet = {current, arr[left], arr[right]};
					Arrays.sort(validTriplet);
					result.add(validTriplet);
					left ++;
					right --;
				}else if(sum < targetSum) {
					left ++;
				}else {
					right --;
				}
			}
		}
		return result;
	}

}

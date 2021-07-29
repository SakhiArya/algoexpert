package com.coding.algoexpert.io;

public class MaximumSubarray {
	
	   public int maxSubArray(int[] nums) {
		   
		   int curMax = nums[0];
		   int ovMax = nums[0];
		   
		   for(int i = 1; i < nums.length; i++) {
			   curMax = Math.max(nums[i], curMax+ nums[i]);
			   ovMax = Math.max(ovMax, curMax);
		   }
		   return ovMax;
	   }

}

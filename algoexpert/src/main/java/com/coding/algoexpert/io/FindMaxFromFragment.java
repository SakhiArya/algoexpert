package com.coding.algoexpert.io;

public class FindMaxFromFragment {
	
	 public static int solution(String S) {
	        int maxNumber = Integer.MIN_VALUE;
	        int size = S.length();
	    	// Min Size
	    	if(size<2)
	    	{
	    		return 0;
	    	}
	        for(int i = 1 ; i < size ; i++){
	            String tmp = S.substring(i-1,i+1);
	            System.out.println("tmp: "+tmp);
	            int curr = Integer.parseInt(tmp);
	            if(maxNumber < curr){
	                maxNumber = curr;
	            }
	        }
	        return maxNumber;
	    }

	    public static void main(String[] args) {
	        String s = "50552";
	        int max = solution(s);
	        System.out.println(max);
	    }

}

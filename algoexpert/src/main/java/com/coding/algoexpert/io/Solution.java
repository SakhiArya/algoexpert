package com.coding.algoexpert.io;


class Solution {
    public int[] solution(int N) {
       
    	int[] counterExample = new int[N-1];
        int min = 1;
        int max = 1000;
    	
    	for(int i = 0; i< N-1; i++) {
    		int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
    		counterExample[i] = randomInt;
    	}
    	return counterExample;
    }
}
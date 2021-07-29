package com.coding.algoexpert.io;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinimumCharacterRequiredToremove {

	public int solution(String S) {

		int strLen = S.length();
		char[] str = S.toCharArray();

		// storing frequency of chars
		HashMap<Character, Integer> charFrequency = new HashMap<>();

		// to get the largest frequency
		PriorityQueue<Integer> charFrequencyForPriorityQueue = new PriorityQueue<>((x, y) -> Integer.compare(y, x));

		// stores the minimum count of chars required to delete
		int countChar = 0;

		for (int index = 0; index < strLen; index++) {

			if (charFrequency.containsKey(str[index])) {
				charFrequency.put(str[index], charFrequency.get(str[index]) + 1);
			} else {
				charFrequency.put(str[index], 1);
			}
		}

		for (Map.Entry<Character, Integer> iterator : charFrequency.entrySet()) {
			charFrequencyForPriorityQueue.add(iterator.getValue());
		}

		while (!charFrequencyForPriorityQueue.isEmpty()) {

			int frequent = charFrequencyForPriorityQueue.peek();
			charFrequencyForPriorityQueue.remove();

			// If charFrequencyForPriority is empty

			if (charFrequencyForPriorityQueue.isEmpty()) {
				
				return countChar;
			}
			if (frequent == charFrequencyForPriorityQueue.peek()){
				
				if (frequent > 1){
					charFrequencyForPriorityQueue.add(frequent - 1);
				}
				countChar++;
			}
		}
		return countChar;
	}
}

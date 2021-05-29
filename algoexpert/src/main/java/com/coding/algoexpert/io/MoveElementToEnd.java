package com.coding.algoexpert.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
	
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		int idx = 0;
		
		 for(int i = 0; i < array.size(); i++) {
			 if(array.get(i) == toMove) {
				 idx = i;
				 break;
			 }
		 }
		 if(idx == array.size()-1) {
			 return array;
			 
		 }
		 
		 System.out.println("idx: "+idx);
		 
		 for(int i = idx+1; i < array.size(); i++) {
			 
			 if(array.get(i) != array.get(idx)) {
				 int temp = array.get(i);
				 array.set(i, array.get(idx));
				 array.set(idx, temp);
				 idx++;
				 
			 }
			 
		 }
			return array;
	  }
	
	public static void main(String[] args) {
		List<Integer>  arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(2);
		arr.add(8);
		arr.add(9);


		
		List<Integer>  list = moveElementToEnd(arr, 2);
		System.out.println(list);
	}

}

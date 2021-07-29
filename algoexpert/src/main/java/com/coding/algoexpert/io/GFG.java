package com.coding.algoexpert.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

class GFG implements Comparable<GFG>{

	public static void print2D(int mat[][]) {
		// Loop through all rows
		for (int i = 0; i < mat.length; i++)

			// Loop through all elements of current row
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
	}

	public static void main(String args[]) throws IOException {
		
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        
        String[] sentencesList = new String[100];
        String string = "abc.abc!abc?".replace('.', '|').replace('!', '|').replace('?', '|');;

        System.out.println(string);
//
//        ArrayList<Integer> s=new ArrayList<>(4);
//        
//         
//        s.add(1);
//        s.add(2);
//        s.add(0);
//        s.remove(0);
//        s.add(3,3);
//        System.out.println(s);
//        
//        
//        System.out.println("mat.length"+ mat.length);
//        System.out.println("mat.length 0: "+ mat[0].length);
//        System.out.println("mat.length 1: "+ mat[1].length);

		//print2D(mat);
	}

	@Override
	public int compareTo(GFG o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
package com.coding.algoexpert.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedIntervals {

    public int[][] mergeOverlappingIntervals(int[][] intervals) {

        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = sortedIntervals[0];

        for(int[] nextInterval: sortedIntervals){
            int nextIntervalStart = nextInterval[0];
            int nextIntervalEnd = nextInterval[1];
            int currentIntervalEnd = currentInterval[1];

            if(currentIntervalEnd >= nextIntervalStart){
                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
            } else{
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }

        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

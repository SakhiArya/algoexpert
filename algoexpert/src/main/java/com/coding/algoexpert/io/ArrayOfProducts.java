package com.coding.algoexpert.io;

public class ArrayOfProducts {

    public static int[]  arrayOfProducts(int[] array) {
            int[] products = new int[array.length];

            int leftRunningProduct = 1;
            for(int i = 0; i < array.length; i++){
                products[i] = leftRunningProduct;
                leftRunningProduct *= array[i];
            }


            int rightRunningProduct = 1;
            for(int i = array.length -1; i >= 0; i--){
                products[i] *= rightRunningProduct;
                rightRunningProduct *= array[i];
            }

            return products;
        }

    public static void main(String[] args) {
        int[] array = new int[]{5,1,4,2};
       // int[] array = new int[]{0,0,0,0};
        int result[] = arrayOfProducts(array);
        for(int i : result){
            System.out.print(i+",");
        }
    }
}

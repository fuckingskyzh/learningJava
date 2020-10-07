package com.pingan.rework;

public class booSort {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,10,45,78,101,203,500};
        int temp=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i :arr) {
            System.out.println(i);
        }
    }
}

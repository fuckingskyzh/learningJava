package com.pingan.wqrg;

public class Sort {
    public static void main(String[] args) {
        int[] array = {1,4,7,9,10,45,78,101,203,500};
        int index = binarySearch(array, 78);
        System.out.println(index);
    }
    public static int binarySearch(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int middle = (low+high)/2;
            if (x==arr[middle]){
                return middle;
            }else if (x<arr[middle]){
                high=middle-1;
            }else {
                low=middle+1;
            }
        }
        return -1;
    }
}

package com.pingan.rework;

public class binSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,10,45,78,101,203,500};
        int index = binarySearch(arr,78);
        System.out.println(index);
    }
    public static int binarySearch(int[] arr,int x){
        int low = 0;
        int hight = arr.length-1;
        while (low<=hight){
            int middle = (low+hight)/2;
            if (x==arr[middle]){
                return middle;
            }else if (x<arr[middle]){
                hight=middle-1;
            }else {
                low=middle+1;
            }
        }
        return -1;
    }
}

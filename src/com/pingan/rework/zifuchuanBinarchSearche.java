package com.pingan.rework;

public class zifuchuanBinarchSearche {
    public static void main(String[] args) {
        char[] arr={'a','b','c','d','e','f','g'};
        int index = binarySearch(arr,'d');
        System.out.println(index);
    }
    public static int binarySearch(char[] arr,char x){
        int low=0;
        int hight = arr.length-1;
        while (low<=hight){
            int middle = (low+hight)/2;
            if (x==arr[middle]){
                return middle;
            }
        }
        return 1;
    }
}

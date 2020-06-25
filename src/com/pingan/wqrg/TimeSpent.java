package com.pingan.wqrg;

public class TimeSpent {
    public static void main(String[] args) {
        /*long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 1; i <=1000 ; i++) {
            sum =sum+i;
        }
        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);*/


        String str="";
        long starTime=System.currentTimeMillis();
        //计算循环10000的时间
        for(int i=0;i<100000;i++){
            str=str+i;
        }
        long endTime=System.currentTimeMillis();
        long Time=endTime-starTime;
        System.out.println(Time);

        StringBuilder bulider=new StringBuilder("");
        starTime=System.currentTimeMillis();
        for(int j=0;j<100000;j++){
            bulider.append(j);
        }
        endTime=System.currentTimeMillis();
        Time=endTime-starTime;
        System.out.println(Time);
    }
}

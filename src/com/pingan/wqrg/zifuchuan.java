package com.pingan.wqrg;

public class zifuchuan {
    public static void main(String[] args) {
        String jobIds = "c0001,c0002,c0003,c0005,c0006,c0007";
        String[] split = jobIds.split(",");
        System.out.println(split.length);
        System.out.println(split[split.length-1]);

    }
}

package com.pingan.wqrg;

public class nine {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        int sum = 0;
        // 控制列
        for (int i = 1; i <= 9; i++) {
            // 循环完一行重置sum
            sum = 0;
            // 控制行
            for (int j = 1; j <= i; j++) {
                sum = i * j;
                System.out.print(j + "*" + i + "=" + sum);
                // 输入空格隔开
                System.out.print(" ");
            }
            // 循环完一行就换行
            System.out.println("");

        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-starTime)+"ms");
    }
}
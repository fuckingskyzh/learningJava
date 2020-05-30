package com.pingan.wqrg;

import java.util.ArrayList;
import java.util.HashSet;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list.size());
        HashSet<String> strings = new HashSet<>(list);
        Boolean result = strings.size()==list.size() ? true:false;
        System.out.println(result);
    }
}

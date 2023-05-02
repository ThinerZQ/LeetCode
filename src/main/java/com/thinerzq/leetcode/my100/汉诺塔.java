package com.thinerzq.leetcode.my100;

import java.util.ArrayList;
import java.util.List;

public class 汉诺塔 {

    public static void main(String[] args) {

        List<String> source  = new ArrayList<>();
        source.add("5");
        source.add("4");
        source.add("3");
        source.add("2");
        source.add("1");

        List<String> target = new ArrayList<>();
        hanuoi(source,new ArrayList<>(),target);

        target.stream().forEach(System.out::println);


    }
    public static void hanuoi(List<String> a,List<String> b,List<String> c){


        move(a.size(),a,b,c);
        return ;


    }
    public static void move(int size , List<String> source,List<String> middle,List<String> target){
        if (size==1){
            target.add(source.remove(source.size()-1));
            return;
        }
        move(size-1,source,target,middle);
        target.add(source.remove(source.size()-1));

        move(size-1,middle,source,target);
        return;

    }
}

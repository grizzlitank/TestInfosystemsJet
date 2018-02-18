package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainMiddle {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(45);
        list.add(64);
        list.add(-2);
        list.add(988);
        list.add(100);

        MainMiddle mainMiddle = new MainMiddle();
        System.out.println(mainMiddle.first(list, 10));

        System.out.println(mainMiddle.second("aaabbbcccdegfffffffffffffffffff"));
        System.out.println(mainMiddle.third("1f2g142c1e"));

    }

    public int first(List<Integer> list, int n){
        Set<Integer> treeList = new TreeSet<Integer>(list);
        List<Integer> nList = new ArrayList<Integer>(treeList);
        return nList.get(n-1);
    }

    public String second(String s){
        char[] chars = s.toCharArray();
        String b = "";
        int counter = 0;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] == chars[i-1])counter++;
            else {
                b +="" + counter + chars[i-1];
                counter = 1;
            }
        }
        if(chars[chars.length-1] == chars[chars.length-2]){
            b +="" + counter + chars[chars.length-1];
        } else{
            b +="" + 1 + chars[chars.length-1];
        }
        return b;
    }

    public String third(String s){
        char[] chars = s.toCharArray();
        String b = "";
        String counter = "";
        for(int i = 0; i < chars.length; i++){
            if(chars[i]>= 48 && chars[i]<=57) {
                counter+="" + chars[i];
            }else{
                for (int j = 0; j < Integer.parseInt(counter); j++) {
                    b += "" + chars[i];
                }
                counter="";
            }
        }

        return b;
    }

}

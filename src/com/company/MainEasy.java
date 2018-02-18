package com.company;

import java.util.ArrayList;
import java.util.List;

public class MainEasy {

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
        MainEasy main = new MainEasy();
        System.out.println(main.first(list));
        int x = 5;
        main.second(x);
        System.out.println(main.third("пидарадип"));
        main.fourth2(84);
        System.out.println(main.fifth("жопопочка", "поп"));
    }

    public int first(List<Integer> list){
        int i = 0;
        for(Integer a : list){
            if(a>i)i=a;
        }
        int j = 0;
        for(Integer a : list){
            if(a>j && a<i)j=a;
        }
        return j;
    }

    public void second(int x){
        double sqrt = Math.sqrt(x);
        int currentValue = x;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (currentValue != 1)
        {
            System.out.println(currentValue);
        }
    }



    public Boolean third(String A){

        StringBuilder B = new StringBuilder(A);
        B = B.reverse();
        String C = new String(B);
        return C.equalsIgnoreCase(A);
    }

    public void fourth(int a){
        if(a>7) {
            int five = 0;
            int three = 0;
            if (a % 10 == 1) {
                five = (a - 6)/5;
                three = 2;
            }
            if (a % 10 == 2) {
                five = (a - 12)/5;
                three = 4;
            }
            if (a % 10 == 3) {
                five = (a - 3)/5;
                three = 1;
            }
            if (a % 10 == 4) {
                five = (a - 9)/5;
                three = 3;
            }
            if (a % 10 == 5) {
                five = a/5;
                three = 0;
            }
            if (a % 10 == 6) {
                five = (a - 6)/5;
                three = 2;
            }
            if (a % 10 == 7) {
                five = (a - 12)/5;
                three = 4;
            }
            if (a % 10 == 8) {
                five = (a - 3)/5;
                three = 1;
            }
            if (a % 10 == 9) {
                five = (a - 9)/5;
                three = 3;
            }
            if (a % 10 == 0) {
                five = a/5;
                three = 0;
            }
            System.out.println("По 5 копеек " + five + " монет");
            System.out.println("По 3 копейки " + three + " монет");
        }
    }

    public void fourth2(int a){
        if(a>4) {
            int seven = 0;
            int five = 0;
            int three = 0;
            if (a % 10 == 1) {
                five = (a - 6)/5;
                three = 2;
            }
            if (a % 10 == 2) {
                five = (a - 7)/5;
                seven = 1;
            }
            if (a % 10 == 3) {
                five = (a - 3)/5;
                three = 1;
            }
            if (a % 10 == 4) {
                five = (a - 14)/5;
                seven = 2;
            }
            if (a % 10 == 5) {
                five = a/5;
                three = 0;
            }
            if (a % 10 == 6) {
                five = (a - 6)/5;
                three = 2;
            }
            if (a % 10 == 7) {
                five = (a - 7)/5;
                seven = 1;
            }
            if (a % 10 == 8) {
                five = (a - 3)/5;
                three = 1;
            }
            if (a % 10 == 9) {
                five = (a - 9)/5;
                three = 3;
            }
            if (a % 10 == 0) {
                five = a/5;
                three = 0;
            }
            System.out.println("По 5 копеек " + five + " монет");
            System.out.println("По 3 копейки " + three + " монет");
            System.out.println("По 7 копейки " + seven + " монет");
        }
    }

    public Boolean fifth(String a, String b){
        return a.contains(b);

    }


}

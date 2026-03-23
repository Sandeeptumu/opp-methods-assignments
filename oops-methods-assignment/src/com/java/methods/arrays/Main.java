package com.java.methods.arrays;

public class Main {
    public static void main(String[] args) {
        int[] ids;
        ids = new int[5];
        System.out.println(ids[0]);

        ids[0] = 101;
        ids[1] = 102;
        ids[2] = 103;
        ids[3] = 104;
        ids[4] = 105;

        System.out.println(ids.length);
        for (int index = 0; index < ids.length; index++) {
            System.out.println(ids[index]);
        }

        for (int id : ids) {
            System.out.println(id);
        }

        for (int i = 0; i < ids.length; i++) {
            ids[i] += 10000;
        }

        for (int id : ids) {
            System.out.println(id);
        }

        float[] prices = {200.F,250.F,300.F,350.F,400.F};

        for (float price : prices){
            System.out.println(price);
        }
    }
}

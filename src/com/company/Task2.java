package com.company;

public class Task2 {

    public static void main(String[] args) {

        int m1[] = new int[20];
        int m2[] = new int[20];
        for (int i = 0; i < 20; i++) {
            m1[i] = (int) Math.round(Math.random() * 9);
            System.out.print("1)" + m1[i] + ", ");
            m2[i] = m1[i];


            if (m1[i] % 2 != 0) {
                m2[i] = m2[i] * 0;
            }
            System.out.println("2)" + m2[i] + ", ");


        }
    }
}








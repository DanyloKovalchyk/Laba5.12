package com.company;

public class Task4 {
    public static void main(String[] args) {
        int m1[] = new int[10];
        int m2[] = new int[10];
        int m3[] = new int[10];

        for (int i = 0; i < 10; i++) {

            m1[i] = (int) Math.round(Math.random() * 10);

            System.out.println("Перший елемент: "+m1[i]);

            m2[i] = (int) Math.round(Math.random() * 10);
            System.out.println("Другий елемент: " + m2[i]);
            m3[i] = m2[i] + m1[i];

            System.out.println("Сума: " + m3[i]);
        }

    }
}

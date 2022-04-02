package com.company;

public class Task6 {

    public static void main(String[] args) {
        int[][] m = new int[15][];
        m [0] = new int [5];
        m [1] = new int [5];
        m [2] = new int [5];
        m [3] = new int [5];
        m [4] = new int [8];
        m [5] = new int [8];
        m [6] = new int [8];
        m [7] = new int [8];
        m [8] = new int [3];
        m [9] = new int [3];
        m [10] = new int [3];
        m [11] = new int [3];
        m [12] = new int [9];
        m [13] = new int [9];
        m [14] = new int [9];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=(int)(Math.random()*15);
                System.out.print(m[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}


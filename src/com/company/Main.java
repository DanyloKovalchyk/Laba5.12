package com.company;

public class Main {

    public static void main(String[] args) {
        int a=0;
        for(int i=1;i <=99;i++){
            if(i%2!=0)a++;
        }

        int[] m = new int[a];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                m[b]=i;
                System.out.println(m[b]+" ");
                b++;
            }
        }
    }
}





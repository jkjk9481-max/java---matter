package com.example.test;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();
        int[] num = new int[number];


        for(int i = 0; i < num.length; i++){
            System.out.println("숫자를 입력하세요 : ");
            num[i] = sc.nextInt();
        }
        int max = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("가장 큰 수 : " + max);
    }
}

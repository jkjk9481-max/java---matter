package com.example.test;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int num = sc.nextInt();

        boolean flag = true;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        System.out.println("소수 확인 : " + flag);
    }
}

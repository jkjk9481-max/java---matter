package coadingtest;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 문자열을 입력하세요 (예: -1234): ");
        String s = sc.next();

        Integer integer = Integer.parseInt(s);
        System.out.println(integer);


    }
}

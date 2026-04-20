package coadingtest;

import java.util.Scanner;

public class SumDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 : ");
        int N = sc.nextInt();
        int ans = 0;

        while(N > 0){
            ans += N % 10;
            N = N / 10;
        }
        System.out.println(ans);
    }
}

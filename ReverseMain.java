package test.ex4;

import java.util.Scanner;

public class ReverseMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        ReverseMain.reverse(num);

    }

    public static void reverse(int num) {
        int result = 0;

        while(num > 0){
            int remainder =  num % 10;
            result =  result * 10 + remainder;
            num = num / 10;
        }
        System.out.println("뒤집은 숫자 : " + result);
    }
}

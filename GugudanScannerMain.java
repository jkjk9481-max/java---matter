package test.ex1.ex3;

import java.util.Scanner;

public class GugudanScannerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단을 입력하세요 : ");
        int dan = scanner.nextInt();

        GugudanScannerMain.guguDan(dan);


    }

    public static void guguDan(int num){
            if(num < 2 || num > 9){
                System.out.println("잘못된 입력입니다");
                return;
            }

            for(int i = 1; i < 10; i++){
                System.out.println(num + " * " + i + " = " + num*i);
            }
        }
    }

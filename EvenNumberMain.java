package test.ex1.ex3;

import java.util.Scanner;

public class EvenNumberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 : ");
        int num = scanner.nextInt();

        EvenNumberMain.evenNumber(num);

    }

    public static void evenNumber(int N){
        int sum = 0;
        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("짝수의 합 : " + sum);
    }
}

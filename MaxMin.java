package test.ex4;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.println("숫자를 입력하세요 : ");
            arr[i] = sc.nextInt();
        }

        MaxMin.max(arr);
        MaxMin.min(arr);
    }

    public static void max(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("최대값 : " + max);
    }

    public static void min(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("최소값 : " + min);
    }
}

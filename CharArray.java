package test.ex4;

import java.util.Scanner;

public class CharArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요 : ");
        String str = sc.nextLine();
        char[] arr = str.toLowerCase().toCharArray();

        CharArray.charCount(arr);

    }

    public static void charCount(char[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o'  || arr[i] == 'u') {
                count++;
            }
        }
        System.out.println("모음 개수 : " + count);
    }
}

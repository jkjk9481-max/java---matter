package test.ex1.ex3;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapMain {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("문자를 입력하세요 : ");
       String str = sc.nextLine();

       HashMap<String , Integer> map = new HashMap<>();
       String[] words = str.split(" "); // 공백 기준으로 쪼개기

       int count = 0;
       for(String word : words){
           if(map.containsKey(word)){
               map.put(word , map.get(word) + 1);
           }else{
               map.put(word , 1);
           }
       }
       for(String key : map.keySet()){
           System.out.println(key + " : " + map.get(key));
       }
    }
}

package com.example.test;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {

    public static void main(String[] args) {
        String str = "banana";
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        for(int i = 0; i < str.length(); i++){
            String s = String.valueOf(str.charAt(i)); // 한 글자씩 꺼내기 -> str.charAt가 char형이기떄문에 변환해주기 위해 String.valueOf를 씀
            set.add(s); // 중복은 자동으로 제거됨
        }
        System.out.println(set);
    }
}

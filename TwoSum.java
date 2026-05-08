package com.example.test;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum ts =  new TwoSum();
        int[] result = ts.solution(new int[]{2 , 7 , 11 , 15} , 9);
        System.out.println(result[0] + " , " + result[1]);
    }

    public int[] solution(int[] numbers , int target){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum =  numbers[i] + numbers[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}

package test.ex1.ex2;

import java.util.Scanner;

public class charMain {
    public static void main(String[] args) {
        // Scanner를 이용해 사용자로부터 단어를 입력받을 준비를 합니다.
        Scanner sc = new Scanner(System.in);

        // 1단계: 단어를 입력받자마자 toUpperCase()를 써서 전부 대문자로 변환합니다.
        String str = sc.next().toUpperCase();

        // 2단계: 알파벳 빈도수를 저장할 26칸짜리 정수 배열을 만듭니다. (기본값은 모두 0)
        int[] arr = new int[26];

        // 3단계: 문자열의 길이만큼 돌면서 알파벳 개수를 카운트합니다.
        for (int i = 0; i < str.length(); i++) {
            // 아스키코드의 원리를 이용해 'A'를 빼서 0~25 사이의 인덱스로 만듭니다.
            arr[str.charAt(i) - 'A']++;
        }

        int max = -1; // 최댓값을 찾기 위한 변수 세팅
        char answer = '?'; // 정답 문자를 담을 변수 (기본값 '?')

        // 4단계: 26칸의 배열을 확인하며 가장 많이 나온 알파벳을 찾습니다.
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i]; // 더 큰 숫자가 나오면 최댓값 갱신
                answer = (char) (i + 'A'); // 인덱스 번호에 다시 'A'를 더해 문자로 복원
            } else if (arr[i] == max) {
                answer = '?'; // 최댓값과 똑같은 빈도의 알파벳이 또 있다면 '?'로 변경
            }
        }

        // 최종 결과 출력
        System.out.println(answer);
    }
}

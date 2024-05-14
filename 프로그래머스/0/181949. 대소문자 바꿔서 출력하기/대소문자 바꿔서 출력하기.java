import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //입력 받은 문자열
        String result = ""; // 변환된 문자열을 저장할 변수
        
        // 입력된 문자열의 각 문자를 순회
        for (char ch : a.toCharArray()) {
            // 대문자면 소문자로 변환하여 결과에 추가
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } 
            // 소문자면 대문자로 변환하여 결과에 추가
            else {
                result += Character.toUpperCase(ch);
            }
        }
        
        // 변환된 결과 출력
        System.out.println(result);
    }
}
/*
 * 1. 문자 찾기
 */
import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        //문자열, 문자 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        //문자열, 문자 소문자로 만들기
        str = str.toLowerCase();
        c = Character.toLowerCase(c);
        
        //반복문으로 문자열을 한글자씩 문자와 비교하여 같으면 카운트
        int answer = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == c) answer++; 
        }
        
        System.out.println(answer);
        sc.close();
    }
}
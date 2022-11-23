import java.util.Scanner;

/*
 * 2. 대소문자 변환
 */
public class String02 {
    public static void main(String[] args) {
        //문자열 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //반복문으로 한글자씩 대소문자 판단 후 대소문자 바꿔주기
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) answer = answer + Character.toLowerCase(c);
            else answer = answer + Character.toUpperCase(c);
        }

        System.out.println(answer);
        sc.close();
    }
}
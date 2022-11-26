import java.util.Scanner;

/*
 * 9. 숫자만 추출
 */
public class String09 {
    public static void main(String[] args) {
        //문자열 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String num = "";

        //숫자만 골라내서 문자열로 만들기
        for (int i=0; i<str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                num = num + str.charAt(i);
            }
        }
        
        //숫자로 된 문자열을 정수형으로 변환
        int answer = Integer.parseInt(num);
        System.out.println(answer);
        sc.close();
    }
}

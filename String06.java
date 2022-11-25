import java.util.ArrayList;
import java.util.Scanner;

/*
 * 6. 중복문자제거
 */
public class String06 {
    public static void main(String[] args) {
        //문자열 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //어레이리스트 생성
        ArrayList<Character> list = new ArrayList<>();

        //중복체크하면서 리스트에 문자 하나씩 저장
        for (int i=0; i<str.length(); i++) {
            if(!list.contains(str.charAt(i))) {
                list.add(str.charAt(i));
            }
        }

        //문자열로 가공하여 출력
        String answer = list.toString()
                        .replace("[", "")
                        .replace(",", "")
                        .replace("]", "")
                        .replace(" ", "");

        System.out.println(answer);
        sc.close();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 5. 특정 문자 뒤집기
 */
public class String05 {
    public static void main(String[] args) {
        //문자열 입력받아 배열 생성
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        //어레이리스트 생성
        ArrayList<Character> list = new ArrayList<>();

        //어레이리스트에 알파벳 거꾸로 삽입
        for (int i=0; i<arr.length; i++) {
            if (Character.isAlphabetic(arr[i])) list.add(0, arr[i]);
        }

        //어레이리스트에 특수문자 삽입
        for (int i=0; i<arr.length; i++) {
            if (!Character.isAlphabetic(arr[i])) list.add(i, arr[i]);
        }

        //어레이리스트를 문자열로 변환 및 불필요한 문자와 공백 제거
        String answer = list.toString();
        answer = answer
            .replace("[", "")
            .replace("]", "")
            .replace(",", "")
            .replace(" ", "");
            
        System.out.println(answer);
        sc.close();
    }
}
import java.util.Scanner;
import java.util.ArrayList;

/*
 * 8. 유효한 팰린드롬
 */
public class String08 {
    public static void main(String[] args) {
        /*
         * 문자열 입력받기
         * next()는 한 단어, nextLine()은 한 라인
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //문자열 알파벳 소문자로 통일하기 
        str = str.toLowerCase();

        //알파벳 골라담을 리스트 생성
        ArrayList<Character> list = new ArrayList<>();

        //리스트에 알파벳만 담기
        for (int i=0; i<str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                list.add(str.charAt(i));
            }
        }

        //리스트 크기 담은 변수와 빈 문자열 변수 2개 생성
        int len = list.size();
        String front = "";
        String back = "";

        //앞 문자열과 뒤 문자열을 뒤집은 문자열 저장
        for (int i=0, y=len-1; i<(len/2); i++) {
            front = front + list.get(i);
            back = back + list.get(y);
            y--;
        }

        //두 문자열이 같으면 YES, 다르면 NO
        if (front.equals(back)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
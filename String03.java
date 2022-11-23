import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 3. 문장 속 단어
 */
public class String03 {
    public static void main(String[] args) {
        //문자열 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //문자열 공백으로 자르고 개수 저장
        StringTokenizer st = new StringTokenizer(str, " ");
        int cnt = st.countTokens();

        //첫 문자열을 저장하고 하나씩 비교하여 가장 큰 문자열 저장
        String token = st.nextToken();
        for (int i=1; i<cnt; i++) {
            String temp = st.nextToken();
            if (token.length() < temp.length()) token = temp;
        }

        System.out.println(token);
        sc.close();
    }
}
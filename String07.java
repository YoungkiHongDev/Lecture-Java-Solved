import java.util.Scanner;

/*
 * 7. 회문 문자열
 */
public class String07 {
    public static void main(String[] args) {
        //문자열 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //문자열 소문자로 통일하기
        str = str.toLowerCase();

        //뒤집은 문자열 저장하기
        String comp = "";
        for (int i=str.length()-1; i>=0; i--) {
            comp = comp + str.charAt(i);
        }

        //원본 문자열과 뒤집은 문자열을 비교하여 같으면 YES, 다르면 NO
        if (str.equals(comp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }    
}

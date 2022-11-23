import java.util.Scanner;

/*
 * 4. 단어 뒤집기
 */
public class String04 {
    public static void main(String[] args) {
        //단어 개수 입력받기
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        //단어 입력받기
        for (int x=0; x<cnt; x++) {
            String str = sc.next();
            String answer = "";
            
            //단어 뒤집기
            for (int y=str.length()-1; y>=0; y--) {
                answer = answer + str.charAt(y);
            }
            System.out.println(answer);
        }
        sc.close();
    }
}
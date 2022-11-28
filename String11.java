import java.util.Scanner;

/*
 * 11. 문자열 압축
 */
public class String11 {
    public static void main(String[] args) {
        
        //문자열 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "";
        int cnt = 0;
        
        //문자열 압축하는 반복문
        for (int i=0; i<str.length(); i++) {

            //첫 문자 추가하고 카운트하고 다음으로 넘어가기
            if (i==0) {
                answer += str.charAt(i);
                cnt++;
                continue;
            }

            //앞문자와 같을 경우 카운트
            if (str.charAt(i-1) == str.charAt(i)) {
                cnt++;

            //앞문자와 다를 경우
            } else {

                //카운트가 1이라면 문자 추가
                if (cnt==1) {
                    answer += str.charAt(i);

                //카운트가 1보다 크면 현재 카운트와 문자를 추가하고 카운트 1로 초기화
                } else if (cnt>1) {
                    answer += cnt;
                    answer += str.charAt(i);
                    cnt = 1;
                }
            }
        }

        //마지막 문자 카운트가 1보다 컸으면 카운트를 문자로 추가
        if (cnt>1) {
            answer += cnt;
        }

        System.out.println(answer);
        sc.close();
    }
}
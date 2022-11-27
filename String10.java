import java.util.Arrays;
import java.util.Scanner;

/*
 * 10. 가장 짧은 문자거리
 */
public class String10 {
    public static void main(String[] args) {
        //문자열과 문자 입력받기
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String[] str = input[0].split("");
        String target = input[1];

        //길이 변수와 숫자를 담을 배열 생성
        int len = str.length;
        int[] answer = new int[len];

        //앞에서부터 돌며 숫자를 저장할 반복문
        int point = 0;
        for (int i=0; i<len; i++) {
            if (i==0) {
                answer[0] = point;
            }

            if (str[i].equals(target)) {
                point = 0;
                answer[i] = point;
            } else {
                point++;
                answer[i] = point;
            }
        }

        //뒤에서부터 돌며 숫자를 저장할 반복문
        for (int i=len-1; i>=0; i--) {
            if (str[i].equals(target)) {
                point = 0;
            } else {
                point++;
                if (answer[i] > point) {
                    answer[i] = point;
                }

                if (i==0) {
                    answer[i] = point;
                }
            }
        }

        //출력할 문자열 가공
        String result = Arrays.toString(answer)
                        .replace("[", "")
                        .replace("]", "")
                        .replace(",", "");

        System.out.println(result);
        sc.close();
    }    
}
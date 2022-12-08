import java.util.Scanner;

/*
 * 5. 소수 (에라토스스테네스 체)
 */
public class Array05 {
    public static void main(String[] args) {
        //숫자 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //소수 체크에 사용할 배열과 변수 초기화
        int[] arr = new int[n+1];
        int answer = 0;

        //첫 소수인 2부터 시작
        //소수 개수를 카운트하고 그 소수와 배수는 모두 체크처리
        for (int i=2; i<n+1; i++) {            
            if (arr[i]==0) {
                answer++;
                for (int y=i; y<n+1; y=y+i) {
                    arr[y] = 1;
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
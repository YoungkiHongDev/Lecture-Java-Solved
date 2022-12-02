import java.util.Scanner;

/**
 * 4. 피보나치 수열
 */
public class Array04 {
    public static void main(String[] args) {
        //출력할 피보나치 수열의 수 입력받기
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();

        //수열 시작시 활용할 변수와 수열을 저장할 배열 생성
        int start = 1;
        int[] arr = new int[end];

        //수열 두번째까지는 1 저장 후 넘기기, 세번째부터 앞의 두 숫자를 더한 값 저장
        for (int i=0; i<end; i++) {
            if (i==0 || i==1) {
                arr[i] = start;
                continue;
            } else {
                arr[i] = arr[i-2] + arr[i-1];
            }
        }

        //저장한 수열 차례대로 출력하기
        for (int i=0; i<end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
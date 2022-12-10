import java.util.Scanner;

/*
 * 6. 뒤집은 소수
 * 숫자 받기 -> 숫자 뒤집기 -> 소수 판별 -> 소수 출력
 */
public class Array06 {
    //소수 판별 메소드
    public static boolean isPrime(int res) {
        //1이면 소수가 아니므로 false 리턴
        if (res == 1) return false;
        for (int i=2; i<res; i++) {
            //나머지가 0이면 소수가 아니므로 false 리턴
            if (res % i == 0) return false;
        }
        //소수면 true 리턴
        return true;
    }

    public static void main(String[] args) {
        //숫자의 개수와 숫자들 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //입력받은 숫자들 배열에 넣기
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //숫자 뒤집고 소수 판별
        for (int i=0; i<n; i++) {
            //숫자를 문자열로 형변환
            String num = Integer.toString(arr[i]);
            //숫자 문자열을 StringBuffer의 reverse() 메소드를 이용해 뒤집기
            String reverse = new StringBuffer(num).reverse().toString();
            //뒤집은 숫자 문자열을 정수형으로 변환
            int result = Integer.parseInt(reverse);
            //소수 판별이 true라면 출력 
            if (isPrime(result)) System.out.print(result + " ");
        }

        sc.close();
    }
}
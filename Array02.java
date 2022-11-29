import java.util.Scanner;

/*
 * 2. 보이는 학생
 */
public class Array02 {
    public static void main(String[] args) {
        //개수와 공백구분 숫자 문자열 입력받기
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");

        //cnt는 보이는 학생 카운트 변수, now는 현재까지 가장 큰 학생의 키
        //뒤 학생의 키가 더 클때마다 now에 저장하고 cnt 값 증가
        int cnt = 0; 
        int now = 0;
        for (int i=0; i<n; i++) {
            int key = Integer.parseInt(str[i]);
            if (now < key) {
                now = key;
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
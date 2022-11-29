import java.util.Scanner;

/**
 * 1. 큰 수 출력하기
 */
public class Array01 {

    public static void main(String[] args) {
        //개수, 공백구분 숫자 문자열 입력받기
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");

        //정수형으로 변환하여 배열에 저장하며, 첫 숫자 출력 후 바로 앞의 숫자보다 큰 숫자만 출력
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(str[i]);

            if (i==0) {
                System.out.print(nums[i]);

            } else if (i>0) {
                if (nums[i-1] < nums[i])
                System.out.print(" " + nums[i]);
            }
        }

        sc.close();
    }
}
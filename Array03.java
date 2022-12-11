import java.util.Scanner;

/*
 * 3. 가위 바위 보
 */
public class Array03 {
    public static void main(String[] args) {
        //게임판수, A가 낸 수, B가 낸 수 입력받기
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");

        //1가위 2바위 3보
        //13 21 32 A 출력
        //31 12 23 B 출력
        //11 22 33 D 출력
        for (int i=0; i<num; i++) {
            int c = Integer.parseInt(a[i] + b[i]);
            if (c == 13 || c == 21 || c == 32) {
                System.out.println("A");
            } else if (c == 31 || c == 12 || c == 23) {
                System.out.println("B");
            } else {
                System.out.println("D");
            }
        }

        sc.close();
    }
}
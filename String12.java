import java.util.Scanner;

/*
 * 12. 암호
 */
public class String12 {
    public static void main(String[] args) {
        //개수와 문자열 입력받기
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        
        //이진수 문자열을 저장할 변수, 결과 문자열을 저장할 변수 초기화
        String bin = "";
        String answer = "";

        //문자열의 각 문자를 #이면 1, *이면 0으로 변환하여 저장
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '#') {
                bin += "1";
            } else if (str.charAt(i) == '*') {
                bin += "0";
            }
        }

        //substring으로 문자열을 자르고 parseInt로 2진수를 10진수로 만든 후 아스키코드의 문자로 변환하여 합치기
        //7자리 이진수이므로 0, 7, 14부터 시작하게 i*7을 시작인덱스로 설정
        //시작인덱스의 +7을 끝 인덱스로 설정하여 끝인덱스-1 까지 자르도록 설정
        //parseInt의 두번째 인자를 2값을 주어 2진수를 10진수로 만들도록 설정
        //10진수를 char 변수에 넣어 아스키코드 문자 값이 나오도록 하여 합쳐줌
        for (int i=0; i<num; i++) {
            String stemp = bin.substring(i*7 , (i*7)+7);
            int ntemp = Integer.parseInt(stemp, 2);
            char ctemp = (char) ntemp;
            answer += ctemp;
        }

        System.out.println(answer);
        sc.close();
    }
}
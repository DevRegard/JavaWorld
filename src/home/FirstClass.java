package home;

import java.util.Scanner;

public class FirstClass
{
    public static void main(String[] args)
    {
        System.out.print("안녕하세요. 자바 월드에 오신 것을 환영합니다.\n\n");

        String home = "우리 집";
        String name = "UTRegard";
        String env = "MAC PRO 14.2`, M1 PRO";

        System.out.println("나는 " + home + "에 왔다.\n" +
                "내 이름은 " + name + ".\n" +
                env + " 라는 환경에서 살고 있지\n");

        System.out.println("자바 JDK 17버전 호환성 검증 종료\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("집 밖으로 나갈래?   ");
        String exitHome = scan.next();

        System.out.println("|" + exitHome + "|");
        if (exitHome.equals("나간다") == true) System.out.print("HOME 밖으로 나간다.");
        else System.out.print("HOME 안에 틀여박혀 있는다.");

        /*
        * 기호 사용 시, 유의할 점
        *   - '==' 기호는 a, b가 같은 객체인지 체크 하는 문자이다.
        *   - 문자열 검증: equal(), compare()
        *   - rf: https://codechacha.com/ko/java-string-compare/
         */
    }
}

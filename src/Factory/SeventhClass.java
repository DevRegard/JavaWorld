package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeventhClass
{
    private static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
//        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader bfr2 = new BufferedReader(new InputStreamReader(System.in));
//        String inputStr = bfr.readLine();
//        int inputInt = Integer.parseInt(bfr2.readLine());
//        System.out.println(inputStr);
//        System.out.println(inputInt);

//        powPow(inputInt);

        sb.append("나는 사실 개발 천재다");
        System.out.println(sb);
        plusString(sb);
    }

    // METHOD: 자기 자신 제곱
    public static void powPow(int n)
    {
        double nn = Math.pow(n, n);
        System.out.println(nn);
    }

    // METHOD: 특정 문자 자동 추가
    public static void plusString(StringBuffer sb){
        sb.append(" 는 뻥이야");
        System.out.println(sb);
    }
}

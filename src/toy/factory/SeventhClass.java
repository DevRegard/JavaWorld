package toy.factory;

import java.io.IOException;

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
        System.out.println(sb.capacity());
        limitString(sb);
        System.out.println("메모리 존재 여부 : " + sb);
    }

    // METHOD: 자기 자신 제곱
    public static void powPow(int n)
    {
        double nn = Math.pow(n, n);
        System.out.println(nn);
    }

    // METHOD: 특정 문자 자동 추가
    public static void plusString(StringBuffer sb)
    {
        sb.append(" 는 뻥이야");
        sb.append("\n라고 말한건 뻥이야^^");
//        sb.append("\n라고 말한건 뻥이야");
        System.out.println(sb);
    }

    // METHOD: 문자열 메모리 검증
    public static boolean limitString(StringBuffer sb)
    {
        if (sb.capacity() > 60)
        {
            System.out.println("[사용 가능 메모리 초과]");
            sb.delete(0, 60);
            System.out.println("[메모리 초기화 완료]");
            return false;
        }
        else
        {
            System.out.println("[사용 가능 메모리 정상]");
            sb.insert(0, "<검증 완료된 스트링> ");
            return true;
        }
    }
}

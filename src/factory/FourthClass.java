package factory;

import java.util.Scanner;

public class FourthClass
{
    private static Scanner scan = new Scanner(System.in);
    private static int[] realCode = new int[4];

    public static void main(String[] args)
    {
        // 보안 비밀번호 등록 후, 생성된 비밀번호 보기
        passCodeView(passRealCodeInsert());

        // 비밀번호 입력
        int[] code = passCodeInsert();
//      boolean code = passCheck(passCodeInsert());

        // 보안 코드 검증 및 보안문 통과 여부
        openTheDoor(passCheck(code));
//      openTheDoor(code);
    }

    public static int[] passRealCodeInsert()
    {
        System.out.print("생성할 비밀번호를 입력하세요 : ");
        for (int i = 0; i < realCode.length; i++)             // for (int i : pw) 의 차이점은?
            realCode[i] = scan.nextInt();
        return realCode;
    }

    public static int[] passCodeView(int[] pw)
    {
        for (int i = 0; i < pw.length; i++)
            System.out.println("[" + (i + 1) +"] 번째 비밀번호 : " + pw[i]);

        return pw;
    }

    public static int[] passCodeInsert()
    {
        System.out.print("보안문의 비밀번호를 입력하세요 : ");
        int[] pw = new int[4];
        for (int i = 0; i < pw.length; i++)             // for (int i : pw) 의 차이점은?
            pw[i] = scan.nextInt();
        return pw;
    }

    public static boolean passCheck(int[] pw)
    {
        boolean isPassTrue = false;
        for (int i = 0; i < pw.length; i++)
        {
            if (pw[i] == realCode[i])
            {
                System.out.println("[일치]");
                isPassTrue = true;
            }
            else System.out.println("[불일치]"); break;
        }
//        System.out.println(isPassTrue);
        return isPassTrue;
    }

    public static void openTheDoor(boolean isPassTrue)
    {
        if (isPassTrue == true) System.out.println("문이 열립니다. (끼이이잉)");
        else System.out.println("(삐익! 삐익! 삐익!) 침입자 입니다. \n당신은 갇힙니다.");
    }
}
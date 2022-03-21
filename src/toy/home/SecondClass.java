package toy.home;

import java.util.Scanner;

public class SecondClass
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("집 앞을 나와보니 무언가 있다. 무엇일까? ");

        ifNotThis(whatIs());
    }

    public static String whatIs()
    {
        String whatIs = scan.next();
        System.out.println(whatIs);
        return whatIs;
    }

    public static String ifNotThis(String thisIs)
    {
        String realThis = "";
        switch(thisIs)
        {
            case "고양이":
                realThis = "귀여운 고양이";
                break;
            case "강아지":
                realThis = "개 같은 바위";
                break;
            case "뭐지":
                realThis = "뭐야 이거 그거네~ (모름)";
                break;
            default:
                realThis = "아무것도 없는데?";
        }
        System.out.println("더 가까이 가서 살펴본다... 으아닛 이건!   " + realThis);
        return realThis;
    }
}

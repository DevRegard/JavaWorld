package toy.home;

import java.util.Scanner;

public class ThirdClass
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("길을 거닐고 있다. 힘들어 죽을 때 까지 달린다.");
        System.out.print("훅..훅.. 내가 얼마나 달렸지?   ");
//        km();
//        walkAndRun(km());
        isStop(walkAndRun(km()));
    }

    public static int[] km()
    {
        int km = scan.nextInt();
        int[] kmArea = new int[km];
        System.out.println("[지금까지 " + kmArea.length + "KM를 달렸다.]");
        return kmArea;
    }

    public static int[] walkAndRun(int[] kmArea)
    {
        for (int i = 0; i < kmArea.length; i++)
        {
            if (kmArea.length > 100) break;
            else System.out.println("헥.. 헥.. 헥헥.... ");
        }
        System.out.println("으아.. 힘들어 죽겠네");
        return kmArea;
    }

    public static boolean isStop(int[] km)
    {
        int Health = km.length;
        System.out.println("[너의 체력으로 최대 " + (Health + 11) + "KM 까지 갈 수 있다.]");
        System.out.println("[더 뒬 수 있는가?]");
        System.out.print("True? False?     ");
        boolean canIRun = scan.nextBoolean();

        if (canIRun == true) System.out.print("(나는 앞으로 26KM를 더 전진했다.) \n By the Way, ...");
        else System.out.print("(나는 여기서 쓰러지고 말았다..) \n And, Next day..");

        return canIRun;
    }
}
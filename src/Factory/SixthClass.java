package Factory;

public class SixthClass
{
    public static void main(String[] args)
    {
//        System.out.println(factorial(5));
//        System.out.println(factorial_2(5));
//        System.out.println(fibonacci(20));
//        System.out.println(fibonacci(30));
//        System.out.println(fibonacci(40));

        // TODO 시간복잡도 계산(1) :
        System.out.println(fibonacci(50));
        // TODO 시간복잡도 계산(2) :
        System.out.println(fibonacci(60));
    }

    public static int factorial(int n)
    {
       if (n <= 1) return n;
       else return factorial(n-1) * n;
    }

    public static int factorial_2(int n)
    {
        if (n == 1) return 1;
        return n * factorial_2(n - 1);
    }

    public static int fibonacci(int n)
    {
        System.out.println(n + "번째 연산");
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

/*
 * 재귀 함수 사용 이유
 *   - 목적성: 피보나치 등
 *   - 가독성: 팩토리얼 등
 */
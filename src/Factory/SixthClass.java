package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SixthClass
{
    public static void main(String[] args) throws IOException
    {
//        System.out.println(factorial(5));
//        System.out.println(factorial_2(5));
//        System.out.println(fibonacci(20));
//        System.out.println(fibonacci(30));
//        System.out.println(fibonacci(40));

        // 재귀 피보나치 함수 시간 복잡도 : O( 2^{n} )
        // TODO 시간복잡도 계산(1) : 2^50 = 1.125899906842624E15
//        System.out.println(fibonacci(50L));
        // TODO 시간복잡도 계산(2) : 2^60 = 1.15292150460684698E18
//        System.out.println(fibonacci(60));

        // TODO 시간복잡도 계산(3) : 2^100 = 1.2676506002282294E30
//        System.out.println(Math.pow(2, 100));
//        System.out.println(cacheFibonacci(100));

        // TODO 버퍼클래스 활용 : 입출력 테스트
        int longValue = (int) bufferInput();
        dynamicFibonacci(longValue);

//        long inputInt = Integer.parseInt(br.readLine());
//        long result = dynamicFibonacci((int) inputInt);
    }

    // TODO < 재귀 팩토리얼 >
    public static int factorial(int n)
    {
       if (n <= 1) return n;
       else return factorial(n-1) * n;
    }

    // TODO < 재귀 팩토리얼 2 >
    public static int factorial_2(int n)
    {
        if (n == 1) return 1;
        return n * factorial_2(n - 1);
    }

    // TODO < 재귀 피보나치 >
    public static long fibonacci(long n)
    {
//        System.out.println(n + "번째 연산");
//        if (n == 0) return 0;
//        else if (n == 1) return 1;
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // TODO < 동적계획법 반복문 피보나치 >
    public static long cacheFibonacci(long n)
    {
        if (n <= 1) return n;

        long[] cache = new long[(int) n + 1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i <= (int)n; i++)
            cache[i] = cache[i - 1] + cache[i - 2];

        return cache[(int) n];
    }

    // TODO < 동적계획법 재귀 피보나치 >
    public static long dynamicFibonacci(int input)
    {
        if(input < 2) return input;
        else
        {
            long[] cache = new long[input + 1];
            Arrays.fill(cache, -1);
            cache[0] = 0;
            cache[1] = 1;

            if (cache[input] != -1) return cache[input];
            else
            {
                cache[input] = dynamicFibonacci(input - 1) + dynamicFibonacci(input - 2);
                return cache[input];
            }
        }
    }

    // TODO < 행렬 곱셉 피보나치 >
   /* public static long matrixFibonacci(int input)
    {
        int k = 0;

        long[][] ZERO = {{1, 0}, {0, 1}};
        long[][] BASE = {{1, 1}, {1, 0}};
        long[][] result = ansMatrix;

        return result[0][1];

    }*/

    // TODO < 버퍼 기능 메서드 >
    public static long bufferInput() throws IOException
    {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        long inputInt = Integer.parseInt(bfr.readLine());
        System.out.println(inputInt);
        bfr.close();

        return inputInt;
    }
}

/*
 * 재귀 함수 사용 이유
 *   - 목적성: 피보나치 등
 *   - 가독성: 팩토리얼 등
 *
 * rf) https://earthteacher.tistory.com/44 [피보나치 함수 - 시간 복잡도 및 동적게획법
 */
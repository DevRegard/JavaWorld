package lab.v00;

public class Triangle
{
    // 왼쪽 아래 직사각형
    static void triangleLB(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // Q16. 피라미드
    static void pyramid(int n)
    {
        int i;
        for (i = 1; i <= n; i++)
        {
            // 공백
//            for (int j = 0; j <= (-i+3); j++)
            for (int j = 1; j <= (n-i); j++)
                System.out.print(" ");

            // * 표시
            for (int j = 0; j <= (i-1) * 2; j++)
                System.out.print(i); // Q17. n단 출력
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
//        triangleLB(5);
        pyramid(9);
    }
}
/*
[1]
  다중 루프 통한 삼각형 출력
  + Q15 ~ 17

[2]

  #### 피라미드 공식
   - [노트 참조] => 공백 + 별표
   - 1) j = 0
       - 공백: (-i+3)
       - 별표: (i-1) * 2
   - 2) j = 1
       - 공백: -i+4
       - 별표:

   #### 피라미드 한계 문제
    : n = 5 이상일 경우 공백은 마이너스가 되므로 피라미드 출력 안됨
    - 즉, n의 최댓값에 따라 '피라미드 공식'은 달라진다.
    - 이유: 직접 계산한 공백 공식은 n의 값이 아닌 자연수 4에서 대응하기 때문
    - 해결: n의 값에 따라 공백 값을 변환하는 공식 => n - i (j=1)

[3] or [4]

  1. triangleLB() 구현

  [Q16]
  2. pyramid() 구현

  [Q17]
  3. pyramid()에서 Q17 구현

  > 다중 루프 통한 삼각형, 피라미드 구현

 */

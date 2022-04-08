package lab.v01_array;

// 배열 역순으로 만들기 + 연습문제
public class ReverseArray
{
    static void swap(int[] a, int idx1, int idx2)
    {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a)
    {
        for (int i = 0; i < a.length / 2; i++)
        {
            for (int j = 0; j < a.length; j++)
                System.out.print(a[j] + " ");
            System.out.println(" ");
            System.out.println("a[" + i +"]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
            swap(a, i, a.length - i - 1);
        }

    }

    static int sumOf(int[] a)
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        System.out.println("\n배열의 합계: " + sum);
        return sum;
    }


    public static void main(String[] args) {
        int[] aaa = {1, 2, 3, 4, 5, 6, 7};
        reverse(aaa);

        for (int i = 0; i < aaa.length; i++)
            System.out.print(aaa[i] + " ");

        sumOf(aaa);
    }
}

/*
[1]
  배열 요소 읽어서 역순으로 정렬
  + Q1
  + Q2
[2]
  #### 역순으로 정렬하는 알고리즘

  ####스와이프 이유
   : 정렬 알고리즘에도 자주 사용 -> 독립적인 메서드 구현

  ####스와이프 원리
   1) 새로운 변수 t 생성
   2) t에 x값 넣기
   3) x에 y값 넣기
   4) y에 t값 넣기

  cfp.57~61

[3]
  i. reverse() 에서 swap() 호출
 */
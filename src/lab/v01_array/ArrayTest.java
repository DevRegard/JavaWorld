package lab.v01_array;

import java.util.Random;

public class ArrayTest
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
        int[] b = {1, 2, 3, 4, 5};
        int[] c = new int[] {1, 2, 3, 4, 5}; // 단, 배열의 길이는 정의할 수 없음

        Random rand = new Random();
        int rrr = rand.nextInt(20);
        System.out.println(rrr);

        // 랜덤으로 배열의 길이 정하기
        int[] r = new int[rrr];
        System.out.println(r.length);

        // 랜덤 배열 검증
        for (int i = 0; i < r.length; i++)
        {
            System.out.print(r[i] + " ");
        }
        System.out.println(" ");

        // 랜덤 번호 추출 테스트
        int[] row = new int[6];

        for (int i = 0; i < row.length; i++)
        {
            int x = rand.nextInt(10) + 1;
            row[i] += x;
        }

        // 완성된 랜덤 번호 배열 내용물 확인
        for (int i = 0; i < row.length; i++)
            System.out.print(row[i] + " ");

    }
}

/*
[1]
배열 테스트
랜덤 테스트
+
TODO 중복 번호 문제 -> LottoPro.java
TODO 시드값 현재 날짜 값으로 정하기 -> (완료)LottoPro.java
 - cf. https://hianna.tistory.com/607

[2]
[3]

 */
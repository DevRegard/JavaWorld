package lab.search;

/*
[1] 이진 검색: 이미 정렬된 배열에서 검색하는 알고리즘
[2]
  특징
  1) 선형 검색 보다 빠름
  2) '업 다운'

  방법
  1) 변수
    - 맨 앞: 0
    - 맨 마지막: n-1
    - 중간값: (n-1)/2

  2) 전략
    i. 맨 앞 -> 중간값 + 1
   ii. 맨 마지막 -> 중간값 - 1

  3) 종료 조건
    1. a[중간값] == key
    2. 검색 범위 없음

  복잡도
   - 평균: log n
   - 검색 실패: [log n - 1] 회
   - 검색 성공: log n -1 회

[3]
  i. 이진 검색
 */

import java.sql.Array;
import java.util.Arrays;

public class BinSearch
{
    static int[] a = {1,2,3,4,5,6,7,8,9,0};
    static int[] b = {2,1,3,6,8,3,7,2,8,9,2,6,3,8,2};
    static int[] c = {7,1,0,7,4,5,6,7,7,3,2,1,4,6,3,7,4,8,3,2};
    static int key = 0;

    // i. 이진 검색
    static int binSearch_i(int[] arr, int key)
    {
        int len = arr.length;
        int first = 0;
        int last = len - 1;

        do {
            int center = (len - 1) / 2;

            if (a[center] == key) return center;
            else if (a[center] < key) last = center + 1;
            else if (a[center] > key) first = center - 1;
        } while (first <= last);

        return -1;
    }

    public static void main(String[] args)
    {
        /*Arrays.sort(b);
        Arrays.sort(c);

        binSearch_i(b, 50);
        binSearch_i(c, 7);*/

    }
}

/*
[4]
  배열 길이 변수 개선
  - static int len -> (local) int len
    - 효과: 매개변수 축소 + 안정성

 */
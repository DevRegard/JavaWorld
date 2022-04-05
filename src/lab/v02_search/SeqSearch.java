package lab.v02_search;
/*
[1] ISSUE: 선형 검색
[2]
  선형 검색 조건 경우의 수
  1. 검색할 값을 발견하지 못한 경우 (= 배열의 끝을 지난 경우)
  2. 검색할 값과 같은 요소를 발견한 경우

[3]
  1. While 선형 검색
  2. for 선형 검색
 */

public class SeqSearch
{
    // MD 1. While 선형 검색
    static int seqSearch_i(int[] a, int key)
    {
        int i = 0;
        int len = a.length;

        while (true)
        {
            if (i == len) return -1; // 검색값은 배열에 존재하지 않음
            if (a[i] == key) return i; // 값이 a[i]에 존재
            i++;
        }
    }

    // MD 2. for 선형 검색
    static int seqSearch_ii(int[] a, int key)
    {
        int len = a.length;

        for (int i = 0; i < len; i++)
            if (a[i] == key) return i; // 값이 a[i]에 존재

        // 검색값은 배열에 존재하지 않음
        return -1;
    }

    // [4] test
    static int[] a = {1,2,3,4,5,6,7,8,9,0};
    static int[] b = {2,1,3,6,8,3,7,2,8,9,2,6,3,8,2};
    static int[] c = {7,1,0,7,4,5,6,7,7,3,2,1,4,6,3,7,4,8,3,2};
    static int key = 0;

    public static void main (String[] args)
    {
        seqSearch_i(a, key);
        seqSearch_i(b, key);
        seqSearch_i(c, key);

        System.out.println("");

        seqSearch_ii(a, key);
        seqSearch_ii(b, key);
        seqSearch_ii(c, key);
    }
}

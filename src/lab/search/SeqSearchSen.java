package lab.search;
/*
[1]
  보초법(sentinel method)
  - 선형 검색의 비용을 반으로 줄이는 방법
  - 보초: 검색하려는 키 값 -> 배열의 맨 끝 요소에 저장

[2]
  보초법 적용할 경우
  1) (N)을 검색하기 위해 a[i]에 (N) 저장
    - N은 숫자, a[i]는 맨 마지막 인덱스
  2) 반복문의 종료 판단 횟수 2회 -> 1회 줄일 수 있음
    - 이유: 원하는 값이 존재하지 않아도 보초값(마지막값)을 검색하면 자동 종료

[3]

 */
public class SeqSearchSen
{
    static int seqSearchSen_i(int[] a, int n, int key)
    {
        int i = 0;
        while (true)
        {
            if (a[i] == key) break;
            i++;
        }

        return i == n ? -1 : i;
    }

}

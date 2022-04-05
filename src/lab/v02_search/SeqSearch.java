package lab.v02_search;
/*
[1]
  선형 검색
  - 배열: 요소가 직선
  - 조건: 원하는 키 값을 갖는 요소를 만날 때까지
  - 검색: 맨 앞으로 순서대로

[2]
  선형 검색 조건 경우의 수
  1) 검색할 값을 발견하지 못한 경우 (= 배열의 끝을 지난 경우)
  2) 검색할 값과 같은 요소를 발견한 경우

[3]
  i. While 선형 검색
  ii. for 선형 검색
 */

public class SeqSearch
{
    static int[] a = {1,2,3,4,5,6,7,8,9,0};
    static int[] b = {2,1,3,6,8,3,7,2,8,9,2,6,3,8,2};
    static int[] c = {7,1,0,7,4,5,6,7,7,3,2,1,4,6,3,7,4,8,3,2};
    static int aLen = a.length;
    static int bLen = b.length;
    static int cLen = c.length;
    static int key = 0;

    // i. While 선형 검색
    static int seqSearch_i(int[] a, int n, int key)
    {
        int i = 0;

        while (true)
        {
            if (i == n) {
                System.out.println("검색값은 배열에 존재하지 않습니다.");
                return -1;
            }

            if (a[i] == key) {
                System.out.println(key + "값은 a[" + i + "]에 있습니다.");
                return i;
            }

            i++;
        }
    }

    // ii. for 선형 검색
    static int seqSearch_ii(int[] a, int n, int key)
    {
        for (int i = 0; i < n; i++)
        {
            if (a[i] == key){
                System.out.println(key + "값은 a[" + i + "]에 있습니다.");
                return i;
            }
        }
        System.out.println("검색값은 배열에 존재하지 않습니다.");
        return -1;
    }

    // [4]
    public static void main (String[] args)
    {
        seqSearch_i(a, aLen, key);
        seqSearch_i(b, bLen, key);
        seqSearch_i(c, cLen, key);

        System.out.println("");

        seqSearch_ii(a, aLen, key);
        seqSearch_ii(b, bLen, key);
        seqSearch_ii(c, cLen, key);
    }
}

package lab.v02_search;
/*
[1] ISSUE: 선형 검색의 보초법 구현

[2]
  보초법(sentinel method)
    : 배열의 맨 끝 요소에 '검색하려는 키 값' 저장하는 방법

  특징
  1) 선형 검색 대비 1/2 비용
  2) 배열 + 1 = 보초값

  방법
  - N을 검색하기 위해 a[Ω]에 N 저장 (N은 정수값)

  효과
  - 반복문의 종료 판단 횟수: 2회 -> 1회
    - Why? 원하는 값이 존재하지 않아도 보초값(마지막값)을 검색하면 자동 종료

[3]
  i. while 선형 검색 보초법
  ii. for 선형 검색 보초법

 */
public class SeqSearchSen
{
    static int[] a = {1,2,3,4,5,6,7,8,9,0,0};
    static int[] b = {2,1,3,6,8,3,7,2,8,9,2,6,3,8,2,0};
    static int[] c = {7,1,0,7,4,5,6,7,7,3,2,1,4,6,3,7,4,8,3,2,0};
    static int aLen = a.length - 1;
    static int bLen = b.length - 1;
    static int cLen = c.length - 1;
    static int key = 0;

    // while 선형 검색 보초법
    static int seqSearchSen_i(int[] a, int len, int key)
    {
        int i = 0;
        a[len] = key;

        while (true)
        {
            if (a[i] == key)
            {
                System.out.println(key + "값은 a[" + i + "]에 있습니다.");
                break;
            }
            i++;
        }

        if (i == len){
//            if (a[i] == a[i-1]){
                System.out.println("ㄴ> 그러나 a["+ i + "]값은 검색값(" + key +")은 가짜 데이터(보초값)입니다.");
                System.out.println("  a[" + i +"] = " + a[i]);
                System.out.println("  a[" + (i-1) +"] = " + a[i-1]);
                System.out.println("  -1");
//            }
        }
        else
        {
            System.out.println("  a[" + i +"] = " + a[i]);
            System.out.println("  a[" + (i-1) +"] = " + a[i-1]);
        }


        return i == len ? -1 : i;
    }

    public static void main (String[] args)
    {
        seqSearchSen_i(a, aLen, key);
        seqSearchSen_i(b, bLen, key);
        seqSearchSen_i(c, cLen, key);

//        System.out.println("b: " + b);
//        System.out.println("b 길이: " + bLen);
//        System.out.println("key: " + key);

        System.out.println("");

//        seqSearch_ii(a, aLen, key);
//        seqSearch_ii(b, bLen, key);
//        seqSearch_ii(c, cLen, key);
    }

}

/*
[4]
  ISSUE 1. b배열 인덱스 길이 에러
    - [1] 확인: b배열 데이터 및 길이 등 정상 -> 검색할 값이 없으면 발생하는 에러 (모든 배열)
    - [2] 원인: 보초 추가 생략함 (a[len] = key), len 변수를 length 설정하여 인덱스 상이
    - [3] 해결: 보초 코드 추가, 'len - 1' 로 수정
    - [4] 코드 정상 작동함. 메세지 출력에 경우 삼항연산자를 생략[포기] 해야한다. -> [3] 별도 조건문 생성 (최대 1회 실행)

  ISSUE 2: '마지막 인덱스 == 보초값(검색값)' 경우에도 출력하는 문제
  - [1] a배열
  - [2] 원인: 고정된 배열값
  - [3] 해결
      i. 배열 추가 공간 확보(메서드 등) -> 단, 기본 배열은 추가 불가
        - 기본 배열 사용 시: 최초 생성 배열의 마지막 인덱스는 '0'으로 여분 공간 생성
        - 내장 배열 사용 시: API 통한 배열 추가 매서드 활용
      ii.
        - 정적 배열 길이 변수: length - 1
        - 2중 조건문(X) -> if ~ else 조건문 추가
  - [4]
 */
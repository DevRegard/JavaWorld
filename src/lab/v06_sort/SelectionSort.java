package lab.v06_sort;

/*
[1]
  선택 정렬
  - 가장 작은 데이터 선택 -> 맨 앞 데이터 교체
  - 그 다음 작은 데이터 선택 -> 두번째 데이터 교체

[2]
  선택 정렬 구동 방식
  1) 2중 반복문
    1. 배열길이 만큼 반복한다. (0 ~ arr.length)
    2. 해당 배열의 다음 인덱스를 반복한다. (i+1 ~ arr.length)

  2) 조건문
    - 만약 다음 배열이 현재 배열보다 작은지 판단 (arr[minIndex]) > arr[j])
       -> 작은 값의 인덱스 minIndex 저장한다.

  3) 스와프하는 이유는?
    -

  4) Arrays 사용 이유는?
    - toString(배열) : (별도 구현 없이) 해당 배열의 값들을 나열

[3]
  i. 오름차순 선택 정렬
  ii. 내림차순 선택 정렬
 */

import java.util.Arrays;

public class SelectionSort
{
    static int[] arrA = {1,2,3,4,5,6,7,8,9,0};
    static int[] arrB = {2,1,3,6,8,3,7,2,8,9,2,6,3,8,2};
    static int[] arrC = {7,1,0,7,4,5,6,7,7,3,2,1,4,6,3,7,4,8,3,2};
//    static int minIndex = 0; // -> for 내부에서 실행해야함

    // i. 오름차순 선택 정렬
    static void selectSort(int[] arr)
    {
        int minIndex = 0; // (마지막 수정 부분)
        for (int i = 0; i < arr.length; i++)
        {
//            int minIndex = 0;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        // (1)
//        selectSort(arrA, minIndex); // 성공
//        selectSort(arrB, minIndex); // 실패
//        selectSort(arrC, minIndex); // 실패

        // (2)
        selectSort(arrA);
        selectSort(arrB);
        selectSort(arrC);
    }
}

/*
[4]
 (1) 첫 테스트
   - A: 성공
   - B: 실패
   - C: 실패
   원인: 'minIndex' 위치 문제 -> static 에서 첫번째 for 안으로

 (2) 두번째 테스트
   - A: [9, 0, 1, 2, 3, 4, 5, 6, 7, 8]
   - B: [9, 1, 2, 2, 2, 2, 3, 3, 3, 6, 7, 6, 8, 8, 8]
   - C: [8, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 6, 7, 7, 7, 7, 7]
   문제: 0번째 인덱스만 가장 큰 수 발생, 테스트 마다 다른 결과값(시스템 문제인가?)
   원인:
 */

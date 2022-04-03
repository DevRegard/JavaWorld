package lab.class_array;
/*
[1] ISSUE: 클래스 배열 -> 신체 기록 리스트 구현
[2]
MK| 클래스 배열 (Class Array)
    : 다양한 데이터형 조합할 수 있는 자료구조

MK| How to implement:
    1. 필드
    2. 생성자

MK| How to use:
    i. 클래스명 변수;
   ii. 변수 = new 생성자();
  iii. 클래스명 변수 = new 생성자();

MK| 신체 기록 리스트
    - 이름: String
    - 키: int
    - 시력: double

[3]
  MD List
  1. 신체 기록 리스트

[4]
TODO:
  [] PhysicalList -> inner class
  [] insert to Data
  [] f


  i.
 */

// MD: 신체 기록 리ㅏㅏ스트
public class PhysicalList
{
    String name;
    int height;
    double vision;

    PhysicalList(String name, int height, double vision)
    {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }
}

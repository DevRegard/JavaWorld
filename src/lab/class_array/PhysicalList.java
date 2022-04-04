package lab.class_array;

// [1] ISSUE: 클래스 배열 -> 신체 기록 리스트 구현

public class PhysicalList
{
    // MD-i: 필드
    String name;
    int height;
    double vision;

    // MD-ii: 생성자
    PhysicalList(String name, int height, double vision)
    {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }
}

/*
[2]
MK| 클래스 배열 (Class Array)
    : 다양한 데이터형 조합할 수 있는 자료구조

MK| How to implement Class Array
    1. 필드
      - 배열 클래스의 속성값
    2. 생성자
      - 클래스 생성 후, 생성자 통한 데이터 추가

MK| How to use Class Array
    i. 클래스명[] 변수 = {
        new 생성자명(),
        new 생성자명(),
        new 생성자명()
      };

cf. How to use Class
    i. 클래스명 변수;
   ii. 변수 = new 생성자();
  iii. 클래스명 변수 = new 생성자();


MK| 신체 기록 리스트
    - 이름: String
    - 키: int
    - 시력: double

[3]
  MD-i  : 필드
  MD-ii : 생성자

 */
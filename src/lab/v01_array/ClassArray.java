package lab.v01_array;

/*
[1] ISSUE: 클래스 배열 -> 신체 기록 리스트 구현
[2]
  클래스 배열 (Class Array)
  : 다양한 데이터형 조합할 수 있는 자료구조

  클래스 배열 구현
  1) 필드
  2) 생성자

  클래스 배열 사용
    i. 클래스명[] 변수 = {
        new 생성자명(),
        new 생성자명(),
        new 생성자명()
      };

  신체 기록 리스트
  - 이름: String
  - 신장: int
  - 시력: Double

[3]
  i. 필드
 ii. 생성자
 */

public class ClassArray
{
    // 필드
    String name;
    int height;
    double vision;

    // 생성자
    ClassArray(String name, int height, double vision)
    {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }
}
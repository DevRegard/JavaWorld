package lab.class_list;
/*
[1] 클래스 배열 -> 신체 기록 리스트 구현
[2]
  클래스 배열: 다양한 데이터형 조합할 수 있는 자료구조

  구현 방법:
    1. 필드
    2. 생성자

  사용 방법:
    i. 클래스명 변수;
   ii. 변수 = new 생성자();
  iii. 클래스명 변수 = new 생성자();

  '신체 기록' 리스트
    1. 이름: String
    2. 키: int
    3. 시력: double
 */
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

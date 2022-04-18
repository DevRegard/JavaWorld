package toy.inner;

public class OutClass
{
    class InnerClass // 인스턴스 내부 클래스
    {
        static class StaticClass // 정적 내부 클래스
        {

        }
    }

    public void testMethod()
    {
        class LocalClass // 지역 내부 클래스
        {

        }
    }
}

/*
 내부 클래스 (inner class): 클래스 내부에 선언한 클래스
 - 인스턴스 내부 클래스: 클래스 내부 선언 (중첩된 클래스)
 - 정적 내부 클래스: static 키워드 사용 내부 클래스
 - 지역 내부 클래스: 메서드 내부에 정의
 */

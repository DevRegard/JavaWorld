package toy.inner;

class OutClassTest
{
    private int num = 100;
    private static int sNum = 1000;
    private InClass inClass; // 내부 클래스 인스턴스 생성


    // 외부 클래스 디폴트 생성자 (= 외부 클래스 생성 후, 내부 클래스 사용 가능)
    public OutClassTest()
    {
        inClass = new InClass( );
    }

    // 인스턴스 내부 클래스
    class InClass
    {
        int inNum = 10000;
        static int sInNum = 20000; // 인스턴스 내부 클래스의 정적 변수 -> 사용 가능 여부 테스트(현재 사용 가능)


        void inTest()
        {
            System.out.println("외부 클래스의 인스턴스 변수: " + num);
            System.out.println("외부 클래스의 정적 변수: " + sNum);

            System.out.println("외부 클래스의 정적 변수: " + sInNum);
//            System.out.println("외부 클래스의 정적 변수: " + sNum);
        }

        static void sTest() {} // 내부 클래스의 정적 메서드 -> 사용 가능 여부 테스트
    }

    public void usingClass( )
    {
        inClass.inTest( );
    }

    public static void main(String[] args)
    {
        OutClassTest outClass = new OutClassTest( );
        // 외부 클래스 이용 -> 내부 클래스 기능 호출
        outClass.usingClass( );
    }
}

//public class InnerTest
//{
//    public static void main(String[] args)
//    {
//        OutClass outClass = new OutClass( );
//        // 외부 클래스 이용 -> 내부 클래스 기능 호출
//        outClass.usingClass( );
//    }
//}

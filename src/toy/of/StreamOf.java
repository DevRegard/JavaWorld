package toy.of;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOf
{
    public static void main(String[] args)
    {
        /*
        cf. https://www.geeksforgeeks.org/stream-of-method-in-java/?ref=lbp
         static Stream of(T t)

         파라미터: 필수적인 매개변수 T 를 할당한다. (t: Stream 포함하는 단일 요소)
         리턴: 순차적으로 Stream 포함하는 단일 특정 요소
         */

        // MK: 기본 예제
        Stream stream = Stream.of("김두한", "5000억", "프로젝트");
        stream.forEach(System.out::println);

        // MK: Stream 객체의 of()를 통한 String 변수 할당
        String test01 = "테스트 1";
        String test02 = "테스트 2";
        String test03 = "테스트 3";

        Stream varStream = Stream.of(test01, test02, test03);
        varStream.forEach(System.out::println);

        // MK: Stream 이용한 Array 배열 할당 [String]
        String[] arrString = {"100억", "500억", "1000억"};

        Stream<String> arrStream = Arrays.stream(arrString);

        arrStream.forEach(str -> System.out.print(str + " "));

        // MK: Stream.of() 를 이용한 Array 배열 할당 [String]
        Stream ofStream = Stream.of("100억", "500억", "1000억");

        ofStream.forEach(str -> System.out.print(str + " "));

        // MK: Stream 이용한 Array 배열 할당 [int]
        int[] arrInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        IntStream intStream = Arrays.stream(arrInt);
//        intStream.forEach(str -> System.out.print(str + " "));

        // MK: Stream.of() 를 이용한 Array 배열 할당 [int] // ISSUE
        Stream<int[]> arrIntStream = Stream.of(arrInt);
        arrIntStream.forEach(str -> System.out.print(str + " "));
    }
}

package lab.v01_array;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static java.lang.Math.pow;

public class LottoPro
{
    // MD: 로또 기본 원리 테스트
    static void testLotto(Random rand)
    {
//        Random rand = new Random();
        int[] row = new int[6];

        for (int i = 0; i < row.length; i++)
        {
            int x = rand.nextInt(9) + 1; // 1 부터 9
            row[i] += x;
            System.out.print(row[i] + " ");
        }
    }

    // MD: 랜덤 시간 테스트(곱셈)
    static int testTimeRandom()
    {
        LocalTime time = LocalTime.now();

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        int seedTime = hour * minute * second;

        System.out.println("현재 시분초: " + hour + " * " + minute + " * " + second);
        System.out.println("현재 시분초 곱하기: " + seedTime);

        return seedTime;
    }

 // MD: 랜덤 시간 테스트(제곱)
    static double testTimeRandomPow()
    {
        LocalTime time = LocalTime.now();

        double hourPow = time.getHour();
        double minutePow = time.getMinute();
        double secondPow = time.getSecond();

        double seedTimePow = pow(hourPow, minutePow);

        System.out.println("현재 시분초: " + hourPow + " ** " + minutePow + " ** " + secondPow);
        System.out.println("현재 시분초 제곱: " + seedTimePow);

        return seedTimePow;
    }

    // MD: 랜덤 날짜 테스트
    static void testDateRandom()
    {
        LocalDate now = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//        int seedDate = Integer.parseInt(formatter);

        System.out.println(now.getMonth().getValue()); // 월 -> 숫자
    }

    // MD: 로또 프로그램 프로토타입
    static void lottoProType()
    {
        Random randDate = new Random(testTimeRandom()); // 곱하기 시드
        Random randDatePow = new Random((long) testTimeRandomPow()); // 제곱 시드

        testLotto(randDate);
        System.out.println("\n");
        testLotto(randDatePow);
        /*
          i. 랜덤으로 생성할 때마다 중복 체크
          ii. 서로 일치하는 숫자가 1개라도 있으면 다시 추첨
         */
    }

    public static void main(String[] args)
    {
//        testTimeRandom();
        lottoProType();

    }
}

/*
TODO
1. 중복 하지 않는 번호 6개
  -> 로또 6/45, 연금복권720
2. Swing API
*/

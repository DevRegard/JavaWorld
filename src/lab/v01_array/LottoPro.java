package lab.v01_array;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class LottoPro
{
    // MD: 로또 기본 원리 테스트
    static void testLotto(Random rand)
    {
//        Random rand = new Random();
        int[] row = new int[6];

        for (int i = 0; i < row.length; i++)
        {
            int x = rand.nextInt(10) + 1; // 1 부터 10
            row[i] += x;
            System.out.print(row[i] + " ");
        }
    }

    // MD: 랜덤 시간 테스트
    static int testTimeRandom()
    {
        LocalTime time = LocalTime.now();

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        int seedTime = hour + minute + second;

        System.out.println(hour + " + " + minute + " + " + second);
        System.out.println(seedTime);

        return seedTime;
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
        Random randDate = new Random(testTimeRandom());
        testLotto(randDate);
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

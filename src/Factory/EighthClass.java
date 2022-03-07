package Factory;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class EighthClass
{
    public static void main(String[] args)
    {
        System.out.println(Color.White);

        // Todo: enum 배열 생성 및 출력
        Color[] allColors = Color.values();
        for (Color cl : allColors)
            System.out.println(cl);

        // Todo: 주문 관리
        Customer[] cst = Customer.values();
        for (Customer cl : cst)
            System.out.println(cl);

        // Todo: Iterator 순회
        LinkedList<Integer> lk = new LinkedList();
        lk.add(1);
        lk.add(2);
        lk.add(3);
        lk.add(4);
        System.out.println(lk);

        Iterator<Integer> it = lk.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");

    }

    enum Color
    {
        White,
        RED,
        GREEN,
        BLUE,
        BLACK
    }

    enum Customer{ // 주문 정보 - 주문 전송 - 주문 확인 - 배송 준비 - 배송중 - 배송 완료
        OrderInfo,
        OrderSubmit,
        OrderCheck,
        DeliveryReady,
        Delivering,
        DeliveryCompleted
    }
}

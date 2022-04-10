package lab.v01_array;

public class ArrayCopy
{
    // Q4) 배열 복사
    static int[] arrayCopy(int[] a, int[] b)
    {
        b = a.clone();
//        for (int i = 0; i < a.length; i++) b[i] = a[i];

        return b;
    }

    // Q5) 배열 역순 복사
    static int[] arrayReverseCopy(int[] origin, int[] b)
    {
        b = origin.clone();
        if (isSameArray(origin, b)) reverseArray(b); // clone() 으로 배열 길이 검증 불필요(= 돌 다리도 두드리기)

        System.out.print("배열 역순 복사 결과: ");
        for (int i = 0; i < origin.length; i++)
            System.out.print(b[i] + " ");

        return b;
    }

    // 배열 비교
    static boolean isSameArray(int[] a, int[] b)
    {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;

        return true;
    }

    // 스와이프
    static void swap(int[] a, int index1, int index2)
    {
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;
    }


    // 배열 역순
    static int[] reverseArray(int[] a)
    {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);
        return a;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 8, 9};
        int[] aa = {1, 2, 3, 4, 5, 8, 9};
        int[] b = {};

//        int[] c = arrayCopy(a, b);
        int[] d = arrayReverseCopy(a, b);

        System.out.println(isSameArray(a, aa) ? "\n서로 같은 배열" : "\n서로 다른 배열");

//        for (int i = 0; i < a.length; i++) System.out.print(c[i] + " ");
//        for (int i = 0; i < a.length; i++) System.out.print(d[i] + " ");
    }
}

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
    static int[] arrayReverseCopy(int[] a, int[] b)
    {
        if (isSameArray(a, b))
            for (int i = 0; i < a.length; i++)
            {

                System.out.println();
            }

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

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 8, 9};
        int[] aa = {1, 2, 3, 4, 5, 8, 9};
        int[] b = {};

        int[] c = arrayCopy(a, b);
        int[] d = arrayReverseCopy(a, aa);

        System.out.println(isSameArray(a, aa) ? "서로 같은 배열" : "서로 다른 배열");

//        for (int i = 0; i < a.length; i++) System.out.print(c[i] + " ");
//        for (int i = 0; i < a.length; i++) System.out.print(d[i] + " ");
    }
}

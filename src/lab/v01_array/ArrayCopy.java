package lab.v01_array;

public class ArrayCopy
{
    static int[] arrayCopy(int[] a, int[] b)
    {
        b = a.clone();

        return b;
    }

    static int[] arrayReverseCopy(int[] a, int[] b)
    {
//        if (a.length != b.length) return null;

        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        return b;
    }

    static boolean isSameArray(int[] a, int[] b)
    {

        return false;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 8, 9};
        int[] aa = {1, 2, 3, 4, 5, 8, 9};
        int[] b = {};

        int[] c = arrayCopy(a, b);
        int[] d = arrayReverseCopy(a, aa);

        for (int i = 0; i < a.length; i++)
            System.out.print(c[i] + " ");
        for (int i = 0; i < a.length; i++)
            System.out.print(d[i] + " ");
    }
}

package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeventhClass
{
    public static void main(String[] args) throws IOException {
//        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bfr2 = new BufferedReader(new InputStreamReader(System.in));
//        String inputStr = bfr.readLine();
        int inputInt = Integer.parseInt(bfr2.readLine());
//        System.out.println(inputStr);
        System.out.println(inputInt);

        powPow(inputInt);
    }

    // METHOD: 자기 자신 제곱
    public static void powPow(int n)
    {
        double nn = Math.pow(n, n);
        System.out.println(nn);
    }
}

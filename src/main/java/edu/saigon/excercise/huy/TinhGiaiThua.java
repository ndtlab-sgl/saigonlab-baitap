package edu.saigon.excercise.huy;

import java.util.Scanner;

public class TinhGiaiThua {
    public static void calculate() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = input.nextInt();
        System.out.println("n! = " + giaiThua(n));
    }

    private static int giaiThua(int n) {
        int nGiaiThua = 1;
        for (int i = 2; i <= n; i++) {
            nGiaiThua = i * nGiaiThua;
        }
        return nGiaiThua;
    }
}

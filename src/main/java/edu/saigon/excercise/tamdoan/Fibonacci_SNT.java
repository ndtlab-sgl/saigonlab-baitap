package edu.saigon.excercise.tamdoan;

import java.util.Scanner;

public class Fibonacci_SNT {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        n = sc.nextInt();
        System.out.println("Các số Fibocacci nhỏ hơn n là số nguyên tố là: ");
        fibonacci_SNT(n);

    }
    public static void fibonacci_SNT(int n)
    {
        int a1 = 1;
        int a2 = 1;
        int Fn = 0;
        while(Fn < n)
        {
            Fn= a1 + a2;
            a1 = a2;
            a2 = Fn;
            if(Fn < n && SoNguyenTo.KiemTra_SNT(Fn))
                System.out.println(Fn);
        }
    }
}
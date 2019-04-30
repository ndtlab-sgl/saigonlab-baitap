package edu.saigon.excercise;

import java.util.Scanner;

public class BT11 {
    public static void cacSoNguyenToThuocDayFibonacci(int n) {
        // bắt đầu từ 2 vì F(1) == F(2) == 1
        for (int i=2; i<n; i++) {
            int fibonacci = BT4.Fibonacci(i);
            if (fibonacci>n) {
                return;
            }
            if (BT5.laSoNguyenTo(fibonacci)) {
                System.out.print(fibonacci + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chương trình liệt kê các số nguyên tố thuộc dãy Fibonacci và nhỏ hơn n");
        System.out.print("Nhập n=");
        n = scan.nextInt();
        cacSoNguyenToThuocDayFibonacci(n);
    }
}

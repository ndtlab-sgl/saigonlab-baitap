package edu.saigon.excercise.hoquocthong;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        int value;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        value = scanner.nextInt();
        Bai04 bai4 = new Bai04();
        result = bai4.tinhFibonacci(value);
        if (result == -1) {
            System.out.println("Khong co gia tri!");
        }
        if (result >= 0) {
            System.out.println("So Fibonacci thu " + value + " = " + result);
        }
    }

    private int tinhFibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return f0;
        }
        if (n == 1 || n == 2) {
            return f1;
        }
        for (int i = 2; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        return fn;
    }
}

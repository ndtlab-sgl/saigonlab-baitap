package edu.saigon.excercise.hoquocthong;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int value;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        value = scanner.nextInt();
        Bai11 bai11 = new Bai11();

        if (value < 0) {
            System.out.println("Gia tri phai la mot so lon hon 0!");
        }
        if (value >= 0) {
            System.out.println("Day gia tri Fibonacci nho hon n: ");
            for (int i = 0; i < value; i++) {
                result = bai11.tinhFibonacci(i);
                if(bai11.kiemTraSNT(result)){
                    System.out.print(+result+"\t");
                }
            }
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

    private boolean kiemTraSNT(int value) {
        if (value == 1 || value == 2) {
            return true;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}

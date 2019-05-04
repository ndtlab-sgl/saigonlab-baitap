package edu.saigon.excercise.hoquocthong;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        int value;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        value = scanner.nextInt();

        Bai_5 bai5 = new Bai_5();
        bai5.xuatDaySNT(value);
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

    private void xuatDaySNT(int value) {
        System.out.print("Day so nguyen to nho hon n la: ");
        for (int i = 1; i < value; i++) {
            if (kiemTraSNT(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

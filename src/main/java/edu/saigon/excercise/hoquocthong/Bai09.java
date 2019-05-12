package edu.saigon.excercise.hoquocthong;

import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        int value;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        value = scanner.nextInt();
        if (value < 0) {
            System.out.println("Gia tri nhap vao phai lon hon 0");
        }
        if (value >= 0) {
            Bai09 bai9 = new Bai09();
            result = bai9.tinhTongCacChuSoNguyen(value);
            System.out.println("Tong cac chu so cua " + value + " = " + result);
        }

    }

    private int tinhTongCacChuSoNguyen(int value) {
        int tong = 0;
        while (value > 0) {
            int donvi = value % 10;
            value = value / 10;
            tong = tong + donvi;
        }
        return tong;
    }
}

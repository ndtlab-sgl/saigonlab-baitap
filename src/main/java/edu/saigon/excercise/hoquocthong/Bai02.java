package edu.saigon.excercise.hoquocthong;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        int value;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào value: ");
        value = scanner.nextInt();
        Bai02 bai2 = new Bai02();
        result = bai2.tinhGiaiThua(value);
        System.out.println("Giai thua cua " + value + " la " + result);

//        result = bai2.tinhGiaiThuaDeQui(value);
//        System.out.println("Giai thua cua "+value+" la "+result);
    }

    private int tinhGiaiThua(int value) {
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    private int tinhGiaiThuaDeQui(int value) {
        if (value == 1) {
            return 1;
        }
        return value * tinhGiaiThuaDeQui(value - 1);
    }
}

package edu.saigon.excercise.hoquocthong;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        int value;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào value: ");
        value = scanner.nextInt();
        Bai_2 bai2 = new Bai_2();
        result = bai2.GiaiThua(value);
        System.out.println("Giai thua cua " + value + " la " + result);

//        result = bai2.GiaiThuaDeQui(value);
//        System.out.println("Giai thua cua "+value+" la "+result);
    }

    private int GiaiThua(int value) {
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    private int GiaiThuaDeQui(int value) {
        if (value == 1) {
            return 1;
        }
        return value * GiaiThuaDeQui(value - 1);
    }
}

package edu.saigon.excercise.hoquocthong;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double valueA = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double valueB = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double valueC = scanner.nextDouble();
        Bai01 bai1 = new Bai01();
        bai1.giaiPhuongTrinhBac2(valueA, valueB, valueC);
    }

    private void giaiPhuongTrinhBac1(double valueA, double valueB) {
        double result;
        if (valueA == 0) {
            if (valueB == 0) {
                System.out.println("Phương trình vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            result = -valueB / valueA;
            System.out.println("Phương trình có nghiệm: " + result);
        }
    }

    private void giaiPhuongTrinhBac2(double valueA, double valueB, double valueC) {
        double result1;
        double result2;
        if (valueA == 0) {
            giaiPhuongTrinhBac1(valueB, valueC);
            return;
        }
        double delta = (valueB * valueB) - (4 * valueA * valueC);
        if (delta == 0) {
            result1 = -valueB / (2 * valueA);
            System.out.println("Phương trình có nghiệm kép: " + result1);
        }
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        if (delta > 0) {
            result1 = (-valueB + Math.sqrt(delta)) / (2 * valueA);
            result2 = (-valueB - Math.sqrt(delta)) / (2 * valueA);
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("   x1 =" + result1);
            System.out.println("   x2 =" + result2);
        }
    }
}

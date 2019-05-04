package edu.saigon.excercise.hoquocthong;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        double valueA, valueB;
        double resultUCLN;
        double resultBCNN;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        valueA = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        valueB = scanner.nextDouble();

        Bai_3 bai3 = new Bai_3();
        resultUCLN = bai3.UCLN(valueA,valueB);
        System.out.println("UCLN = "+resultUCLN);
        resultBCNN = bai3.BCNN(valueA,valueB);
        System.out.println("BCNN = "+resultBCNN);
    }

    private double UCLN(double valueA, double valueB) {
        while (valueA != valueB) {
            if (valueA > valueB) {
                valueA = valueA - valueB;
            } else {
                valueB = valueB - valueA;
            }
        }
        return valueA;
    }

    private double BCNN(double valueA, double valueB) {
        return (valueA*valueB)/UCLN(valueA,valueB);
    }
}

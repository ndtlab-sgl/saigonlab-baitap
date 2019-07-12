package edu.saigon.excercise.hoquocthong;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        double valueA, valueB;
        double resultUCLN;
        double resultBCNN;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        valueA = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        valueB = scanner.nextDouble();

        Bai03 bai3 = new Bai03();
        resultUCLN = bai3.timUocChungLonNhat(valueA, valueB);
        System.out.println("UCLN = " + resultUCLN);
        resultBCNN = bai3.timBoiChungNhoNhat(valueA, valueB);
        System.out.println("BCNN = " + resultBCNN);
    }


    private double timUocChungLonNhat(double valueA, double valueB) {
        while (valueA != valueB) {
            if (valueA > valueB) {
                valueA = valueA - valueB;
            } else {
                valueB = valueB - valueA;
            }
        }
        return valueA;
    }

    private double timBoiChungNhoNhat(double valueA, double valueB) {
        return (valueA * valueB) / timUocChungLonNhat(valueA, valueB);
    }

}

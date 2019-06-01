package edu.saigon.excercise.huy;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PTBac2 {
    public static void giaiPT() {
        double a, b, c, x1, x2, x;
        double delta;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a= ");
        a = input.nextDouble();
        System.out.print("Nhap b= ");
        b = input.nextDouble();
        System.out.print("Nhap c= ");
        c = input.nextDouble();
        delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        if (delta == 0) {
            x = (-b / (a * 2));
            System.out.println("Phuong trinh co nghiem duy nhat: x = " + x);
        }
        if (delta > 0) {
            x1 = (-b + sqrt(delta) / (2 * a));
            x2 = (-b - sqrt(delta) / (2 * a));
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}


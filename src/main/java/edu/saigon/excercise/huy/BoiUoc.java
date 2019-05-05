package edu.saigon.excercise.huy;

import java.util.Scanner;

public class BoiUoc {
    public static void calculate() {
        int a, b, UCLN, BCNN;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        a = input.nextInt();
        System.out.println("Nhap so thu hai: ");
        b = input.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("a va b phai lon hon 0");
        }
        int _a = a;
        int _b = b;
        while (_a != _b) {
            if (_a > _b) {
                _a -= _b;
            } else {
                _b -= _a;
            }
        }
        UCLN = _a;
        BCNN = (a * b) / UCLN;
        System.out.println("Uoc chung lon nhat: " + UCLN);
        System.out.println("Boi chung nho nhat: " + BCNN);
    }
}

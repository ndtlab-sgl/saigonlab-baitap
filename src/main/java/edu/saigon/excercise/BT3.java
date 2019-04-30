package edu.saigon.excercise;
import java.util.Scanner;
public class BT3 {
    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a < b) b -= a;
            else a -= b;
        }
        return a;
    }
    public static int BCNN(int a, int b) {
        int ucln = UCLN(a, b);
        return a * b / ucln;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tìm UCLN và BCNN của 2 số a và b");
        System.out.print("Nhập a=");
        a = scan.nextInt();
        System.out.print("Nhập b=");
        b = scan.nextInt();
        int ucln = UCLN(a, b);
        int bcnn = BCNN(a, b);
        System.out.println("UCNLN: " + ucln);
        System.out.println("BCNN: " + bcnn);
    }
}

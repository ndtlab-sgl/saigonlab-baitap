package edu.saigon.excercise.phnamnov;
import java.util.Scanner;
public class BT1 {

    public static void giaiPhuongTrinhBac1(int a, int b) {
        if (a==0 && b == 0) {
            System.out.println("Phương trình vô số nghiệm");
            return;
        }
        if (a == 0) {
            System.out.println("Phương trình vô nghiệm");
        }

        // else
        double x = -b / a;
        System.out.println("Phương trình có 1 nghiệm: " + x);
    }

    public static void giaiPhuongTrinhBac2(int a, int b, int c) {
        if (a==0 && b==0 && c==0) {
            System.out.println("Phương trình vô số nghiệm");
            return;
        }

        long delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
            return;
        }

        if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có 1 nghiệm: " + x);
            return;
        }

        // else
        double sqrtDelta = Math.sqrt(delta);
        double x1 = (-b - sqrtDelta) / (2 * a);
        double x2 = (-b + sqrtDelta) / (2 * a);
        System.out.println("Phương trình có 2 nghiêm:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }



    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Phương trình bậc 2: ax2 + bx + c = 0");
        System.out.print("Nhập a=");
        a = scan.nextInt();
        System.out.print("Nhập b=");
        b = scan.nextInt();
        System.out.print("Nhập c=");
        c = scan.nextInt();

        if (a == 0) {
            giaiPhuongTrinhBac1(b, c);
        } else {
            giaiPhuongTrinhBac2(a, b, c);
        }
    }
}

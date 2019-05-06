package edu.saigon.excercise.phnamnov;
import java.util.Scanner;
public class BT3 {
    public static int tinhUocChungLonNhat(int a, int b) {
        while (a != b) {
            if (a < b) b -= a;
            else a -= b;
        }
        return a;
    }
    public static int tinhBoiChungNhoNhat(int a, int b) {
        int ucln = tinhUocChungLonNhat(a, b);
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
        int ucln = tinhUocChungLonNhat(a, b);
        int bcnn = tinhBoiChungNhoNhat(a, b);
        System.out.println("UCNLN: " + ucln);
        System.out.println("BCNN: " + bcnn);
    }
}

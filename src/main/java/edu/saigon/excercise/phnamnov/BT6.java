package edu.saigon.excercise.phnamnov;

import java.util.Scanner;

public class BT6 {
    public static void inCacSoNguyenToDauTien(int n) {
        int i = 1;
        while (n != 0) {
            if (BT5.laSoNguyenTo(i)) {
                System.out.print(i + " ");
                n--;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chương trình liệt kê n số nguyên tố đâu tiên.");
        System.out.print("Nhập n=");
        n = scan.nextInt();
        inCacSoNguyenToDauTien(n);
    }
}

package edu.saigon.excercise.nhanguyen;

import java.util.Scanner;

public class bai6 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Nhập vào n =");
        int n = scanner.nextInt();

        System.out.println(n + " số nguyên tố đầu tiên là: ");
        timNSoNguyenToDauTien(n);
    }

    private static void timNSoNguyenToDauTien(int n) {
        int dem = 0;
        int i = 2;
        while (dem < n){
            if(kiemTraSoNguyenTo(i) == true){
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }

    private static boolean kiemTraSoNguyenTo(int i) {
        if (i < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(i);
        for (int j = 2; j <= squareRoot; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}

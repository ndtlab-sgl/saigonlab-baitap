package edu.saigon.excercise.nhanguyen;

import java.util.Scanner;

public class bai5 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập vào số n = ");
        int n = scanner.nextInt();

        System.out.println("Số nguyên tố nhỏ hơn " + n +" là: ");
        timSoNguyenTo(n);
    }

    private static void timSoNguyenTo(int n) {
        for(int i = 0; i < n; i++){
            if(kiemTraSoNguyenTo(i) == true){
                System.out.print(i + " ");
            }
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

package edu.saigon.excercise.nhanguyen;

import java.util.Scanner;

public class bai11 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();
        System.out.print("Các sô fionacci nhỏ hơn " + n +" và là số nguyên tó là: ");

       int i = 0;
       while (fibonacci(i) < n){
           int resul = fibonacci(i);
           if(kiemTraSoNguyenTo(resul) == true){
               System.out.print(resul + " ");
           }
           i++;
       }

    }

    private static boolean kiemTraSoNguyenTo(int resul) {
        if (resul < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(resul);
        for (int j = 2; j <= squareRoot; j++) {
            if (resul % j == 0) {
                return false;
            }
        }
        return true;

    }

    private static int fibonacci(int i) {
        if(i < 0){
            return -1;
        }
        else if(i == 0 || i == 1){
            return i;
        }
        else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
}

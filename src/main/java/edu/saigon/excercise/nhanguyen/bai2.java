package edu.saigon.excercise.nhanguyen;

import java.util.Scanner;

public class bai2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Nhập vào một số dương bất kỳ a = ");
        int a = scanner.nextInt();

        System.out.println("Giai thừa của a là: "+tinhGiaiThua(a));
    }

    private static long tinhGiaiThua(int a) {
        long gt = 1;
        if(a > 1){
            for(int i = 2; i <= a; i++){
                gt = i * gt;
            }
            return gt;
        }
        else {
            return gt;
        }
    }
}

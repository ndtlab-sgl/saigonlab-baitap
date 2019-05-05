package edu.saigon.excercise.nhanguyen;

import java.util.Scanner;

public class bai4 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Nhập vào sô Fibonacci thứ n: ");
        int n = scanner.nextInt();

        System.out.println("Số Fibonacci thứ n là: " +  timSoFibonacci(n));
    }

    private static long timSoFibonacci(int n) {
        long resul = 0;
        long fn1 = 1, fn2 = 1;
        if(n > 2){
            for(int i = 2; i < n; i++){
                resul = fn1 + fn2;
                fn2 = fn1;
                fn1 = resul;
            }

        }
        else{
            if(n == 0) {

            }
            if(n == 1 || n == 2){
                resul = 1;

            }
        }
        return resul;
    }
}

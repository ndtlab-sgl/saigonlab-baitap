package edu.saigon.excercise.nhanguyen;

import java.util.Scanner;

public class Bai04 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Nhập vào sô Fibonacci thứ n: ");
        int n = scanner.nextInt();

        System.out.println("Số Fibonacci thứ n là: " +  timSoFibonacci(n));
    }

    private static long timSoFibonacci(int n) {
        if(n < 0){
            return -1;
        }
        else if(n == 0 || n == 1){
            return n;
        }
        else {
            return timSoFibonacci(n - 1) + timSoFibonacci(n - 2);
        }
    }
}

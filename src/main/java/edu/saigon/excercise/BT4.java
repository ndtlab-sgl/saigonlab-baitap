package edu.saigon.excercise;

import java.util.Scanner;

public class BT4 {
    public static int Fibonacci(int n) {
        if (n==1 || n==2) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chương trình tính Fibonacci tại n");
        System.out.print("Nhập n=");
        int n = scan.nextInt();
        int fibonacci = Fibonacci(n);
        System.out.println("Kết quả: "+ fibonacci);
    }
}

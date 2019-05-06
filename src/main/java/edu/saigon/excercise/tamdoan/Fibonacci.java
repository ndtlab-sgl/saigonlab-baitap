package edu.saigon.excercise.tamdoan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số nguyên n >= 2: ");
            n = sc.nextInt();
        }while(n<2);
        System.out.println("Số Fibinaci thứ " + n + " là: " + fibonacci(n));
    }
    public static int fibonacci(int n)
    {
        int a =0;
        int b = 1;
        int Fn = 1;
        for(int i = 2;i <= n;i++)
        {
            Fn = a + b;
            a = b;
            b = Fn;
        }
        return Fn;
    }
}

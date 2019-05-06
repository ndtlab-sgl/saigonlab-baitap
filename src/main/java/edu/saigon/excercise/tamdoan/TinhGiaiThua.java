package edu.saigon.excercise.tamdoan;

import java.util.Scanner;

public class TinhGiaiThua {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số nguyên dương n: ");
            n = sc.nextInt();
        }while(n<=0);
        System.out.println(n + "! = " + GiaiThua(n));

    }
    public static int GiaiThua(int n)
    {
        int GT = 1;
        for(int i = 2; i <= n; i++)
        {
            GT = GT * i;
        }
        return GT;
    }
}

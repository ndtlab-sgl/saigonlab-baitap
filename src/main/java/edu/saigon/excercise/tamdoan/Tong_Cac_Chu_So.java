package edu.saigon.excercise.tamdoan;

import java.util.Scanner;

public class Tong_Cac_Chu_So {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        n = sc.nextInt();
        System.out.print("Tổng các chữ số của số nguyên "+ n + " là: " + TongCacChuSo(n));


    }
    public static int TongCacChuSo(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;
    }
}

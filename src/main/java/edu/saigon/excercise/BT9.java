package edu.saigon.excercise;

import java.util.Scanner;

public class BT9 {
    public static int tinhTongCacChuSoCua1SoNguyen(int n) {
        int result = 0;
        while (n != 0) {
            int chuSo = n % 10;
            n /= 10;
            result += chuSo;
        }
        return result;
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chương trình tính tổng các chữ số của một số nguyên");
        System.out.print("Nhập n=");
        n = scan.nextInt();
        System.out.println("Kết quả: " + tinhTongCacChuSoCua1SoNguyen(n));
    }
}

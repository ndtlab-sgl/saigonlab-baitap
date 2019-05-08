package edu.saigon.excercise.thind;

import java.util.Scanner;

public class TinhGiaiThua {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so nguyen n: ");
    int n = sc.nextInt();
    System.out.println(String.format("%s != %s", n, tinhGiaiThua(n)));
  }

  public static int tinhGiaiThua(int n) {
    int kq = 1;
    for (int i = 2; i <= n;i++) {
      kq = kq * i;
    }
    return kq;
  }

}

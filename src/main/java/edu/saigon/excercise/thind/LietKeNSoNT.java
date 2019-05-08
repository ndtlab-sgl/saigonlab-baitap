package edu.saigon.excercise.thind;

import java.util.Scanner;

public class LietKeNSoNT {

  private int n;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.printf("Nhap n = ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      if (MathUtils.kiemTraSoNguyenTo(i)) {
        System.out.printf("\t" + i);
      }
    }
  }
}

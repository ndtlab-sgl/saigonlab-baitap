package edu.saigon.excercise.thind;

import java.util.Scanner;

public class BCNN {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Tinh boi chung nho nhat giua 2 so a va b.");

    System.out.print("a = ");
    int a = scanner.nextInt();

    System.out.print("b = ");
    int b = scanner.nextInt();

    System.out.println("Boi chung nho nhat: " + tinhBoiChungNhoNhat(a, b));
  }

  private static int tinhBoiChungNhoNhat(int valueA, int valueB) {
    return (valueA * valueB) / MathUtils.tinhUocChungLonNhat(valueA, valueB);
  }
}

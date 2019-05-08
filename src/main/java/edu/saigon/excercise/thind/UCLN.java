package edu.saigon.excercise.thind;

import java.util.Scanner;

public class UCLN {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Tinh uoc chung lon nhat giua 2 so a va b.");

    System.out.print("a = ");
    int a = scanner.nextInt();

    System.out.print("b = ");
    int b = scanner.nextInt();

    System.out.print(String.format("Uoc chung lon nhat giua 2 so %d va %d: %d\n", a, b,
      MathUtils.tinhUocChungLonNhat(a, b)));
  }
}

package edu.saigon.excercise.thind;

import java.util.Scanner;

public class TimSoFibonacci {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Nhap vao sao fibonacci can tim: ");
    int n = scanner.nextInt();

    System.out.println("So Fibonacci can tim la: " + timSoFibonacci(n));
  }

  private static long timSoFibonacci(int n) {
    if (n < 0) {
      return  -1;
    }
    if (n == 0 || n == 1) {
      return  n;
    }
    return timSoFibonacci(n - 1) + timSoFibonacci(n - 2);
  }

}

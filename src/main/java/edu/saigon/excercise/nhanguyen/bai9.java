package edu.saigon.excercise.nhanguyen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai9 {
    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Nhập vào số dương n: ");
        int n = scanner.nextInt();

        List<Integer> listNumbers = phanTichMotSo(n);
        System.out.print("Kết quả " + n + " là ");

        int size = listNumbers.size();
        int resul = 0;
        for(int i = size - 1; i > 0; i--){
            System.out.print(listNumbers.get(i) + " + ");
            resul = resul + listNumbers.get(i);
        }
        System.out.print(listNumbers.get(0));
        resul = resul + listNumbers.get(0);
        System.out.print(" = " + resul);
    }

    private static List<Integer> phanTichMotSo(int n) {
        List<Integer> listNumbers = new ArrayList<Integer>();
        while (n > 0){
            listNumbers.add(n % 10);
            n = n / 10;
        }
        return listNumbers;
    }
}

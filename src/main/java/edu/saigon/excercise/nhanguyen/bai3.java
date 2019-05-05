package edu.saigon.excercise.nhanguyen;

import java.util.Scanner;

public class bai3 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Nhập vào a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào b = ");
        int b = scanner.nextInt();

        System.out.println("Ước chung lớn nhất của a và b là: " + timUCLN(a,b));
        System.out.println("Bội chung nhỏ nhất của a và b là: " + (a*b)/timUCLN(a,b));
    }

    private static long timUCLN(int a, int b) {
        while (a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }
}

package edu.saigon.excercise.phnamnov;

import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra sâu s1 chứa sâu s2.");

        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập sâu s1: ");
        String s1 = scan.nextLine();

        System.out.print("Nhập sâu s2: ");
        String s2 = scan.nextLine();

        if (s1.contains(s2)) {
            System.out.println("Sâu s1 chứa sâu s2");
        } else {
            System.out.println("Sâu s1 không chứa s2");
        }
    }
}

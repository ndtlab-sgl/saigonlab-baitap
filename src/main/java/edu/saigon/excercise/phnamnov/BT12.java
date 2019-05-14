package edu.saigon.excercise.phnamnov;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BT12 {
    public static int countWord(String string) {
        if (string.isEmpty()) return 0;

        String regex = Pattern.quote(" ");
        System.out.println("regex " + regex);

        return string.split(regex).length;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Đếm số từ trong chuỗi.");
        System.out.print("Nhập chuỗi: ");
        String chuoi = scan.nextLine();
        System.out.print("Số từ: " + countWord(chuoi));
    }
}

package edu.saigon.excercise.phnamnov;

import java.util.ArrayList;
import java.util.Scanner;

public class BT10 {
    public static boolean laSoThuanNghich(int n) {
        ArrayList<Integer> phanTu = new ArrayList<>();
        while (n != 0) {
            phanTu.add(n%10);
            n /= 10;
        }
        if (phanTu.size() == 0) {
            return false;
        }
        while (phanTu.size() != 0) {
            if (phanTu.size() == 1) {
                return true;
            }
            if (phanTu.get(0) != phanTu.get(phanTu.size()-1)) {
                return false;
            }
            phanTu.remove(0);
            phanTu.remove(phanTu.size()-1);
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chương trình kiểm tra số thuận nghịch");
        System.out.print("Nhập n=");
        n = scan.nextInt();
        if (laSoThuanNghich(n)) {
            System.out.println(n + " là số thuận nghịch");
        } else {
            System.out.println(n + " không phải là số thuận nghịch");
        }
    }
}

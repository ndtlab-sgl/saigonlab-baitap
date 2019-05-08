package edu.saigon.excercise.phnamnov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT5 {
    public static boolean laSoNguyenTo(int n) {
        double sqrtN = Math.sqrt(n);
        for (int i=2; i<=Math.floor(sqrtN); i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
    public static List<Integer> lietKeSoNguyenTo(int n) {
        ArrayList<Integer> ds = new ArrayList<>();
        for (int i=1; i<n; i++) {
            if (laSoNguyenTo(i)) {
                ds.add(new Integer(i));
            }
        }
        return ds;
    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chương trình in các số nguyên tô nhỏ hơn n");
        System.out.print("Nhập n=");
        n = scan.nextInt();
        List<Integer> ds = lietKeSoNguyenTo(n);
        System.out.println("Danh sách các số nguyên tố nhỏ hơn n");
        for (Integer i : ds) {
            System.out.print(i + " ");
        }
    }
}

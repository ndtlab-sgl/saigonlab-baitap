package edu.saigon.excercise;


import java.util.List;
import java.util.Scanner;

public class BT8 {
    public static String phanTichSoNguyen(int n) {
        List<Integer> ds = BT5.lietKeSoNguyenTo(n+1);
        if (ds.size() == 0) return new String();
        StringBuilder builder = new StringBuilder().append(ds.get(0));
        ds.remove(0); //bỏ số nguyên tố 1
        for (Integer i : ds) {
            while (n%i == 0) {
                n /= i;
                builder.append("x").append(i);
            }
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chương trình phân tích số nguyên tố");
        System.out.print("Nhập n=");
        n = scan.nextInt();
        System.out.print("Kết quả " + phanTichSoNguyen(n));
    }
}

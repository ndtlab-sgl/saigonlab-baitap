package edu.saigon.excercise;
import java.util.Scanner;
public class BT2 {
    public static long tinhGiaiThua(int n) {
        long result = 1;
        while (n != 1) {
            result *= n;
            n--;
        }
        return result;
    }
    public static void main(String[] args) {
        int n;
        long result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chương trình tính giai thừa n");
        System.out.print("Nhập n=");
        n = scan.nextInt();
        result = tinhGiaiThua(n);
        System.out.println("Giai thừa của n: " + result);
    }
}

package edu.saigon.excercise.tamdoan;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        n = sc.nextInt();
        Liet_ke_SNT(n);

    }
    public static boolean KiemTra_SNT(int x)
    {
        for(int i = 2; i < x; i++)
        {
            if(x%i == 0)
                return false;
        }
        return true;
    }
    public static void Liet_ke_SNT(int n)
    {
        System.out.println("Số nguyên tố nhỏ hơn n là: ");
        for(int i = 2; i < n; i++)
        {
            if(KiemTra_SNT(i))
                System.out.println(i);
        }
    }
}

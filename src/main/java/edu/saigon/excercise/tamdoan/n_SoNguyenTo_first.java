package edu.saigon.excercise.tamdoan;

import java.util.Scanner;

public class n_SoNguyenTo_first {
    private SoNguyenTo connect;
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n phần tử cần liệt kê: ");
        n = sc.nextInt();
        n_SNT_First(n);

    }
    public static void n_SNT_First(int n)
    {
        if(n > 0)
        {
            System.out.println(n + " số nguyên tố đầu tiên là: ");
            int dem = 0;
            for(int i = 2;;i++)
            {
                if(SoNguyenTo.KiemTra_SNT(i))
                {
                    System.out.println(i);
                    dem++;
                }
                if(dem == n)
                    break;
            }
        }

    }
}
package edu.saigon.excercise.tamdoan;

import java.util.Scanner;

public class Phan_tich_thua_so {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        n = sc.nextInt();
        System.out.print(n + " = ");
        PhanTich_ThuaSo(n);

    }
    public static void PhanTich_ThuaSo(int n)
    {
        int i = 2;
        while(n > 1 || (!SoNguyenTo.KiemTra_SNT(n)))
        {
            if(n % i == 0 )
            {
                n = n/i;
                System.out.print(i);
                if(n>1)
                    System.out.print(" * ");
            }
            else
                i++;
        }
    }
}

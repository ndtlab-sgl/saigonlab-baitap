package edu.saigon.excercise.tamdoan;

import java.util.Scanner;

public class UCLN_BCNN {
    public static void main(String[] args) {
        int a,b;
        do {
            a = NhapSoNguyen("Nhập số nguyên dương a: ");
            b = NhapSoNguyen("Nhập số nguyên dương b: ");
        }while (a<0 || b<0);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: "+ UCLN(a,b));
        System.out.println("Bội chung nhỏ nhất của "+ a + " và " + b + " là: " + BCNN(a,b));

    }
    public static int NhapSoNguyen(String str)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        a = sc.nextInt();
        return a;

    }
    public static int UCLN(int a, int b)
    {
        int temp;
        if(a > b)
            temp = b;
        else
            temp = a;
        for(int i= temp; i>0; i--)
        {
            temp = i;
            if(a % temp == 0 && b % temp == 0)
                return temp;
        }
        return 1;
    }
    public static int BCNN(int a, int b)
    {
        int temp;
        if(a > b)
            temp = a;
        else
            temp = b;
        for(int i = temp;;i++)
        {
            temp = i;
            if(i % a == 0 && i % b == 0)
                break;
        }
        return temp;
    }
}

package edu.saigon.excercise.tamdoan;

import java.util.Scanner;

public class PT_bac2 {

    public static void main(String[] args) {
        double a,b,c;
        a = NhapHeSo("Nhập hệ số a = ");
        b = NhapHeSo(" Nhập hệ số b = ");
        c = NhapHeSo(" Nhập hệ số c = ");
        GiaiPT(a,b,c);


    }

    public static double NhapHeSo(String str)
    {
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        x = sc.nextDouble();
        return x;
    }
    public static   void GiaiPT(double a, double b, double c){
        //ax2 + bx + c =0
        if(a == 0)
        {
            if(b == 0)
            {
                if(c == 0)
                    System.out.println("Phương trình có vô số nghiệm!");
                else
                    System.out.println("Phương trình vô nghiệm!");
            }
            else
                System.out.println("Phương trình có nghiệm la x = " + (-c/b));
        }
        else
        {
            double detal = Math.pow(b,2)-4*a*c;
            if(detal < 0)
                System.out.println("Phương trình vô nghiệm!");
            else if(detal == 0)
                System.out.println("phương trình có 1 nghiệm kép x1 = x2 = "+(-b/2*a));
            else
            {
                double x1 = (-b + Math.sqrt(detal)) / (2 * a);
                double x2= (-b - Math.sqrt(detal)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt là: x1 = " + x1 + "  x2 = " + x2);

            }
        }
    }
}

package edu.saigon.excercise.nhanguyen;

import java.util.Scanner;

public class Bai01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Nhập hệ số a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hệ số c = ");
        float c = scanner.nextFloat();
        giaiPTBac2(a,b,c);
    }

    private static void giaiPTBac2(float a, float b, float c) {
        //kiểm tra đầu vào
        if(a == 0 && b == 0) {
            System.out.println("Phương trình vô nghiệm");
            return;
        }
        if(a == 0){
            System.out.println("Phương trình có nghiệm: " + "x = " + (-c / b));
            return;
        }

        //tính delta
        float delta = b*b - 4*a*c;
        float x1, x2;

        //tìm nghiệm
        if(delta > 0){
            x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
            x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
            System.out.println("Phương trình có 2 nghiệm là: "+"x1 = " + x1 + " và x2 = " + x2);
        }
        else if(delta == 0){
            x1 = (-b /(2 * a));
            System.out.println("Phương trình có nghiệm kép là: x1 = " + x1);
        }
        else{
            System.out.println("Phương trình vô nghiêm!");
        }
    }
}

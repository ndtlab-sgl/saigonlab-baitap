package edu.saigon.excercise.tuananh;

import java.util.Scanner;

public class UCLN_BCNN {

    private double a;
    private double b;
    private double ucln;
    private double bcnn;

    public UCLN_BCNN() {
    }

    public UCLN_BCNN(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public void Nhap(){
        double A,B;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap A= ");
        A=sc.nextDouble();
        System.out.println("Nhap B= ");
        B=sc.nextDouble();
        setA(A);
        setB(B);
    }

    public void XuatKQ(){
        System.out.println(toString());
        ucln=timUCLN(getA(),getB());
        bcnn=timBCNN(getA(),getB());
        System.out.println("\nUCLN la: "+ucln+"\nBCNN la: "+bcnn);
    }

    public double timUCLN(double a, double b){
        while (a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    public double timBCNN(double a, double b){
        return  (a*b)/timUCLN(a,b);
    }

    @Override
    public String toString() {
        return "UCLN_BCNN{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

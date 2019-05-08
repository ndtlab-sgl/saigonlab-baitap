package edu.saigon.excercise.tuananh;

import java.util.Scanner;

public class UCLNBCNN {

    private double a;
    private double b;
    private double ucln;
    private double bcnn;

    public UCLNBCNN() {
    }

    public UCLNBCNN(double a, double b) {
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


    public void nhapN(){

        double A;
        double B;

        Scanner sc = new Scanner(System.in);

        System.out.println("nhapN A= ");
        A=sc.nextDouble();

        System.out.println("nhapN B= ");
        B=sc.nextDouble();

        setA(A);
        setB(B);
    }

    public void xuatKQ(){
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
        return "UCLNBCNN{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

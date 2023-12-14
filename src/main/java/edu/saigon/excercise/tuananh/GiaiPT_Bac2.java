package edu.saigon.excercise.tuananh;

import java.util.Scanner;

public class GiaiPT_Bac2 {

    private double a;
    private double b;
    private double c;

    public GiaiPT_Bac2() {
    }

    public GiaiPT_Bac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void NhapCacHeSo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so bac 2 a= ");
        a=sc.nextDouble();
        System.out.println("Nhap he so bac 1 b= ");
        b=sc.nextDouble();
        System.out.println("Nhap he so tu do c= ");
        c=sc.nextDouble();
        setA(a);
        setB(b);
        setC(c);
    }

    public void XuatKetQua(){
        toString();
        BienLuanPT();
    }

    public double TinhDelta(){
        return  (getB()*getB())-4*getA()*getC();
    }

    public void BienLuanPT(){
        if(a==0){
            if(b==0 && c==0) {
                System.out.println("PT co vo so nghiem");
            }
            if(b!=0){
                System.out.println("PT co 1 nghiem la: "+-getC()/getA());
            }

        }
        else{
            if (TinhDelta()<0)
                System.out.println("PT vo nghiem");
            if(TinhDelta()==0)
                System.out.println("PT co nghiem kep x=y= "+-getB()/(2*getA()));
            if(TinhDelta()>0){
                System.out.println("PT co 2 nghiem la\n x="
                        +(-getB()+Math.sqrt(TinhDelta())/(2*getA()))
                        +"\n y="
                        +(-getB()-Math.sqrt(TinhDelta()))/(2*a)
                );
            }
        }

    }

    @Override
    public String toString() {
        return "GiaiPTBac_2{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ",Delta="+TinhDelta()+
                '}';
    }
}

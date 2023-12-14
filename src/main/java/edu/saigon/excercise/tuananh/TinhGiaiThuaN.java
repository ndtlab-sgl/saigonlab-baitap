package edu.saigon.excercise.tuananh;

import java.util.Scanner;

public class TinhGiaiThuaN {

    private double n;

    public TinhGiaiThuaN() {
    }

    public TinhGiaiThuaN(double n) {
        this.n = n;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public void Nhap_N(){
        double N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N=");
        N=sc.nextDouble();
        setN(N);
    }

    public void XuatKQ(){
        System.out.println(toString());
        System.out.println("Ket qua la: "+TinhGiaiThua());
    }

    public double TinhGiaiThua(){
        double n=getN(), p=1;
        for (int i = 1; i <= n; i++){
            p*=i;
        }
        return p;
    }

    @Override
    public String toString() {
        return "TinhGiaiThua_N{" +
                "n=" + getN() +
                '}';
    }
}

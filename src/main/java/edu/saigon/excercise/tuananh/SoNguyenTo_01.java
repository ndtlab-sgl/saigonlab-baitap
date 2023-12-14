package edu.saigon.excercise.tuananh;

import java.util.Scanner;

public class SoNguyenTo_01 {

    private double n;

    public SoNguyenTo_01() {
    }

    public SoNguyenTo_01(double n) {
        this.n = n;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public void NhapN(){
        double N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N= ");
        N=sc.nextDouble();
        setN(N);
    }

    public boolean checkSoNT(double a){
        for(int i=2; i<a ; i++){
            if(a%i==0)
                return false;
        }
        return true;
    }

    public void XuatSoNT(double n){
        for (int i=1;i<n;i++)
        {
            if(checkSoNT(i)==true)
                System.out.println(" "+i);
        }
    }

    public void XuatKQ(){
        toString();
        XuatSoNT(getN());
    }

    @Override
    public String toString() {
        return "SoNguyenTo_01{" +
                "n=" + n +
                '}';
    }
}

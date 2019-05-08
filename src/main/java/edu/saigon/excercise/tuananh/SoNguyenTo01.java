package edu.saigon.excercise.tuananh;

import java.util.Scanner;

public class SoNguyenTo01 {

    private double n;

    public SoNguyenTo01() {
    }

    public SoNguyenTo01(double n) {
        this.n = n;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public void nhapN(){
        double N;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhapN N= ");
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

    public void xuatSoNT(double n){
        for (int i=1;i<n;i++)
        {
            if(checkSoNT(i)==true)
                System.out.println(" "+i);
        }
    }

    public void xuatKQ(){
        toString();
        xuatSoNT(getN());
    }

    @Override
    public String toString() {
        return "SoNguyenTo01{" +
                "n=" + n +
                '}';
    }
}

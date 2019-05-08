package edu.saigon.excercise.tuananh;

import java.util.Scanner;

public class TongChuSo {

    private int n;

    public TongChuSo() {
    }

    public TongChuSo(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void NhapN(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhapN N= ");
        N=sc.nextInt();
        setN(N);
    }

    public int tinhTongChuSo(int n){
        int s=0,cd;
        while(n!=0){
            cd=n%10;
            s+=cd;
            n=n/10;
        }
        return s;
    }
    public void xuatKQ(){
        System.out.println(toString());
        System.out.println("Tong cac chu so la: "+tinhTongChuSo(getN()));
    }

    @Override
    public String toString() {
        return "TongChuSo{" +
                "n=" + n +
                '}';
    }
}

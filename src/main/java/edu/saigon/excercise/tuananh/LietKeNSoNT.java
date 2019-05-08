package edu.saigon.excercise.tuananh;

import java.util.Scanner;

public class LietKeNSoNT {

    private int n;

    public LietKeNSoNT() {
    }

    public LietKeNSoNT(int n) {
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

    public boolean checkSoNT(double a){
        for(int i=2; i<a ; i++){
            if(a%i==0)
                return false;
        }
        return true;
    }

    public void xuatNSoNT(int n){
        for (int i =1; i < n ; i++)
            if(checkSoNT(i)==true)
                System.out.printf("\t"+i);
    }
    public void xuatKQ(){
        xuatNSoNT(getN());
    }
}

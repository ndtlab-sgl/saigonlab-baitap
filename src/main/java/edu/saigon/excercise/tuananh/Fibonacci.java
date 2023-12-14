package edu.saigon.excercise.tuananh;

import java.util.Scanner;

public class Fibonacci {

    private int n;

    public Fibonacci() {
    }

    public Fibonacci(int n) {
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
        System.out.println("Nhap N= ");
        N=sc.nextInt();
    }

    public int timSoFibonacci(int n){
        int f0=1,f1=1,fn=1;
        if(n<0)
            return -1;
        if(n==0||n==1)
            return 1;
        if (n>1)
            for (int i =2; i < n; i++){
                f0=f1;
                f1=fn;
                fn=f0+f1;
            }
        return fn;
    }

    public void xuatKQ(){
        System.out.println("So Fibonacci thu n la: "+timSoFibonacci(getN()));
    }
}

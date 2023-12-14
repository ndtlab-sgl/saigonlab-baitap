package edu.saigon.excercise.tuananh;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci_NT {

    private int n;

    public Fibonacci_NT() {
    }

    public Fibonacci_NT(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Fibonacci_NT{" +
                "n=" + n +
                '}';
    }

    public void xuatKQ() {
        System.out.println(toString());
        timSoFB_NT(getN());
    }

    public boolean checkSoNT(double a) {
        if (a == 0)
            return true;
        if (a == 1)
            return true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public void timSoFB_NT(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int temp =timSoFibonacci(i);
            list.add(temp);
        }
        for (int i = 0; i < list.size(); i++) {
            if (checkSoNT(list.get(i)))
                System.out.print("\t" + list.get(i));
        }
    }

    public int timSoFibonacci(int n) {
        int f0 = 0, f1 = 1, fn = 1;
        if (n < 0) {
            return -1;
        } else if (n == 0 ) {
            return n;
        }
        else if(n==1){
            return n;
        }
        else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            return fn;
        }

    }
}
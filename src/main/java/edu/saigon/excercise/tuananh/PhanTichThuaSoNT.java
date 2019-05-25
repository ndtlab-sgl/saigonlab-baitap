package edu.saigon.excercise.tuananh;

public class PhanTichThuaSoNT {

    private int n;

    public PhanTichThuaSoNT() {
    }

    public PhanTichThuaSoNT(int n) {
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
        return "PhanTichThuaSoNT{" +
                "n=" + n +
                '}';
    }

    public void xuatKQ(){
        System.out.println(toString());
        System.out.print(n+"=");
        phanTichThuaSoNT(getN());
    }



    public boolean checkSoNT(double a){
        for(int i=2; i<a ; i++){
            if(a%i==0)
                return false;
        }
        return true;
    }

    public void phanTichThuaSoNT(int n){
        int i=2;
        if(checkSoNT(n))
            System.out.println(n);
        while (n!=1){
            if (n%i==0){
                System.out.print(i+"x");
                n=n/i;
            }
            else
                i++;
        }
        System.out.println("\b");
    }
}

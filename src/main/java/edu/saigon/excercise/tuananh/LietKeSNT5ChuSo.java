package edu.saigon.excercise.tuananh;

public class LietKeSNT5ChuSo {

    public LietKeSNT5ChuSo() {

    }

    public boolean checkSoNT(double a){
        for(int i=2; i<a ; i++){
            if(a%i==0)
                return false;
        }
        return true;
    }

    public void xuatSNT_5ChuSo(){
        for (int i=10001 ;i < 100000 ; i+=2){
            if(checkSoNT(i)==true)
                System.out.println(i);
        }
    }
}

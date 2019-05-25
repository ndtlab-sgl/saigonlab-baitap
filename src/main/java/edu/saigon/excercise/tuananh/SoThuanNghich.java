package edu.saigon.excercise.tuananh;

import java.util.ArrayList;
import java.util.List;

public class SoThuanNghich {

    public void xuatKQ(){
        timSoThuanNghich();
    }

    public void timSoThuanNghich(){
        for (int i = 100000; i < 999999; i++ ){
            if(kiemTraThuanNghich(i)){
                System.out.println(i);
            }
        }
    }

    public boolean kiemTraThuanNghich(int n){
        List<Integer> list = new ArrayList<Integer>();
        while (n!=0){
            list.add(n%10);
            n=n/10;
        }
        int k= list.size()/2;
        for (int i=0; i<k; i++){
            if(list.get(i) != list.get(list.size()-i-1))
                return false;
        }
        return true;
    }
}

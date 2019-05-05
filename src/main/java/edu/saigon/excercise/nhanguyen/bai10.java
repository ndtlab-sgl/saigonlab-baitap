package edu.saigon.excercise.nhanguyen;

import java.util.ArrayList;
import java.util.List;

public class bai10 {

    public static void main(String[] args){
        System.out.println("Các số thuân nghich có 6 chữ số là: ");
        for(int i = 100000; i < 1000000; i++){
            if(kiemTraThuanNghich(i) == true){
                System.out.println(i);
            }
        }
    }

    private static boolean kiemTraThuanNghich(int i) {
        List<Integer> listNumbers = new ArrayList<Integer>();
        while (i > 0){
            listNumbers.add(i % 10);
            i = i / 10;
        }
        int size = listNumbers.size();
        for(int j = 0; j < (size/2); j++){
            if(listNumbers.get(j) != listNumbers.get(size - j -1)){
                return false;
            }
        }
        return true;
    }
}

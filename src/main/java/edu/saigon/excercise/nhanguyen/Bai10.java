package edu.saigon.excercise.nhanguyen;

import java.util.ArrayList;
import java.util.List;

public class Bai10 {

    public static void main(String[] args){
        System.out.println("Các số thuân nghich có 6 chữ số là: ");
        for(int i = 100000; i < 1000000; i++){
            if(kiemTraThuanNghich(i)){
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
            boolean flag = listNumbers.get(j).equals(listNumbers.get(size - j -1));
            if(!flag){
                return false;
            }
        }
        return true;
    }
}

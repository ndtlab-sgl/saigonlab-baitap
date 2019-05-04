package edu.saigon.excercise.hoquocthong;

import java.util.ArrayList;
import java.util.List;

public class Bai_10 {
    public static void main(String[] args) {
        Bai_10 bai10 = new Bai_10();
        for (int i = 100000; i < 1000000; i++) {
            if (bai10.kiemTraSoThuanNghich(i)) {
                System.out.print(i+"\t");
            }
        }
    }

    private boolean kiemTraSoThuanNghich(int value) {
        List<Integer> listNumbers = new ArrayList<Integer>();
        do {
            listNumbers.add(value % 10);
            value = value / 10;
        } while (value > 0);
        int size = listNumbers.size();
        for (int i = 0; i < (size / 2); i++) {
            if (!listNumbers.get(i).equals(listNumbers.get(size - i - 1))) {
                return false;
            }
        }
        return true;
    }
}

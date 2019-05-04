package edu.saigon.excercise.hoquocthong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        value = scanner.nextInt();
        if (value < 0) {
            System.out.println("So nhap vao phai lon hon 0");
        }
        if (value >= 0) {
            Bai_8 bai8 = new Bai_8();
            bai8.xuat(value);
        }
    }

    private List<Integer> phanTichThuaSo(int value) {
        int i = 2;
        List<Integer> list = new ArrayList<Integer>();
        while (value > 1) {
            if (value % i == 0) {
                value = value / i;
                list.add(i);
            } else {
                i++;
            }
        }
        if (list.isEmpty()) {
            list.add(value);
        }
        return list;
    }

    private void xuat(int value) {
        List<Integer> list = phanTichThuaSo(value);
        System.out.print("Phan tich thua so nguyen to cua " + value +" = ");
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(list.get(i) + " x ");
        }
        System.out.print(list.get(size - 1));
    }
}

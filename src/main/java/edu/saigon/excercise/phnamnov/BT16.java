package edu.saigon.excercise.phnamnov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class BT16 {
    public static void inCacSoXuatHien2Lan(Map<Integer, Integer> map) {
        map.forEach((number, count) -> {
            if (count == 2) {
                String output = String.format("%d ", number);
                System.out.print(output);
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("Chương trình in các phần tử xuất hiện trong mảng đúng 2 lần");

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> array = BT15.inputIntArray(scan);

        Map<Integer, Integer> result = BT17.tinhSoLanXuatHienCuaPhanTu(array);

        System.out.println("Các phần tử xuất hiện 2 lần trong mảng:");
        inCacSoXuatHien2Lan(result);

        scan.close();
    }
}

package edu.saigon.excercise.phnamnov;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class BT15 {

    public static ArrayList<Integer> inputIntArray(Scanner scan) {
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Nhập chiều dài mảng: ");
        int length = scan.nextInt();

        for (int i=0; i < length; i++) {
            String format = String.format("Mảng[%d]: ", i);
            System.out.print(format);
            array.add(scan.nextInt());
        }

        return array;
    }

    public static void inCacSoXuatHien1Lan(Map<Integer, Integer> map) {
        map.forEach((number, count) -> {
            if (count == 1) {
                String output = String.format("%d ", number);
                System.out.print(output);
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("Chương trình in các phần tử xuất hiện trong mảng đúng 1 lần");

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> array = inputIntArray(scan);

        Map<Integer, Integer> result = BT17.tinhSoLanXuatHienCuaPhanTu(array);

        System.out.println("Các phần tử xuất hiện 1 lần trong mảng:");
        inCacSoXuatHien1Lan(result);

        scan.close();
    }
}

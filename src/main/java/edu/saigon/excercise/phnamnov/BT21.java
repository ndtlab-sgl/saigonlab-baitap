package edu.saigon.excercise.phnamnov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BT21 {
    public static ArrayList<Integer> taoMangTu2Mang(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> array3 = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < array1.size() && j < array2.size()) {
            int indexArray1 = array1.get(i);
            int indexArray2 = array2.get(j);

            if (indexArray1 < indexArray2) {
                array3.add(indexArray1);
                i++;
            } else {
                array3.add(indexArray2);
                j++;
            }
        }

        while (i<array1.size()) {
            int index = array1.get(i);
            array3.add(array1.get(i));
            i++;
        }

        while (j<array2.size()) {
            int index = array2.get(j);
            array3.add(index);
            j++;
        }

        return array3;
    }

    public static void main(String[] args) {
        System.out.println("Chương trình tạo mảng tăng dần từ 2 mảng tăng dần");

        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập các phần tử của mảng 1");
        ArrayList<Integer> array1 = BT15.inputIntArray(scan);

        System.out.println("Nhập các phần tử của mảng 2");
        ArrayList<Integer> array2 = BT15.inputIntArray(scan);

        ArrayList<Integer> array3 = taoMangTu2Mang(array1, array2);

        System.out.println("\nMảng 1: ");
        System.out.println(array3);
        System.out.println("\nMảng 2: ");
        System.out.println(array3);
        System.out.println("\nMảng 3: ");
        System.out.println(array3);

        scan.close();
    }
}

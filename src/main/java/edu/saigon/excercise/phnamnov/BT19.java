package edu.saigon.excercise.phnamnov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BT19 {

    public static void sapXepMangGiamDan(ArrayList<Integer> array) {

        array.sort((indexA, indexB) -> {
            return indexB - indexA;
        });

    }

    public static void main(String[] args) {
        System.out.println("Chương trình sắp xếp mảng giảm dần");
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> array = BT15.inputIntArray(scan);
        sapXepMangGiamDan(array);
        System.out.println(array);

        scan.close();
    }
}

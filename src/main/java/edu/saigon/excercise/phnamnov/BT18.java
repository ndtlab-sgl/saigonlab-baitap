package edu.saigon.excercise.phnamnov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BT18 {
    public static void main(String[] args) {
        System.out.println("Chương trình sắp xếp mảng tăng dần");

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> array = BT15.inputIntArray(scan);
        Collections.sort(array);

        System.out.println(array);

        scan.close();
    }
}

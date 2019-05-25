package edu.saigon.excercise.phnamnov;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BT20 {
    public static void chenPhanTu(int x, ArrayList<Integer> array){
        for (int i=0; i < array.size(); i++) {
            if (x > array.get(i)) continue;
            array.add(i, x);
            return;
        }
    }
    public static void main(String[] args) {
        System.out.println("Chương trình chèn phần tử x vào mảng tăng dần");

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = BT15.inputIntArray(scan);

        System.out.print("Nhập phần tử chèn x: ");

        int x = scan.nextInt();

        chenPhanTu(x, array);

        /*array.add(x);
        Collections.sort(array);
        */
        System.out.println(array);

        scan.close();
    }
}

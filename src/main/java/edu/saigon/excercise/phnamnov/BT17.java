package edu.saigon.excercise.phnamnov;

import java.util.*;

public class BT17 {

    public static Map<Integer, Integer> tinhSoLanXuatHienCuaPhanTu(ArrayList<Integer> array) {
        Collections.sort(array);
        HashMap<Integer, Integer> map = new HashMap<>();
        int preIndex = array.get(0);
        int count = 0;
        for (Integer index : array) {
            if (index == preIndex) {
                count = count + 1;
                continue;
            }

            map.put(preIndex, count);

            count = 1;
            preIndex = index;
        }

        map.put(preIndex, count);

        return map;
    }
    public static void inSoLanXuatHienCuaPhanTu(Map<Integer, Integer> map) {
        map.forEach((number, count) -> {
            String output = String.format("Phần tử %d lần xuất hiện %d", number, count);
            System.out.println(output);
        });
    }
    public static void main(String[] args) {

        System.out.println("Chương trình in số lần xuất hiện của các phần tử trong mảng");

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> array = BT15.inputIntArray(scan);

        System.out.println("\nCác phần tử trong mảng:");
        Map<Integer, Integer> result = tinhSoLanXuatHienCuaPhanTu(array);

        inSoLanXuatHienCuaPhanTu(result);

        scan.close();
    }
}

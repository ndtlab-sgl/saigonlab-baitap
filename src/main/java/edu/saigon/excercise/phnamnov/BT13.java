package edu.saigon.excercise.phnamnov;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class BT13 {
    private static void increaseValueOf(String key, HashMap<String, Integer> map) {
        Integer value = map.get(key);
        if (value != null) {
            map.replace(key, value + 1);
        } else {
            map.put(key, 1);
        }
    }

    public static Map<String, Integer> countRepeatedWord(String string) {
        HashMap<String, Integer> map = new HashMap<>();

        String regex = Pattern.quote(" ");
        System.out.println("regex " + regex);
        String[] split = string.split(regex);

        for (String word : split) {
            increaseValueOf(word, map);
        }

        return map;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Đếm só lần xuất hiện các từ trong chuỗi");
        System.out.print("Nhập chuỗi: ");
        String string = scan.nextLine();
        Map<String, Integer> map = countRepeatedWord(string);
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String result = String.format("word %s: %d", key, map.get(key));
            System.out.println(result);
        }
    }
}

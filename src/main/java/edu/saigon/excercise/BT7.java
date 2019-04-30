package edu.saigon.excercise;

public class BT7 {
    public static void lietKeCacSoNguyenToCo5ChuSo() {
        for (int i=10000; i< 100000; i++) {
            if (BT5.laSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Chương trình liệt kê các số nguyên tố có 5 chữ số");
        lietKeCacSoNguyenToCo5ChuSo();
    }
}

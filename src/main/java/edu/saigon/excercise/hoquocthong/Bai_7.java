package edu.saigon.excercise.hoquocthong;


public class Bai_7 {
    public static void main(String[] args) {
        Bai_7 bai7 = new Bai_7();
        bai7.xuatDaySNT();
    }

    private boolean kiemTraSNT(int value) {
        if (value == 1 || value == 2) {
            return true;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void xuatDaySNT() {
        System.out.print("Day so nguyen to co 5 chu so la : ");
        for (int i = 10000; i < 100000; i++) {
            if (kiemTraSNT(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

package edu.saigon.excercise.nhanguyen;


public class bai7 {

    public static void main(String[] args){
        System.out.println("Số nguyên tố có 5 chữ số là: ");
        timSNTCo5ChuSo();
    }

    private static void timSNTCo5ChuSo() {
        for(int i = 10001; i < 99999; i++){
            if(kiemTraSoNguyenTo(i) == true){
                System.out.println(i);
            }
        }

    }

    private static boolean kiemTraSoNguyenTo(int i) {
        if (i < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(i);
        for (int j = 2; j <= squareRoot; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}

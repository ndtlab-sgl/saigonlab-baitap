package edu.saigon.excercise.nhanguyen;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai08 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Nhập sô nguyên dương n = ");
        int n = scanner.nextInt();

        List<Integer> listNumbers = phanTichSoNguyenTo(n);
        System.out.print("Kết quả " + n +" = ");

        int size = listNumbers.size();
        for(int i = 0; i < size - 1; i++){
            System.out.print(listNumbers.get(i) + " x ");
        }
        System.out.print(listNumbers.get(size - 1));
    }

    private static List<Integer> phanTichSoNguyenTo(int n) {
        int i = 2;
        List<Integer> listNumbers = new ArrayList<Integer>();
        while (n > 1){
            if(n % i == 0){
                n = n / i;
                listNumbers.add(i);
            }
            else {
                i++;
            }
        }
        if(listNumbers.isEmpty()){
            listNumbers.add(n);
        }
        return listNumbers;
    }
}

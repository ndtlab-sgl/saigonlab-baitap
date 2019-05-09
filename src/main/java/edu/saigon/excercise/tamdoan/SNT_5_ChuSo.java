package edu.saigon.excercise.tamdoan;

public class SNT_5_ChuSo {
    public static void main(String[] args) {
        SNT_5_chuSo();


    }
    public static void SNT_5_chuSo()
    {
        System.out.println("Số nguyên tố có 5 chữ số là: ");
        for(int i = 10000; i <= 99999; i++)
        {
            if(SoNguyenTo.KiemTra_SNT(i))
                System.out.println(i);
        }
    }
}

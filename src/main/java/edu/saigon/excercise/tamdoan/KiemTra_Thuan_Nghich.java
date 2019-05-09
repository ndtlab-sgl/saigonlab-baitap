package edu.saigon.excercise.tamdoan;

public class KiemTra_Thuan_Nghich {
    public static void main(String[] args) {
        System.out.print("Danh sách số thuận nghịch có 6 chữ số là: ");
        Thuan_Nghich();

    }
    public static void Thuan_Nghich()
    {
        for(int i = 100000; i <= 999999; i++)
        {
            int temp = i;
            int Nhan = 100000;
            int KQ = 0;
            while(temp>0)
            {
                KQ = KQ + ((temp%10) * Nhan);
                Nhan = Nhan/10;
                temp = temp/10;
            }
            if(KQ == i)
                System.out.println(i);
        }
    }
}

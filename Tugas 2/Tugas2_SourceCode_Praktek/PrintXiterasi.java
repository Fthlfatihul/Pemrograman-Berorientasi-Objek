import java.util.Scanner;

public class PrintXiterasi{
    public static void main(String[] args){
        int Sum=0;
        int x;
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai x (int), akhiri dengan 999 : " );
        x = masukan.nextInt();
        if (x == 999){
            System.out.print (" Kasus Kosong \n");
        } else{
            Sum = x;
            for (;;){
                System.out.print("Masukkan Nilai x (int), akhiri dengan 999 : " );
                x = masukan.nextInt();
                if(x==999){
                    break;
                }else {
                    Sum= Sum + x;
                }
            }
        }
        System.out.println("Hasil Penjumlahan : "+ Sum);
    }
}
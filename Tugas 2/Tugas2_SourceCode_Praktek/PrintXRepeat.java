import java.util.Scanner;
public class PrintXRepeat {
    public static void main(String[] arsg){
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan NIlai x (int), akhiri dengan 999 : ");
        x = masukan.nextInt();
        if (x == 999){
            System.out.println("Kasus Kosong \n");
        } else {
            Sum = 0;
            do {
                Sum = Sum + x;
                System.out.print("Masukkan Nilai X (int), akhiri dengan 999 : ");
                x = masukan.nextInt();
            } while (x != 999);
            System.out.println("Hasil Penjumlahan : " + Sum );
        }
    }
}
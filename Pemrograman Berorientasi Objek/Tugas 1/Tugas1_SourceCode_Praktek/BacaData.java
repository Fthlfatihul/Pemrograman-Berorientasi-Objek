/*  Muh. Fatihul Ihsan
    13020240107
    A3
    Jumat, 03 April 2026, 20.00*/
import java.util.Scanner;

public class BacaData{
    public static void main (String[] args){
        int a;
        Scanner masukan;

        System.out.println("Contoh Membaca dan menulis, ketik integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt();
        System.out.println("Nilai yang dibaca : " + a); 
    }
}
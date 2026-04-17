/* Muh. Fatihul Ihsan 
    13020240107
    A3
    16 April 2026 21.00*/
import java.util.Scanner;
public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Jumlah MK : ");
        int jumlahMK = sc.nextInt();
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jumlahMK);
        mahasiswa.inputNilai(sc);
        mahasiswa.tampilRaport();
    }
}

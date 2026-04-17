/* Muh. Fatihul Ihsan 
    13020240107
    A3
    16 April 2026 21.00*/
import java.util.Scanner;
public class Mahasiswa {
    private  String nama;
    private String nim;
    private int[] nilai;
    private int jumlahMK;
    
    public Mahasiswa(String nama, String nim,  int jumlahMK ){
        this.nama = nama;
        this.nim = nim;
        this.jumlahMK = jumlahMK;
        this.nilai = new int[jumlahMK];
    }
    public void inputNilai(Scanner sc){
        for (int i=0; i < jumlahMK; i++){
            System.out.print("Nilai Mk-" + (i+1)+ ": ");
            nilai[i] = sc.nextInt();
        }
    }
    public double hitungRataRata(){
        double total = 0;
        for (int i=0; i < jumlahMK; i++){
            total += nilai[i];
        }
        return  total / jumlahMK;
    }
    public char tentukanGrader(){
        if(hitungRataRata() >= 85){
            return 'A';
        }else if(hitungRataRata() >= 75){
            return 'B';
        }else if(hitungRataRata() >= 60){
            return 'C';
        }else if(hitungRataRata() >= 50){
            return 'D';
        }else{
            return 'E';
        }
    }

    public boolean lulus(){
        return hitungRataRata() >= 60;
    }
    public void tampilRaport(){
        System.out.println("\n=== Rapor ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai : ");
        for (int i = 0; i<jumlahMK; i++){
            System.out.println("Mk-" + (i+1) + ": " +nilai[i]);
        }
        System.out.println("Rata : " + hitungRataRata());
        System.out.println("Grade : " + tentukanGrader());
        System.out.println("Lulus : " + lulus());
    }
}

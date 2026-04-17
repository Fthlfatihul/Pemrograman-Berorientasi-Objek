import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Todal Detik : ");
        long totalDetik = sc.nextLong();
        
        KonversiJam konversi = new KonversiJam(totalDetik);
        konversi.konversi();
        konversi.tampilkanHasil();
    }
}
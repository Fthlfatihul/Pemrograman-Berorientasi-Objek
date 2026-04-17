/* Muh. Fatihul Ihsan 
    13020240107
    A3
    16 April 2026 21.00*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        char repeat;
        do {
             Scanner sc = new Scanner (System.in);
            System.out.print("Angka 1: ");
            double angka1 = sc.nextDouble();
            System.out.print("Angka 2: ");
            double angka2 = sc.nextDouble();
            System.out.print("Operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            Kalkulator kalkulator = new Kalkulator(angka1, angka2, operator);
            kalkulator.tampilkanHasil();
            
            System.out.print("\nHitung lagi? (y/n):");
            repeat = sc.next().charAt(0);
        } while (repeat == 'y' || repeat == 'Y');
        System.out.println("Terima kasih telah menggunakan kalkulator!");
    }
}

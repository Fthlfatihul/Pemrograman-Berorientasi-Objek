/*  Muh. Fatihul Ihsan
    13020240107
    A3
    Jumat, 03 April 2026, 20.00*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.Console;

public class Bacakar {
    public static void main(String[] args) throws IOException {
        
        char cc; 
        int bil;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        BufferedReader dataIn1 = new BufferedReader(new InputStreamReader(System.in));

        //BuffereReader
        System.out.print("Hello\n");
        System.out.print("Baca 1 karakter : ");
        cc = dataIn.readLine().charAt(0);

        System.out.print("Baca 1 Bilangan : ");
        bil = Integer.parseInt(dataIn.readLine());
        System.out.println("Buffer");
        System.out.print(cc + "\n" + bil + "\n");

        //scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Scanner Baca 1 Karakter : ");
        char cc1 = sc.next().charAt(0);
        System.out.print("Scanner Baca 1 Bilangan : ");
        int bil1 = sc.nextInt();
        System.out.println("Scanner");
        System.out.print(cc1 + "\n" + bil1 + "\n");

        //Console
        Console con = System.console();
        String conChar = con.readLine("console Baca 1 Karakter : ");
        char cc2 = conChar.charAt(0);
        String conBil = con.readLine("Console Baca 1 Bilangan : ");
        int bil2 = Integer.parseInt(conBil);
        System.out.println("Console");
        System.out.print(cc2 + "\n" + bil2 +"\n");

        //jOptionPane
        String jkar = JOptionPane.showInputDialog("Karakter 1 : ");
        char cc3 = jkar.charAt(0);
        String jbil = JOptionPane.showInputDialog("Bilangan 1 : ");
        int bil3 = Integer.parseInt(jbil);
        System.out.println("JOptionPane"); 
        System.out.print(cc3 + "\n" + bil3 + "\n");
    }
}
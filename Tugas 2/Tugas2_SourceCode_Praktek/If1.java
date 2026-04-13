import java.util.Scanner;

public class If1{
    public static void main(String[] args){
        Scanner masukan = new Scanner (System.in);
        int a;

        System.out.print("Contoh IF satu kasus \n");
        System.out.print("Ketika Suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >=0)
        System.out.print ("\nNilai a Positif");
    }
}
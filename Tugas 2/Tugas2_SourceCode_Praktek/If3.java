import java.util.Scanner;

public class If3{
    public static void main(String[] args){
        int a;
        Scanner masukan = new Scanner(System.in);
        System.out.print ("Contoh If tiga kasus \n");
        System.out.print ("Ketika suatu nilai integer : ");
        a = masukan.nextInt();
        if(a > 0){
            System.out.println("Nilai a positif "+ a);
        }else if(a == 0){
            System.out.println("NIlai NOl "+ a);
        }else{
            System.out.println ("Nilai A negatif ");
        }
    }
}
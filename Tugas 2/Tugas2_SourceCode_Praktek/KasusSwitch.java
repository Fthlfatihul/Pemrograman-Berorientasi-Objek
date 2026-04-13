import java.util.Scanner;

public class KasusSwitch{
    public static void main(String[] args){
        char cc;
        Scanner masukan = new Scanner(System.in);
        System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
        cc = masukan.next().charAt(0);
        switch(cc){
            case 'a' :
                System.out.print("Yang anda ketik adalah huruf a");
                break;
            case 'u' :
                System.out.print("Yang anda ketik adalah huruf u");
                break;
            case 'e':
                System.out.print("Yang anda ketik adalah huruf e");
                break;
            case 'i':
                System.out.print("Yang anda ketik adalah huruf i");
                break;
            case 'o':
                System.out.print("Yang anda ketik adalah huruf o");
                break;
            default :
                System.out.print("Yang anda ketik adalah huruf mati");
        }
    }
}
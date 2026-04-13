import java.util.Scanner;

public class Max2{
    public static void main(String[] args){
        int a, b;
         Scanner masukan = new Scanner (System.in);

        System.out.print ("Maksimun dua bilangan : \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.print("Ke dua bilangan :  a = " + a + "  b = "+b+"\n");
        if(a >= b){
            System.out.println("Nilai a yang maksimum " + a);
        }else {
            System.out.println("Nilai b yang maksimum "+ b);
        }
    }
}
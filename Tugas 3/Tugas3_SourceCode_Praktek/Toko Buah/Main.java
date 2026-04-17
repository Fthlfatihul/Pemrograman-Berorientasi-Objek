import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Buah katalog[] = new Buah[3];
    int pilih = 0;
    double total = 0;

    katalog[0] = new Buah("Semangka", 15000, 10);
    katalog[1] = new Buah("Nangka", 12000, 8);
    katalog[2] = new Buah("Mangga", 20000, 5);
    
    for (int i = 0; i < katalog.length; i++){
        System.out.println((i+1) + ". " + katalog[i].getInfo());
    }
    
    do {
        System.out.print("Pilih (0 = Stop) : ");
        pilih = sc.nextInt();
        if(pilih != 0){
             System.out.print("Jumlah(kg) : " );
            int qty = sc.nextInt();
            if(katalog[pilih-1].tersedia(qty)){
                System.out.println("Ok +Rp"+ String.format("%,.0f", katalog[pilih-1].hitungTotal(qty))+"\n");
                total += katalog[pilih-1].hitungTotal(qty);
            }else {
                System.out.println("Stok Tidak Cukup!\n");
            }
    }
    }while (pilih != 0);
    System.out.println("Total : Rp " + String.format("%,.0f", total));
    sc.close();
    }
}
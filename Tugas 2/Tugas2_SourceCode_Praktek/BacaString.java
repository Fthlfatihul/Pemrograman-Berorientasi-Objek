import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class BacaString{
    public static void main(String[] args) throws IOException {
        String str;

        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nBaca String dan Integer: \n");
        System.out.print("Masukkan Sebuah string: ");
        str = datAIn.readLine();
        System.out.print("String yang dibaca : "+ str);
    }
}
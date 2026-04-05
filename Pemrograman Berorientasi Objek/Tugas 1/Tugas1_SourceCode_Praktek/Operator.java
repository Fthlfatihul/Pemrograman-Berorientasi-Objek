/*  Muh. Fatihul Ihsan
    13020240107
    A3
    Jumat, 03 April 2026, 20.00*/
public class Operator {
    public static void main(String[] args) {

        boolean Bool1, Bool2, TF ;
        int i,j, hsl ;
        float x,y,res;

        System.out.println ("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
        System.out.println("Operator Logika");
                Bool1 = true; Bool2 = false;
                TF = Bool1 && Bool2 ; /* Boolean AND */ 
                System.out.println("Operator AND : " + Bool1 + " && " + Bool2 + " = " + TF);
                TF = Bool1 || Bool2 ; /* Boolean OR */
                System.out.println("Operator OR : " + Bool1 + " || " + Bool2 + " = " + TF);
                TF = ! Bool1 ; /* NOT */
                System.out.println("Operator NOT : !" + Bool1 + " = " + TF);
                TF = Bool1 ^ Bool2; /* XOR */
                System.out.println("Operator XOR : " + Bool1 + " ^ " + Bool2 + " = " + TF);

                /* operasi numerik */
                System.out.println("\nOperator Numerik");
                i = 5; j = 2 ;
                hsl = i+j;
                System.out.println("Operator + : " + i + " + " + j + " = " + hsl);
                hsl = i - j;
                System.out.println("Operator - : " + i + " - " + j + " = " + hsl);
                hsl = i / j;
                System.out.println("Operator / : " + i + " / " + j + " = " + hsl);
                hsl = i * j;
                System.out.println("Operator * : " + i + " * " + j + " = " + hsl);
                hsl = i /j ; /* pembagian bulat */
                System.out.println("Operator / (pembagian bulat) : " + i + " / " + j + " = " + hsl);
                hsl = i%j ; /* sisa modulo */
                System.out.println("Operator % (modulo) : " + i + " % " + j + " = " + hsl);

                /* operasi numerik */
                System.out.println("\nOperator Numerik dengan tipe data float");
                x = 5 ; y = 5 ;
                res = x + y;
                System.out.println("Operator + : " + x + " + " + y + " = " + res);
                res = x - y;
                System.out.println("Operator - : " + x + " - " + y + " = " + res);
                res = x / y;
                System.out.println("Operator / : " + x + " / " + y + " = " + res);
                res = x * y;
                System.out.println("Operator * : " + x + " * " + y + " = " + res);

                //operasi relasional numerik
                System.out.println("\nOperator Relasional Numerik");
                TF = (i==j);
                System.out.println("Operator == : " + i + " == " + j + " = " + TF);
                TF = (i!=j);
                System.out.println("Operator != : " + i + " != " + j + " = " + TF);
                TF = (i < j);
                System.out.println("Operator < : " + i + " < " + j + " = " + TF);
                TF = (i > j);
                System.out.println("Operator > : " + i + " > " + j + " = " + TF);
                TF = (i <= j);
                System.out.println("Operator <= : " + i + " <= " + j + " = " + TF);
                TF = (i >= j);
                System.out.println("Operator >= : " + i + " >= " + j + " = " + TF);

                /* operasi relasional numerik */ 
                System.out.println("\nOperator Relasional Numerik dengan tipe data float");
                TF = (x != y);
                System.out.println("Operator != : " + x + " != " + y + " = " + TF);
                TF = (x < y);
                System.out.println("Operator < : " + x + " < " + y + " = " + TF);
                TF = (x > y);
                System.out.println("Operator > : " + x + " > " + y + " = " + TF);                        
                TF = (x <= y);
                System.out.println("Operator <= : " + x + " <= " + y + " = " + TF);
                TF = (x >= y);
                System.out.println("Operator >= : " + x + " >= " + y + " = " + TF);
        }
}
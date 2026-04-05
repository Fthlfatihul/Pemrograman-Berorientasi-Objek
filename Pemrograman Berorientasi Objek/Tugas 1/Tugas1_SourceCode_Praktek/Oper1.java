/*  Muh. Fatihul Ihsan
    13020240107
    A3
    Jumat, 03 April 2026, 20.00*/
public class Oper1 {
    public static void main(String[] args) {
        
        int n = 10;
        int x = 1;
        int y = 2;
        
        System.out.println ("n = "+ n);
        System.out.println ("x = "+ x);
        System.out.println ("y = "+ y);
        System.out.println("n & 8 = "+ (n & 8)); /* 1010 AND 1000 */
        System.out.println ("x & ~ 8 = "+ (x & ~8)); /* 1 AND 0111 */ 
        System.out.println ("y << 2 = "+ (y << 2)); /*10==> 1000 = 8 */ 
        System.out.println ("y >> 3 = "+ (y >>3)); /*10 ==>0000 = 0 */
    } 
}
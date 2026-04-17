public class Kalkulator {
    private double angka1;
    private double angka2;
    private double hasil;
    private char operator;
    
    
    
    public Kalkulator (double angka1, double angka2m, char operator) {
        this.angka1 = angka1;
        this.angka2 = angka2m;
        this.operator = operator;
       
    }
    
   
    public double tambah() {
        return angka1 +angka2;
    }
    public double kuranng() {
        return angka1- angka2;
    }
    public double kali() {
        return angka1 * angka2;
    }
    public double bagi() {
        if (angka2 == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }else {
            return angka1 / angka2;
        }
    }
    public void tampilkanHasil() {
            switch (operator) {
                case '+':
                    hasil = tambah();
                    break;
                case '-':
                    hasil = kuranng();
                    break;
                case '*':
                    hasil = kali();
                    break;
                case '/':
                    hasil = bagi();
                    break;
                default:
                    System.out.println("Operator tidak valid");
                    return;
            }
            System.out.println("Hasil: "+angka1 + " " + operator + " " + angka2 + " = " + hasil);
        
    }
}
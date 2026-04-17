/* Muh. Fatihul Ihsan 
    13020240107
    A3
    16 April 2026 21.00*/
public class Buah {
    private String nama;
    private double harga;
    private int stok;

    public Buah(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public String getInfo() {
        return nama + " Rp " + String.format("%,.0f", harga) + " (Stok: " + stok + " kg )";
    }
    public double hitungTotal(int qty){
        return harga *qty;
    }
    public boolean tersedia (int qty){
        if (qty <= stok){
            stok -= qty;
            return true;
        } else {
            return false;
        }
    }
}

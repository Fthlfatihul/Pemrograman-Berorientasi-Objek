
public class KonversiJam {
    private long totalDetik;
    private long detikSekarang;
    private long totalMenit;
    private long menitSekarang;
    private long totalJam;
    private long jamSekarang;

    public KonversiJam(long totalDetik) {
        this.totalDetik = totalDetik;
    }
    public long hitungDetikSekarang(){
        return detikSekarang = totalDetik % 60;
    }
    public long hitungTotalMenit(){
        return totalMenit = totalDetik / 60;
    }
    public long hitungMenitSekarang(){
        return menitSekarang = totalMenit % 60;
    }
    public long hitungTotalJam(){
        return totalJam = totalMenit / 60;
    }
    public long hitungJamSekarang(){
        return jamSekarang = totalJam % 24;
    }
    public void konversi(){
        hitungDetikSekarang();
        hitungTotalMenit();
        hitungMenitSekarang();
        hitungTotalJam();
        hitungJamSekarang();
    }
    public void tampilkanHasil(){
        System.out.println("==================");
        System.out.println(String.format("Waktu : %02d:%02d:%02d", jamSekarang, menitSekarang, detikSekarang));
        // ("Waktu : "+ jamSekarang + ":" + menitSekarang + ":" + detikSekarang);
        System.out.println("==================");

        System.out.println("\nTotal Detik    : " + totalDetik );
        System.out.println("Detik Saat Ini : " + detikSekarang);
        System.out.println("Menit Saat Ini : " + menitSekarang);
        System.out.println("Jam Saat Ini   : " + jamSekarang);
    }

}
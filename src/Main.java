

// Class utama (Main Class)
public class Main {
    public static void main(String[] args) {
        Pengeluaran pengeluaran = new Pengeluaran(1200000, 250000, 300000, 500000);
        Keuangan keuangan = new Keuangan("Dodo", 3000000, pengeluaran);
        keuangan.tampilkanLaporan();
    }
}

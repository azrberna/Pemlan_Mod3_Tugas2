/**
 * Kelas sederhana tanpa konsep OOP untuk menampilkan laporan pengeluaran bulanan.
 * Berfungsi sebagai versi non-objek dari program utama.
 *
 * @author Dodo
 * @version 1.0
 */
public class PengeluaranBulanan {
    /**
     * Titik masuk utama untuk menjalankan versi sederhana laporan pengeluaran.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        String nama = "Dodo";
        double makan = 1200000;
        double transport = 250000;
        double main = 300000;
        double skincare = 500000;
        double total = makan + transport + main + skincare;
        double sisa = 3000000 - total;

        System.out.println("Nama: " + nama);
        System.out.println("Pengeluaran Makan: " + makan);
        System.out.println("Pengeluaran Transport: " + transport);
        System.out.println("Pengeluaran Main: " + main);
        System.out.println("Pengeluaran Skincare: " + skincare);
        System.out.println("Total Pengeluaran: " + total);
        System.out.println("Sisa Uang: " + sisa);
    }
}


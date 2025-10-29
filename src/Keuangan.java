/**
 * Kelas Keuangan menyimpan data keuangan seseorang, termasuk pemasukan dan pengeluaran.
 * Juga berfungsi untuk menampilkan laporan keuangan dan menghitung sisa uang.
 *
 * <p>Refactoring yang digunakan:
 * <ul>
 *   <li><b>Extract Method</b> - memisahkan perhitungan sisa uang.</li>
 *   <li><b>Rename Method</b> - metode diberi nama lebih jelas, seperti tampilkanLaporan().</li>
 * </ul>
 * </p>
 *
 * @author Dodo
 * @version 1.0
 */
class Keuangan {
    private String nama;
    private double pemasukan;
    private Pengeluaran pengeluaran;

    /**
     * Konstruktor untuk membuat objek Keuangan.
     *
     * @param nama nama pemilik keuangan
     * @param pemasukan jumlah pemasukan yang diterima
     * @param pengeluaran objek Pengeluaran yang berisi rincian pengeluaran
     */
    public Keuangan(String nama, double pemasukan, Pengeluaran pengeluaran) {
        this.nama = nama;
        this.pemasukan = pemasukan;
        this.pengeluaran = pengeluaran;
    }

    /**
     * Menghitung sisa uang dengan mengurangi total pengeluaran dari pemasukan.
     *
     * @return sisa uang yang dimiliki
     */
    // Extract Method — menghitung sisa uang
    public double hitungSisaUang() {
        return pemasukan - pengeluaran.getTotalPengeluaran();
    }

    /**
     * Menampilkan laporan keuangan lengkap ke layar.
     * Termasuk rincian pengeluaran dan sisa uang.
     */
    // Rename Method agar lebih jelas
    public void tampilkanLaporan() {
        System.out.println("Nama: " + nama);
        pengeluaran.tampilkanRincian();
        System.out.println("Sisa Uang: " + hitungSisaUang());
    }
}